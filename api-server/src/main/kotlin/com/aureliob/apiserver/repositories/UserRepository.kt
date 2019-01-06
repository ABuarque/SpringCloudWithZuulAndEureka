package com.aureliob.apiserver.repositories

import com.aureliob.apiserver.models.UserDAO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserDAO, Long> {

    fun findByName(name: String): MutableList<UserDAO>
}
