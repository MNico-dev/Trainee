package com.redbee.controllers

import com.redbee.domain.TodoList
import org.junit.Before
import org.junit.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Created by redbee on 01/07/15.
 */
class TaskControllersTest {
    //desde aca
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception{

        mvc = MockMvcBuilders.standaloneSetup(new TaskController()).build();

    }
    //hasta aca
    @Test
    void "que pueda agregar una tarea"(){
        //desde aca
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.post("/task")
                .param("task", "una Tarea")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        assertEquals(1, TodoList.instance.listaTareas.size());
    }

    @Test
    void "que devuelva una lista de tareas"(){
        //desde aca
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get("/task")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}
