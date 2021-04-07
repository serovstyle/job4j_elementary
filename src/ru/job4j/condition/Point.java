package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("Distance between points (0, 0) and (2, 0) = "+ Point.distance(0,0,2,0));
        System.out.println("Distance between points (1, 4) and (10, 0) = "+ Point.distance(1,4,10,0));
        System.out.println("Distance between points (-2, 7) and (-1, 3) = "+ Point.distance(-2,7,-1,3));
    }
}
