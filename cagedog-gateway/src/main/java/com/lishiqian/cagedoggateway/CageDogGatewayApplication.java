package com.lishiqian.cagedoggateway;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
@EnableDubbo
@ComponentScan(basePackages = "com.lishiqian")
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CageDogGatewayApplication {

//    @DubboReference
//    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(CageDogGatewayApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(CageDogGatewayApplication.class, args);
//        CageDogGatewayApplication application = context.getBean(CageDogGatewayApplication.class);
//        String result = application.doSayHello("mengxing");
//        String result2 = application.doSayHello2("lishiqian");
//        System.out.println("result" + result);
//        System.out.println("result2" + result2);

    }
//
//    public String doSayHello(String name){
//        return demoService.sayHello(name);
//    }
//
//    public String doSayHello2(String name){
//        return demoService.sayHello2(name);
//    }

}
