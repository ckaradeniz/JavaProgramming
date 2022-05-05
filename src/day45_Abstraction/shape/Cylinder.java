package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double height;
    private double radius;
    public final static double pi = 3.14;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0 ){
            throw new RuntimeException("Invalid Height: "+ height);
        }
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ){
            throw new RuntimeException("Invalid Radius: "+radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "height=" + height +
                ", radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public double volume() {
        return pi * radius * radius * height;
    }
}
