package com.sky.config;

import com.sky.properties.MinioProperties;
import io.minio.MinioClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 君禾
 * @version 1.0
 */
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
@Slf4j
public class MinioConfiguration {
    @Autowired
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder().endpoint(minioProperties.getEndpoint()).
                credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey()).build();
    }
}
