package uas2;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void work() {
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing tasks.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is developer tasks.");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }
    @Override
    public void work() {
        System.out.println("Designer " + getName() + "  is designer tasks.");
    }
}

public class Profesi {
    public static void main(String[] args) {
        Manager manager = new Manager("Nurul");
        Developer developer = new Developer("Aldi");
        Designer designer = new Designer("Pita");

        manager.work();
        developer.work();
        designer.work();
    }
}

