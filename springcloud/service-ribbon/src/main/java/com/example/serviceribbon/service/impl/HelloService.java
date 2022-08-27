package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.IHelloService;
import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description
 * Date 2020/7/5 9:51
 * Created by kwz
 */
@Service
public class HelloService implements IHelloService {

    @Setter(onMethod_ = @Autowired)
    private RestTemplate restTemplate;

    /**
     * Description
     * V1:直接通过注册中心注册的服务名进行访问
     * <p>
     * V2版本：加入熔断技术 @HystrixCommand注解
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符
     * 串，字符串为”hello,”+name+”,sorry,error!”,我们将SERVICE-CLIENT服务关了之后就会进入熔断了。
     *
     * 通过加入Hystrix组件，在调用 service-hi的API接口时，会执行快速失败，直接返回一组字符串，而不是
     * 等待响应超时，这很好的控制了容器的线程阻塞。
     * Param [name]
     * return java.lang.String
     */
    @Override
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/client/hello?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hello," + name + ", sorry, error!";
    }
}
