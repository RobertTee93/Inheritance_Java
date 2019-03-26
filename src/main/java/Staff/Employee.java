package Staff;

import java.lang.reflect.Type;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if (increase > 0){
            double increaseAmount = this.salary / 100 * increase;
            this.salary += increaseAmount;
        }
    }

    public int payBonus(){
        return this.salary / 100 * 1;
    }

    public void setName(String name) {
        if (name != ""){
            this.name = name;
        }
    }
}
