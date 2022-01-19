Bean 定义

- @SpringBootApplication
标注 Spring 程序的启动类，其是一个复合注解，其包含了 @ComponentScan 注解，用来标注需要扫描哪些 Bean。
  
- 缺少隐氏依赖
在 Bean 的定义中，定义了有参构造函数，在 Bean 装配时就会去寻找对应的 Bean，如果找不到，就会报错
  
可以将对应的参数定义成 Bean 来装配，或者让 Bean 有无参构造函数，即默认构造函数。

拓展：
1. 在构造函数找不到对应的 Bean 时一定会报错吗？
不一定，可以采用延迟加载的形式，只有在实际使用的时候才会去获取 Bean。

- 原型 Bean 被固定
定义 Bean 的生命周期为 Prototype，但是在实际应用中发现每次都是同一个。
  
原因：
在使用 @Autowired 来装配 Prototype：bean 时，会被固定到对应 Bean 中，而不会因为标注了 prototype 而影响。

解决：
1. 使用 ApplicationContext 来获取 Bean。
使用 ApplcationContext.getBean(A.class) 来获取 Bean。
   
2. 使用 @lookup 注解
lookup 注解其实现原理是在实际获取 Bean 的时候，采用 BeanFactory.getBean() 来获取 Bean 的。
   

  


