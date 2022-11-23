package com.kelaskoding.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ResponseData<T> {
    private boolean status;
    private List<String> messages = new ArrayList<>();
    private T payload;
}
