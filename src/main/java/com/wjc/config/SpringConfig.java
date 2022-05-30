package com.wjc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.wjc")
@PropertySource("jdbc.properties")
@Import({jdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
