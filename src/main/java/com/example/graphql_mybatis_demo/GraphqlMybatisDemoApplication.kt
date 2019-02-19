package com.example.graphql_mybatis_demo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@MapperScan("com.example.graphql_mybatis_demo.dao")
open class GraphqlMybatisDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(GraphqlMybatisDemoApplication::class.java, *args)
}


