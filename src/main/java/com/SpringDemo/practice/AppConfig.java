package com.SpringDemo.practice;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
	@Bean
	public Bean1 bean1() {
		return new Bean1("Mia","10000000","Starrrr");
	}
	@Bean
    public Bean1 bean2() {
        return new Bean1("Jane Smith", "6000", "Data Scientist");
    }

    @Bean
    public Bean1 bean3() {
        return new Bean1("Alice Johnson", "5500", "QA Engineer");
    }

    @Bean
    public Bean1 bean4() {
        return new Bean1("Bob Williams", "5200", "DevOps Engineer");
    }

    @Bean
    public Bean1 bean5() {
        return new Bean1("Eva Davis", "5300", "UI Designer");
    }
}
