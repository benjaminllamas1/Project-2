package com.csc205.project2;

public interface ThreeDimensionalShape {

    //Sphere Surface area: if r=2 then SA is 50.27
    default double sphereSurfaceArea(double sphereRadius) {return 4.0 * Math.PI * Math.pow(sphereRadius, 2);}
    //Sphere Volume: if r=2 then Vol is 33.51
    default double sphereVolume(double sphereRadius) {
        return (4.0/3.0) * Math.PI * Math.pow(sphereRadius, 3);
    }

    //Pyramid Surface area: if b=3 and h=2 then SA is 12
    default double pyramidSurfaceArea(double pyramidBase, double pyramidHeight) {
        return (4*(0.5*pyramidBase*pyramidHeight));
    }
    //Pyramid Volume: if b=3 and h=2 then Vol is 2
    default double pyramidVolume(double pyramidBase, double pyramidHeight) {
        return (((0.5 * pyramidBase * pyramidHeight) * pyramidHeight) / 3);
    }
    //Cylinder Surface area: if r = 2 and h = 3 then SA is 62.83
    default double cylinderSurfaceArea(double cylinderRadius, double cylinderHeight) {
        return 2*Math.PI*cylinderRadius*(cylinderRadius+cylinderHeight);
    }

    //Cylinder Volume: if r = 2 and h = 3 then Vol is 37.70
    default double cylinderVolume(double cylinderRadius, double cylinderHeight) {
        return Math.PI*Math.pow(cylinderRadius,2)*cylinderHeight;
    }

    //Cone Surface area: if l = 3 h = 3 and r = 2 then SA is 31.42
    default double coneSurfaceArea(double coneLength, double coneRadius) {
        return Math.PI*Math.pow(coneRadius,2)+Math.PI*coneRadius*coneLength;
    }

    //Cone Volume: if l = 3 h = 3 and r = 2 then Vol is 12.57
    default double coneVolume(double coneHeight, double coneRadius) {
        return (Math.PI*Math.pow(coneRadius,2)*coneHeight)/3;
    }


    }
