package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy //标识开启网关
@EnableEurekaClient //标识为Eureka客户端
public class ZuulApplication{

    public static void main( String[] args ) {

        SpringApplication.run(ZuulApplication.class,args);
    }
}
