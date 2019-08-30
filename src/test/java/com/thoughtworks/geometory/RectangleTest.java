package com.thoughtworks.geometory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void givenZeroLengthAndWidth_whenCalculateArea_thenShouldReturnZero(){

        Rectangles rectangle=new Rectangles(0.0f,0.0f);

        Assertions.assertEquals(0,rectangle.area());
    }
    @Test
    void givenLengthAndWidth_whenCalculateArea_thenShouldReturnArea(){
        Rectangles rectangle=new Rectangles(1.0f,1.0f);

        Assertions.assertEquals(1.0f,rectangle.area());
    }

    @Test
    void givenZeroLengthAndNonZeroWidth_whenCalculateArea_thenReturnAreaZero(){
        Rectangles rectangle=new Rectangles(0.f,1.0f);
        Assertions.assertEquals(0.0f,rectangle.area());
    }
}
