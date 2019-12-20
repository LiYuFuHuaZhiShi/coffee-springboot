package com.xpf.coffee.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.xpf.coffee")) // 必须存在
				.paths(PathSelectors.any()).build();}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Spring 中使用 Swagger2 构建 RESTful APIs") // 标题
				.description("swagger2") // 描述
				.contact(new Contact("糯米糍", "http://www.nuomici.xyz", "512918623@qq.com")).version("1.0") // 版本
				.build();}
}