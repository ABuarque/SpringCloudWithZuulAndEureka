package com.aureliob.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
class GatewayApplication

fun main(args: Array<String>) {
    runApplication<GatewayApplication>(*args)
}

