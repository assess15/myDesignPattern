package com.laychv.design.structural.DecoratorPattern.demo2;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        System.out.println("Border Color : Red");
    }

}
