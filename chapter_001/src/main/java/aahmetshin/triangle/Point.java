package aahmetshin.triangle;
/**
* Class для вычисления расстояния между двумя точками.
* @author aahmetshin
* @since 27.11.2016
* @version 1
*/
public class Point {
/**
*Variable coordinate x.
*/
private double x;
/**
*Variable coordinate y.
*/
private double y;

/**
*Constructor.
*@param x первое число
*@param y второе число
*/
public Point(double x, double y) {
this.x = x;
this.y = y;
}
/**
*Calculate distance between two point.
*@param point точка на плоскости
*@return distance
*/
public double distanceTo(Point point) {
//calculate distance between two points
return  Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
}
}

