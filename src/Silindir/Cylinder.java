package Silindir;

public class Cylinder extends Circle {

    public double height;

    public Cylinder(double height, double radius) {
        super(radius);
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
