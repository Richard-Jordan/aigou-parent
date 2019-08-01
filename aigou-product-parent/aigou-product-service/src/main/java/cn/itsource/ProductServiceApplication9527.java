package cn.itsource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@MapperScan("cn.itsource.mapper")
public class ProductServiceApplication9527 {

    public static void main( String[] args ) {

        SpringApplication.run(ProductServiceApplication9527.class,args);
    }
}
