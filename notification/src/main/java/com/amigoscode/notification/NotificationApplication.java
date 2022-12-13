package com.amigoscode.notification;

import com.amigoscode.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "com.amigoscode.notification",
                "com.amigoscode.amqp",
        }
)
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    // testing the queue
//    @Bean
//    CommandLineRunner cmdlr(RabbitMQMessageProducer producer, NotificationConfig config){
//        return args ->{
//            producer.publish(new Person("Ali", 18), config.getInternalExchange(), config.getInternalNotificationRoutingKey());
//        };
//    }
//
//    record Person(String name, int age){}
}
