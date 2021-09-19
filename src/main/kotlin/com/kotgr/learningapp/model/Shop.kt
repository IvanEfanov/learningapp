package com.kotgr.learningapp.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.AUTO
import javax.persistence.Id

@Entity
data class Shop(
        @Id
        @GeneratedValue(strategy = AUTO)
        var id: Long = -1L,

        @Column(name ="name")
        var name: String = "",

        @Column(name ="address")
        var address: String = "",

        @Column(name ="phone")
        var phone: String = ""
)