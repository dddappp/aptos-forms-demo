package org.test.aptosformsdemo.restful.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;

@Configuration
public class OffChainConfig {

    @Bean
    public OkHttpClient okHttpClient() throws MalformedURLException {
        return new OkHttpClient();
    }

}
