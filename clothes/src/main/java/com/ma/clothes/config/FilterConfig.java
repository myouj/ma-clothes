//package com.ma.clothes.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class FilterConfig {
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new CorsFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.setName("corsFilter");
//        filterRegistrationBean.setOrder(1);
//        return filterRegistrationBean;
//    }
//}
