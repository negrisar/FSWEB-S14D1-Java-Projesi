package Developer;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work(){
        super.work();
        setSalary(39000);
        System.out.println(getName() + "mid developer starts to work");
    }
}
