package com.thoughtworks.geometory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.geometory.Rectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    private static Rectangle squareOfSizeZero;
    private static Rectangle squareOfSizeTwo;

    @BeforeAll
    static void setUp() {
        squareOfSizeZero = createSquare(0.0f);
        squareOfSizeTwo = createSquare(2.0f);
    }

    @Test
    void givenZeroSizeSquare_WhenCalculateArea_thenShouldReturnZero() {
        assertEquals(0.0f, squareOfSizeZero.area());
    }

    @Test
    void givenTwoSizeSquare_WhenCalculateArea_thenShouldReturnFour() {
        assertEquals(4.0f, squareOfSizeTwo.area());
    }

    @Test
    void givenZeroSizeSquare_WhenCalculatePerimeter_thenShouldReturnZero() {
        assertEquals(0.0f, squareOfSizeZero.perimeter());
    }

    @Test
    void givenTwoSizeSquare_WhenCalculatePerimeter_thenShouldReturnEight() {
        assertEquals(8.0f, squareOfSizeTwo.perimeter());
    }
}
