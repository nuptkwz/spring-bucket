package com.example.servicezuul.configuration;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Description
 * Zuul除了可以作为路由之外，还能过滤，本类模拟了zuul的过滤功能，可以用于安全验证等
 * Date 2020/7/5 17:46
 * Created by kwz
 */
@Component
@Slf4j
public class MyFilter extends ZuulFilter {

    /**
     * Description
     * filterType:返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * <p>
     * return java.lang.String
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * Description
     * 过滤的顺序
     * <p>
     * return int
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * Description
     * 这里可以写逻辑判断，是否要过滤，true表示永远过滤，默认false。
     * <p>
     * return boolean
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * Description
     * 过滤器内部的具体逻辑
     * return java.lang.Object
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info("request:" + request.toString());
        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            log.warn("token is empty");
            currentContext.setSendZuulResponse(Boolean.FALSE);
            currentContext.setResponseStatusCode(401);

            try {
                currentContext.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                log.error("currentContext ioException:{}", e.getMessage());
            }
        }
        return null;
    }
}
