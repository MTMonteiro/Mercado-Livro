package com.mercadolivro.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
//path padrão
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun helloWorld(): String {
        return "customer 1"
    }

    //sub path
    @GetMapping("/2")
    fun customer2(): String {
        return "customer 2"
    }
}