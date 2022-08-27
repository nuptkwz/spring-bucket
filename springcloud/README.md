# Spring-Family-Bucket
spring family bucket learning example
## Spring Cloud Family Bucket Learning
### eureka-client
Eureka作为服务注册与发现的组件,Eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向
注册中心发送心跳（因此可以在内存中完成），在默认情况下Eureka server也是一个eureka client ,
必须要指定一个 server
### eureka-server
eureka.client.registerWithEureka：false和fetchRegistry：false来表明自己是一个eureka server
### service-ribbon
ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为,Feign默认集成了ribbon。
## service-feign
Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单,通过feign进行第三方服务的调用。
## Hystrix
为解决服务与服务之间的依赖性，故障传播，对整个微服务系统造成灾难性的严重后果，造成服务故障的“雪崩”效应。
而引入了熔断技术。熔断技术可用于避免连锁故障。
### 在ribbon使用断路器
### 在Feign中使用断路器
## Zuul
Zuul的主要功能是路由转发和过滤器。zuul和Ribbon结合实现了负载均衡的功能。
## Spring Cloud Config(config server and config client)

## Spring Boot Learning
