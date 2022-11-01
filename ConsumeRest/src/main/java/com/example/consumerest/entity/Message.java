package com.example.consumerest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 吴文涛 on  2022/11/1 23:03
 *
 * @author 吴文涛
 * @version 1.0
 * @since 1.0
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private String id;
    private String msg;
    private String code;
}

