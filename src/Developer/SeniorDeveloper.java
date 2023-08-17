package Developer;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }


    public void work(){
        super.work();
        setSalary(45000);
        System.out.println(getName() + " senior developer starts to work");
    }
}
