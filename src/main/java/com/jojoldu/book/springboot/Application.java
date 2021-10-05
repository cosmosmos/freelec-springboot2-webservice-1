package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import  org.springframework.boot.autoconfigure.
        SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//메인클래스

@SpringBootApplication //스프링부트의 자동설정,Bean읽기,생성 모두 자동설정 (이 위치부터 읽기때문에 항상프로젝트상단에위치)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }


}
