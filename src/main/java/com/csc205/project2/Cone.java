package com.csc205.project2;

public class Cone implements ThreeDimensionalShape{
    //creates cone object

    //object slant length height and radius

    private double length;
    private double height;
    private double radius;

    public Cone() {
        super();
        this.length = 0.0;
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double l, double h, double r) {
        super();
        this.length = l;
        this.height = h;
        this.radius = r;
    }

    //getters
    public double getLength() {return length;}
    public double getHeight() {return height;}
    public double getRadius() {
        return radius;
    }

    //setters
    public void setLength(double length) {this.length = length;}
    public void setHeight(double height) {this.height = height;}
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //printer
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nCone {");
        sb.append("slant length = ").append(length);
        sb.append(", height = ").append(height);
        sb.append(", radius= ").append(radius);
        sb.append(", surface area= ").append(coneSurfaceArea(length, radius));
        sb.append(", volume= ").append(coneVolume(height, radius));
        sb.append("}\n");
        return sb.toString();
    }
}
