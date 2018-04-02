package ru.itpark.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.handler.GenericHandler;

import java.util.Map;

@Configuration
public class IntegrationConfig {
    @Bean
    public DirectChannel requestChannel(){
        return new DirectChannel();
    }

    @Bean
    public IntegrationFlow taskFlow(){
        return IntegrationFlows.from(
                Object::new,
                c -> c.poller(Pollers.fixedRate(50001))
        ).channel(requestChannel())
                .get();
    }



    @Bean IntegrationFlow sqampelflow() {
        return IntegrationFlows.from(requestChannel())
                .handle((o, map) -> null)
                .get();
    }
}
