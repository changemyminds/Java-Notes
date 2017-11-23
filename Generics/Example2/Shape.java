package com.company;

import java.util.List;

public abstract class Shape
{
    public abstract void draw(Canvas c);
}


class Circle extends Shape
{
    @Override
    public void draw(Canvas c) {
        System.out.println(c.getCanvas() + " draw Circle");
    }
}

class Rectangle extends Shape
{

    @Override
    public void draw(Canvas c) {
        System.out.println(c.getCanvas() + " draw Rectangle");
    }
}


class Canvas
{
    private String mCanvas;
    public Canvas()
    {
        mCanvas = "畫布";
    }

    public void draw(Shape s)
    {
        s.draw(this);
    }

    public String getCanvas() {
        return mCanvas;
    }

    public void drawAll(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }

    /**
     *
     * @param shapes 使用bounded wildcard(限制通用型別)，只能使用shape型別的衍伸類別。
     *
     * */
    public void drawAllBoundedWildcard(List<? extends Shape> shapes)
    {
        for (Shape s : shapes) {
            s.draw(this);
        }
    }


}



















