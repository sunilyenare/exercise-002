package com.thoughtworks.geometory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void givenZeroSizeSquare_WhenCalculateArea_thenShouldReturnZero() {
        float size = 0.0f;
        RectangleOrSquare square = ShapeFactory.getSquare(size);
        assertEquals(0.0f, square.area());
    }

    @Test
    void givenTwoSizeSquare_WhenCalculateArea_thenShouldReturnFour() {
        float size = 2.0f;
        RectangleOrSquare square = ShapeFactory.getSquare(size);
        assertEquals(4.0f, square.area());
    }
    @Test
    void givenZeroSizeSquare_WhenCalculatePerimeter_thenShouldReturnZero() {
        float size = 0.0f;
        RectangleOrSquare square = ShapeFactory.getSquare(size);
        assertEquals(0.0f, square.perimeter());
    }
    @Test
    void givenTwoSizeSquare_WhenCalculatePerimeter_thenShouldReturnEight() {
        float size = 2.0f;
        RectangleOrSquare square = ShapeFactory.getSquare(size);
        assertEquals(8.0f, square.perimeter());
    }
}
