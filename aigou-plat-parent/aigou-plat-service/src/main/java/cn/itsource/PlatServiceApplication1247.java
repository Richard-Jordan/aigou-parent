package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient //开启eureka的支持
public class PlatServiceApplication1247 {

    public static void main( String[] args ) {

        SpringApplication.run(PlatServiceApplication1247.class,args);
    }
}
