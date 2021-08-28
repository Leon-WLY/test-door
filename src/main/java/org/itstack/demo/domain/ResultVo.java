package org.itstack.demo.domain;

import lombok.Data;

@Data
public class ResultVo {
    private String code;
    private String message;
    private Object data;
}
