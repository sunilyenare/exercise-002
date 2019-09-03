package com.thoughtworks.geometory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.geometory.Rectangle.createRectangle;
import static com.thoughtworks.geometory.Rectangle.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    private static Rectangle rectangleOfLengthZeroWidthZero;
    private static Rectangle rectangleOfLengthOneWidthOne;
    private static Rectangle rectangleOfLengthTwoWidthThree;
    private static Rectangle squareOfSizeZero;
    private static Rectangle squareOfSizeTwo;

    @BeforeAll
    static void setUp() {
        rectangleOfLengthZeroWidthZero = createRectangle(0.0f, 0.0f);
        rectangleOfLengthOneWidthOne = createRectangle(1.0f, 1.0f);
        rectangleOfLengthTwoWidthThree = createRectangle(2.0f, 3.0f);
        squareOfSizeZero = createSquare(0.0f);
        squareOfSizeTwo = createSquare(2.0f);
    }

    @Test
    void givenZeroLengthAndWidth_whenCalculateArea_thenShouldReturnZero() {
        assertEquals(0, rectangleOfLengthZeroWidthZero.area());
    }

    @Test
    void givenLengthOneAndWidthOne_whenCalculateArea_thenShouldReturnOne() {
        assertEquals(1.0f, rectangleOfLengthOneWidthOne.area());
    }

    @Test
    void givenLengthTwoAndWidthThree_whenCalculateArea_thenReturnAreaSix() {
        assertEquals(6.0f, rectangleOfLengthTwoWidthThree.area());
    }

    @Test
    void givenZeroLengthAndWidth_WhenCalculatePerimeter_ThenShouldReturnZero() {

        assertEquals(0.0f, rectangleOfLengthZeroWidthZero.perimeter());
    }

    @Test
    void givenLengthOneAndWidthOne_whenCalculatePerimeter_thenShouldReturnFour() {
        assertEquals(4.0f, rectangleOfLengthOneWidthOne.perimeter());
    }

    @Test
    void givenLengthTwoAndWidthThree_whenCalculatePerimeter_thenReturnTen() {
        assertEquals(10.0f, rectangleOfLengthTwoWidthThree.perimeter());
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
