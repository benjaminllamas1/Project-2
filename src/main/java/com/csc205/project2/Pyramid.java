package com.csc205.project2;

public class Pyramid implements ThreeDimensionalShape{
    //creates triangular pyramid object

    //object base length and height length
    private double base;
    private double height;

    //pyramid object
    public Pyramid() {
        super();
        this.base = 0.0;
        this.height = 0.0;
    }

    //pyramid constructor
    public Pyramid(double b, double h) {
        super();
        this.base = b;
        this.height = h;
    }

    //getters
    public double getBase() {return base;}

    public double getHeight() {return height;}

    //setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height){this.height = height;}

    //printer
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nPyramid {");
        sb.append("base= ").append(base);
        sb.append(", height= ").append(height);
        sb.append(", surface area= ").append(pyramidSurfaceArea(base,height));
        sb.append(", volume= ").append(pyramidVolume(base,height));
        sb.append("}");
        return sb.toString();
    }

}
