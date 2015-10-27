package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by jt on 10/27/15.
 */
@Configuration
public class HelloConfig {

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceSpanishImpl();
    }
}
