package com.base.base.concurrent.actor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedAbstractActor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author iceWang
 * @Date 2022/1/20
 * @Description
 **/
@Slf4j
public class DemoActor {

    static class CounterActor extends UntypedAbstractActor {

        private int counter = 0;

        @Override
        public void onReceive(Object message) throws Throwable {
            if (message instanceof Number) {
                counter = counter + ((Number) message).intValue();
            } else {
                log.info("counter:{}", counter);
            }
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        //
        ActorSystem system = ActorSystem.create();
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        ActorRef counterActor = system.actorOf(Props.create(CounterActor.class));

        for (int i = 0; i < 4; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 1000000; j++) {
                    counterActor.tell(1, ActorRef.noSender());
                }
            });
        }

        Thread.sleep(10000);

        counterActor.tell("", ActorRef.noSender());

        threadPool.shutdown();
        system.stop(counterActor);
    }
}
