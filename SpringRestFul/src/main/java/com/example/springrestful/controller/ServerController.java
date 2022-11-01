package com.example.springrestful.controller;

import com.example.springrestful.entity.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by 吴文涛 on  2022/11/1 22:48
 *
 * @author 吴文涛
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/get")
public class ServerController {
    private ObjectMapper objectMapper=new ObjectMapper();
    @GetMapping
    public String getNews() throws JsonProcessingException {
        Message message = new Message(UUID.randomUUID().toString(), "hello,world", "9999");

        return objectMapper.writeValueAsString(message);

    }
}
