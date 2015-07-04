package com.redbee.curso.trainee

/**
 * Created by redbee on 29/06/15.
 */
class TodoList {

    def listaTareas

    void agregarTarea(unaTarea){

        listaTareas << unaTarea
    }

    Integer cantidadTareasSinFinalizar(){
        listaTareas.count{unaTarea -> !unaTarea.done}
    }

    Integer tareasFinalizadas(){
        listaTareas.count{unaTarea->unaTarea.done}
    }

}
