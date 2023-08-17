import Havuz.Cuboid;
import Havuz.Rectangle;
import Developer.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------SİLİNDİR----------");
        Silindir.Circle circle = new Silindir.Circle(3.75);
        System.out.println(("circle.radius= " + circle.getRadius()));
        System.out.println("circle.area= " + circle.getArea());

        Silindir.Cylinder cylinder = new Silindir.Cylinder(7.25, 5.55);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("------------HAVUZUN ALANI----------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("------------DEVELOPER----------");

        JuniorDeveloper junior1 = new JuniorDeveloper(2, "Ayşe",22000);
        junior1.work();
        JuniorDeveloper junior2 = new JuniorDeveloper(3, "Ahmet",22000);
        junior2.work();
        JuniorDeveloper junior3 = new JuniorDeveloper(4, "Ömer",22000);
        junior3.work();
        MidDeveloper mid1 = new MidDeveloper(5, "Mehmet",28000);
        mid1.work();
        MidDeveloper mid2 = new MidDeveloper(6, "Fatma",30000);
        mid2.work();
        HRManager hrManager = new HRManager(8, "Ali",50000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        SeniorDeveloper senior = new SeniorDeveloper(7, "Kuzey",27500);
        senior.work();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        System.out.println("Senior Salary: " + senior.getSalary());

        System.out.println("Juniors " + Arrays.toString(hrManager.getJuniorDevelopers()));
        System.out.println("Mids " + Arrays.toString(hrManager.getMidDevelopers()));
        System.out.println("Seniors " + Arrays.toString(hrManager.getSeniorDevelopers()));

        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1,junior2);
        hrManager.addEmployee(2,junior3);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior);
        hrManager.addEmployee(2,senior);

        System.out.println("---------------");
        System.out.println("Juniors " + Arrays.toString(hrManager.getJuniorDevelopers()));
        System.out.println("Mids " + Arrays.toString(hrManager.getMidDevelopers()));
        System.out.println("Seniors " + Arrays.toString(hrManager.getSeniorDevelopers()));
    }
}