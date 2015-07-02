package com.redbee.domain

/**
 * Created by redbee on 01/07/15.
 */
@Singleton
class TodoList {

    List listaTareas = []

    void agregarTarea(String descripcion){

        ToDo todo = new ToDo(done:false, descripcion:descripcion, fechacreacion: new Date())

        listaTareas << todo
    }

}
