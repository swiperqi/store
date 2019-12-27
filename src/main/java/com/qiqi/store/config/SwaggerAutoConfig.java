package com.qiqi.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author qiqi
 * @date 2019/12/26 0026
 */

@Configuration
@EnableSwagger2
public class SwaggerAutoConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("ElasticsearchTest")
                .apiInfo(initApiInfo())
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(true)
                .forCodeGeneration(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qiqi.store.controller"))
                .build();
    }

    private ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("Elasticsearch demo")
                .description("Elasticsearch基本操作")
                .version("1.0")
                .build();
    }
}
