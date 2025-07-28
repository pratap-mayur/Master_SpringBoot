import java.util.*;
class Shape{
    public void calculateArea(){
        System.out.println("calculate the area ");
    }
}
class circle extends Shape{
    @Override
    public void calculateArea(){
        System.out.println("the area of circle is pie * radius * radius");
    }
}
class rectangle extends Shape{
    @Override
    public void calculateArea(){
        System.out.println("the area of rectangle is length * breadth");
    }
}
class triangle extends Shape{
    @Override
    public void calculateArea(){
        System.out.println("the area of triangle is 1/2 * length * breadth");
    }
}
public class shape_AreaCalculator {
    public static void main(String[] args) {
        Shape c = new circle();
        Shape r = new rectangle();
        Shape t = new triangle();
        c.calculateArea();
        r.calculateArea();
        t.calculateArea();
    }
}
