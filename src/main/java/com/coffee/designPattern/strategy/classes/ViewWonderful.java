package com.coffee.designPattern.strategy.classes;

import com.coffee.designPattern.strategy.interfaces.IView;

public class ViewWonderful implements IView {
    @Override
    public String myView() {
        return "my view is wonderful!";
    }
}
