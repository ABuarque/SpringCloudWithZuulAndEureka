package com.aureliob.apiserver.models

import javax.persistence.*

@Entity
@Table(name = "users")
data class UserDAO(@Id
                   @GeneratedValue(strategy = GenerationType.AUTO)
                   val id: Long = 0,
                   var name: String = "",
                   var email: String = "")
