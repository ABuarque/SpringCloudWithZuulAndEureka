package com.aureliob.apiserver.resources

import com.aureliob.apiserver.models.UserDAO
import com.aureliob.apiserver.models.UserDTO
import com.aureliob.apiserver.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UsersResource {

    @Autowired
    private lateinit var userRepository: UserRepository

    @RequestMapping("/{name}", method = [RequestMethod.GET])
    fun getByName(@PathVariable name: String) = userRepository.findByName(name)

    @RequestMapping(method = [RequestMethod.POST])
    fun addUser(@RequestBody userDTO: UserDTO) = userRepository.save(UserDAO(name = userDTO.name, email = userDTO.email))

}
