package com.redbee.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by redbee on 01/07/15.
 */

@RestController
class HelloController {

    @RequestMapping("/hello")
    def saludar() {
        'Hola como estás?'
    }
}
