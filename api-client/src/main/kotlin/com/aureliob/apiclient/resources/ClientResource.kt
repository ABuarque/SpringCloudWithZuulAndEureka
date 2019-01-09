package com.aureliob.apiclient.resources

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/analysis")
class ClientResource {

    //@Autowired
    //private lateinit var restTemplate: RestTemplate
    private val restTemplate = RestTemplate()

    @Value("\${my_value}")
    private val my_value: String? = null

    private companion object {
        val SERVER_HOST = System.getenv("MY_SERVER_HOST") ?: "localhost"
        val SERVER_PORT = System.getenv("MY_SERVER_PORT") ?: "vaca"
        //val SERVER_ENDPOINT = "http://$SERVER_HOST:$SERVER_PORT"
        val API_ENDPOINT = System.getenv("MY_VALUE") ?: "http://localhost:8500"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun online(): String {
        //println("SERVER_ENDPOINT: $SERVER_ENDPOINT")
        println("API_ENDPOINT: $API_ENDPOINT")
        println("VALUE: $my_value")
        return "online"
    }

    @RequestMapping("/{name}", method = [RequestMethod.GET])
    fun getUsersWithName(@PathVariable name: String): String? {
        println("SERVER_ENDPOINT: $API_ENDPOINT")
        return restTemplate
                .getForObject("$API_ENDPOINT/users/$name", String::class.java)
    }

}
