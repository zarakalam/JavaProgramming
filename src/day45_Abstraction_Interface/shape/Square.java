package day45_Abstraction_Interface.shape;

public class Square extends Shape{

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0){
            throw new RuntimeException("Invalid entry "+ side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                "side=" + side +
                '}';
    }
}
