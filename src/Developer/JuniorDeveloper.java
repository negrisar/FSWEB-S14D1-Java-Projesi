package Developer;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(){
        super.work();
        setSalary(30000);
        System.out.println(getName() + "junior developer starts to work");
    }
}
