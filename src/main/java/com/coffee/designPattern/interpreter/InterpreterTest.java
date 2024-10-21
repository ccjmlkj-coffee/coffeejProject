package com.coffee.designPattern.interpreter;

import com.coffee.designPattern.interpreter.impl.AndExpression;
import com.coffee.designPattern.interpreter.impl.OrExpression;
import com.coffee.designPattern.interpreter.impl.TerminalExpression;

public class InterpreterTest {


    public static void main(String[] args) {
        TerminalExpression makaijian = new TerminalExpression("makaijian , not to m");
        TerminalExpression fangjiahui = new TerminalExpression("fangjiahui , marry");
        System.out.println("result1 :"+makaijian.interpreter("makaijian"));
        System.out.println("result2 :"+fangjiahui.interpreter("makaijian"));
        AndExpression andExpression = new AndExpression(makaijian,fangjiahui);
        OrExpression orExpression = new OrExpression(makaijian,fangjiahui);
        System.out.println("result3 :"+andExpression.interpreter("makaijian"));
        System.out.println("result4 :"+orExpression.interpreter("fangjiahui"));
    }

}
