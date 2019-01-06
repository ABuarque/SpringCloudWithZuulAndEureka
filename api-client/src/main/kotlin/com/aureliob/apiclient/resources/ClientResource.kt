package com.aureliob.apiclient.resources

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/analysis")
class ClientResource {
    
    @Autowired
    private lateinit var restTemplate: RestTemplate

    @RequestMapping("/{name}", method = [RequestMethod.GET])
    fun getUsersWithName(@PathVariable name: String) = restTemplate
                .getForObject("http://api-server/users/$name",String::class.java)

}
