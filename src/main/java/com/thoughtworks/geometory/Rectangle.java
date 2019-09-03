package com.thoughtworks.geometory;

public class Rectangle {

    private float length;
    private float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle rectangle(float length, float breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(float size) {
        return new Rectangle(size, size);
    }

    public float area() {
        return length * width;
    }

    public float perimeter() {
        return 2 * (length + width);
    }
}
