package Havuz;

public class Cuboid extends Rectangle {

    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    public double getHeight() {
        if(height == 0){
            return 0;
        } else {
            return height;
        }
    }

    public double getVolume(){
        return height*getArea();
    }
}
