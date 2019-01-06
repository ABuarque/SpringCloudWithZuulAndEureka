package com.aureliob.apiclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class ApiClientApplication

fun main(args: Array<String>) {
	runApplication<ApiClientApplication>(*args)
}

