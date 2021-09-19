package com.kotgr.learningapp.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors.any
import springfox.documentation.builders.RequestHandlerSelectors.basePackage
import springfox.documentation.spi.DocumentationType.SWAGGER_2
import springfox.documentation.spring.web.plugins.Docket

/**
 * SwaggerConfig.
 * @author Ephanov Ivan
 */
@Configuration
class SwaggerConfig {
    @Bean
    fun api(): Docket {
        return Docket(SWAGGER_2)
                .select()
                .apis(basePackage("com.kotgr.learningapp.controller"))
                .paths(any())
                .build()
    }
}