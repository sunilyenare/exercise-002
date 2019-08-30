package com.thoughtworks.geometory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Geometory {

    @Test
    void givenZeroLengthAndWidth_whenArea_thenShouldReturnZero(){

        Rectangles rect=new Rectangles(0.0f,0.0f);

        Assertions.assertEquals(0,rect.area());
    }
}
