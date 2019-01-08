package com.aureliob.apiclient.resources

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/analysis")
class ClientResource {

    //@Autowired
    //private lateinit var restTemplate: RestTemplate
    private val restTemplate = RestTemplate()

    private companion object {
        val SERVER_HOST = System.getenv("SERVER_HOST") ?: "localhost"
        val SERVER_PORT = System.getenv("SERVER_PORT") ?: "8500"
        val SERVER_ENDPOINT = "http://$SERVER_HOST:$SERVER_PORT"
    }

    @RequestMapping("/{name}", method = [RequestMethod.GET])
    fun getUsersWithName(@PathVariable name: String) = restTemplate
                .getForObject("$SERVER_ENDPOINT/users/$name", String::class.java)

}
