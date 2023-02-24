package com.csc205.project2;

public class Cylinder implements ThreeDimensionalShape{
    //creates cylinder object

    //object radius and height
    private double radius;
    private double height;

    //cylinder object
    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    //cylinder constructor
    public Cylinder(double r, double h) {
        super();
        this.radius = r;
        this.height = h;
    }

    //getters
    public double getRadius() {
        return radius;
    }
    public double getHeight(){ return height;}

    //setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height){this.height = height;}

    //printer
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nCylinder {");
        sb.append("radius= ").append(radius);
        sb.append(", height= ").append(height);
        sb.append(", surface area= ").append(cylinderSurfaceArea(radius, height));
        sb.append(", volume= ").append(cylinderVolume(radius, height));
        sb.append("}");
        return sb.toString();
    }
}
