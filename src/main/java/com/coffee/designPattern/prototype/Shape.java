package com.coffee.designPattern.prototype;

public abstract class Shape implements Cloneable {
    public int id;
    public String type;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

    public abstract void draw();


    @Override
    public Shape clone() {
        Object object = null;
        try {
            object = (Shape) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Shape) object;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
