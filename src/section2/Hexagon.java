package section2;

public class Hexagon extends Shape{
    int side;

    public Hexagon(int side) {
        super("Hexagon");
        this.side = side;
    }
    public double calculateArea() {
        return 0.0;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    

}
