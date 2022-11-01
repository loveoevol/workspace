package com.example.springrestful.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by 吴文涛 on  2022/11/1 22:52
 *
 * @author 吴文涛
 * @version 1.0
 * @since 1.0
 */


@Data
@AllArgsConstructor
public class Message {
    private String id;
    private String msg;
    private String code;
}
