package com.csc205.project2;

public class Sphere implements ThreeDimensionalShape{
    //creates sphere object
    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;
    }
    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nSphere {");
        sb.append("radius= ").append(radius);
        sb.append(", surface area= ").append(sphereSurfaceArea(radius));
        sb.append(", volume= ").append(sphereVolume(radius));
        sb.append("}");
        return sb.toString();
    }
}