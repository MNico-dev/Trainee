package com.redbee.controllers

import com.redbee.domain.ToDo
import com.redbee.domain.TodoList
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by redbee on 01/07/15.
 */
@RestController
@RequestMapping(value = "/task")
class TaskController {

    @RequestMapping(method = RequestMethod.POST)
    def agregarTarea(@RequestParam("task") String tarea){

        TodoList.instance.agregarTarea(tarea)
    }

    @RequestMapping(method = RequestMethod.GET)
    def devolverListado(){

        TodoList.instance.listaTareas
    }

}
