package com.thoughtworks.geometory;

public class RectangleOrSquare {

    private float length;
    private float width;

    RectangleOrSquare(float length, float width) {
        this.length = length;
        this.width = width;
    }

    float area() {

        return length * width;
    }

    public float perimeter() {
        return 0.0f;
    }
}
