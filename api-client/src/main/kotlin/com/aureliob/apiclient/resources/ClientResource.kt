package com.aureliob.apiclient.resources

import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/analysis")
class ClientResource {

    private val restTemplate = RestTemplate()

    @RequestMapping("/{name}", method = [RequestMethod.GET])
    fun getUsersWithName(@PathVariable name: String) = restTemplate
                .getForObject("http://localhost:8500/users/$name",String::class.java)

}
