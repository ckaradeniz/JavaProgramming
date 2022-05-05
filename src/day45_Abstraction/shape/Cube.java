package day45_Abstraction.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            throw new RuntimeException("Invalid Side: "+ side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return (side * side) * 6;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }


    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
