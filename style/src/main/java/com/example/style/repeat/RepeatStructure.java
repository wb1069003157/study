package com.example.style.repeat;

/**
 * @Author iceWang
 * @Date 2021/8/3
 * @Description
 **/
public class RepeatStructure {
    public static void main(String[] args) {
        RepeatStructure repeatStructure = new RepeatStructure();
        repeatStructure.sayHello();
        repeatStructure.sayHi();

        repeatStructure.executeSay(repeatStructure::reconstrucedSayHello);
        repeatStructure.executeSay(repeatStructure::reconstrucedSayHi);
    }


    public void executeSay(Runnable runnable){
        try {
            runnable.run();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void reconstrucedSayHello(){
        System.out.println("Hello");
    }
    public void reconstrucedSayHi(){
        System.out.println("Hi");
    }

    public void sayHello(){
        try {
            System.out.println("Hello");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void sayHi(){
        try {
            System.out.println("Hi");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
