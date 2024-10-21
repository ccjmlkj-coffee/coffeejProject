package com.coffee.designPattern.interpreter.impl;

import com.coffee.designPattern.interpreter.Expression;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;


    @Override
    public boolean interpreter(String content) {
        return data.contains(content);
    }
}
