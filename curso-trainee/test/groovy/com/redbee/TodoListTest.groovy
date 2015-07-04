package com.redbee

import com.redbee.curso.trainee.TodoList
import spock.lang.Specification

/**
 * Created by redbee on 29/06/15.
 */
class TodoListTest extends Specification {

    def "que al agregar una tarea a una lista vacia el tamaño sea uno"(){

        setup:
        def todoList = new TodoList(listaTareas: [])

        when:
        todoList.agregarTarea([done:false, task:'mi primer tarea'])

        then:
        todoList.cantidadTareasSinFinalizar() == 1
    }

    def "no hay tareas finalizadas"(){

        setup:
        def todoList = new TodoList(listaTareas: [])

        when:
        todoList.agregarTarea([done:false, task:'mi primer tarea'])

        then:
        todoList.tareasFinalizadas() == 0
    }

    def "Hay dos tareas finalizadas"(){

        setup:
        def todoList = new TodoList(listaTareas: [])

        when:
        todoList.agregarTarea([done:true, task:'mi primer tarea'])
        todoList.agregarTarea([done:true, task:'mi segunda tarea'])

        then:
        todoList.tareasFinalizadas() == 2
    }

}
