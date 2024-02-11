abstract class shape {
    abstract void numberOfSides();
}
class Rectangle extends shape{
    @Override
    void numberOfSides(){
        System.out.println("Number of sides of a rectange is: 4");
    }
}
class Triangle extends shape{
    @Override
    void numberOfSides(){
        System.out.println("Number of sides of a triangle is: 3");    
    }
}
class Hexagon extends shape{
    @Override
    void numberOfSides(){
        System.out.println("Number of sides of hexagon is: 6");
    }
}
public class Sides{
    public static void main(String[] args) {
        shape rectangle = new Rectangle();
        shape triangle = new Triangle();
        shape hexagon = new Hexagon();

        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
