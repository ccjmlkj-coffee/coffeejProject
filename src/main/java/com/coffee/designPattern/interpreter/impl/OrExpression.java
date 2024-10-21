package com.coffee.designPattern.interpreter.impl;

import com.coffee.designPattern.interpreter.Expression;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrExpression implements Expression {
    Expression expression1;
    Expression expression2;
    @Override
    public boolean interpreter(String content) {
        return expression1.interpreter(content) || expression2.interpreter(content);
    }
}
