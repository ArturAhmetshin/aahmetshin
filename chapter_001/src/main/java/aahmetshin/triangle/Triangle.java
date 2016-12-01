package aahmetshin.triangle;

/**
* Class для вычисления площади треугольника.
* @author aahmetshin
* @since 27.11.2016
* @version 1
*/
public class Triangle {
/**
* variable a.
*/
private Point a;
/**
* variable b.
*/
private Point b;
/**
* variable c.
*/
private Point c;
/**
*Constructor.
*@param a координаты первой точки
*@param b координаты второй точки
*@param c координаты третьей точки
*/
public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}
/**
*Area triangle.
*@return distance
*/
public double area() {
//calculate the triangle area
double ab = this.a.distanceTo(this.b);
double ac = this.a.distanceTo(this.c);
double bc = this.b.distanceTo(this.c);
if (ab + ac <= bc || ab + bc <= ac || ac + bc <= ab) {
return 0;
} else {
double p = (ab + ac + bc) / 2;
return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
}
}
}