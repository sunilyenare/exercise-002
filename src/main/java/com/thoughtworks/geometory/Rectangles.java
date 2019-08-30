package com.thoughtworks.geometory;

public class Rectangles {

    private float length;
    private float width;
    Rectangles(float lenght,float width){
        this.length=lenght;
        this.width=width;
    }

     float area(){

        return length*width;
    }

    public float perameter() {
        return 0.0f;
    }
}
