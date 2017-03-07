package com.theironyard;

/**
 * For this exercise you will create a class named Volume that contains methods
 * to calculate the volume of 3D shapes. Start by following the instructions in
 * the Volume class.
 *
 * In this Main class write a main method that invokes each of Volume class'
 * methods.
 */
public class Main {

    // todo: create a main() method that invokes each of the methods in the Volume class
    public static void main(String[] args) {
        double radius = 8.7;
        double height = 5;
        double length = 13;
        double volumeCube = Volume.cube(length);
        double volumeCone = Volume.cone(radius, height);
        double volumeSphere = Volume.sphere(radius);
    }
}
