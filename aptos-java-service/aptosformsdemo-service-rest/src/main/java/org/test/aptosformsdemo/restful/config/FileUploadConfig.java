//package org.test.aptosformsdemo.restful.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//
//@Configuration
//public class FileUploadConfig {
//
//    @Bean
//    public CommonsMultipartResolver multipartResolver() {
//        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//        resolver.setDefaultEncoding("utf-8");
//        // Set the maximum size of the file upload to 2MB?
//        resolver.setMaxUploadSize(2 * 1024 * 1024);
//        return resolver;
//    }
//}