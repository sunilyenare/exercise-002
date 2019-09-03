package com.thoughtworks.geometory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangleOfLengthZeroWidthZero;
    private Rectangle rectangleOfLengthOneWidthOne;
    @BeforeEach
    void setUp() {
        rectangleOfLengthZeroWidthZero = Rectangle.rectangle(0.0f,0.0f);
        rectangleOfLengthOneWidthOne = Rectangle.rectangle(1.0f,1.0f);
    }

    @Test
    void givenZeroLengthAndWidth_whenCalculateArea_thenShouldReturnZero() {
        Assertions.assertEquals(0, rectangleOfLengthZeroWidthZero.area());
    }

    @Test
    void givenLengthOneAndWidthOne_whenCalculateArea_thenShouldReturnArea() {
        Assertions.assertEquals(1.0f, rectangleOfLengthOneWidthOne.area());
    }

    @Test
    void givenZeroLengthAndNonZeroWidth_whenCalculateArea_thenReturnAreaZero() {
        Rectangle rectangleOfLengthZeroWidthZero = new Rectangle(0.f, 1.0f);
        Assertions.assertEquals(0.0f, rectangleOfLengthZeroWidthZero.area());
    }

    @Test
    void givenZeroLengthAndWidth_WhenCalculatePerameter_ThenShouldReturnZero() {

        Rectangle rectangle = new Rectangle(0.f, 0.0f);
        Assertions.assertEquals(0.0f, rectangle.perimeter());
    }
}
