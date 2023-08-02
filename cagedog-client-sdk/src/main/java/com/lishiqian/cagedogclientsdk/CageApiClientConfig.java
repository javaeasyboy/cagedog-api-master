package com.lishiqian.cagedogclientsdk;

import com.lishiqian.cagedogclientsdk.client.CageDogClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("cage.client")
@Data
@ComponentScan
public class CageApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public CageDogClient cageApiClient (){
        return new CageDogClient(accessKey, secretKey);

    }
}
