package com.thoughtworks.geometory;

public class ShapeFactory {
    public static RectangleOrSquare getRectangle(float length, float breadth) {
        return new RectangleOrSquare(length, breadth);
    }

    public static RectangleOrSquare getSquare(float size) {
        return new RectangleOrSquare(size, size);
    }
}
