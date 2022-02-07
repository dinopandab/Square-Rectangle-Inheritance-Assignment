package org.WalkerCC_CompSci;

public final class Square extends Rectangle{

    public Square(double sideLength) {
        super(sideLength,sideLength); //What goes here?

    }

    public double getSideLength(){
        return this.length;
    }

    public void setSideLength(double sideLength){
        //What goes here?
                 this.length = sideLength;
                 this.width = sideLength;
    }

}