package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo
{
    public void show()
    {
        Circle circle = new Circle();
        Circle circle1 = new Circle();

        List<Circle> circleList = new ArrayList<>();
        circleList.add(circle);
        circleList.add(circle1);

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(rectangle);
        rectangleList.add(rectangle1);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);

        Canvas canvas = new Canvas();
        System.out.println("canvas.drawAll");
        canvas.drawAll(shapeList);

        //編譯錯誤
        //canvas.drawAll(rectangleList);
        //canvas.drawAll(circleList);

        //編譯成功
        System.out.println("canvas.drawAllBoundedWildcard");
        canvas.drawAllBoundedWildcard(rectangleList);
        canvas.drawAllBoundedWildcard(circleList);
    }




}
