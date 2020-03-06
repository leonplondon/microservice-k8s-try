package pro.darkgod.foo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class BeansConfig {

    @Value("${services.bar.url}")
    private String barServiceUrl;

    @Bean("bar-ms")
    public RestTemplate barMsRestTemplate() {
        return new RestTemplateBuilder()
            .rootUri(barServiceUrl)
            .build();
    }
}
