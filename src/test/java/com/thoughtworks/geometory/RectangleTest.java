package com.thoughtworks.geometory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void givenZeroLengthAndWidth_whenCalculateArea_thenShouldReturnZero() {

        RectangleOrSquare rectangle = ShapeFactory.getRectangle(0.0f, 0.0f);

        Assertions.assertEquals(0, rectangle.area());
    }

    @Test
    void givenLengthAndWidth_whenCalculateArea_thenShouldReturnArea() {
        RectangleOrSquare rectangle = new RectangleOrSquare(1.0f, 1.0f);

        Assertions.assertEquals(1.0f, rectangle.area());
    }

    @Test
    void givenZeroLengthAndNonZeroWidth_whenCalculateArea_thenReturnAreaZero() {
        RectangleOrSquare rectangle = new RectangleOrSquare(0.f, 1.0f);
        Assertions.assertEquals(0.0f, rectangle.area());
    }

    @Test
    void givenZeroLengthAndWidth_WhenCalculatePerameter_ThenShouldReturnZero() {

        RectangleOrSquare rectangle = new RectangleOrSquare(0.f, 0.0f);
        Assertions.assertEquals(0.0f, rectangle.perimeter());
    }
}
