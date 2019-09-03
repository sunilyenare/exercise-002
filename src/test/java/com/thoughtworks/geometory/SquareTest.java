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
}
