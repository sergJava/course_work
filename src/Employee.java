import java.util.Objects;

public class Employee {
    public static int counter = 0;

    private String name;
    private int department;
    private int salary;
    private int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;

        counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "имя: " + name +
                ", id = " + id +
                ", отдел: " + department +
                ", зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary &&
                id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    public void printEmployeeWithoutDepartment (){
        System.out.println("имя: " + name +
                ", id = " + id +
                ", зарплата: " + salary);
    }
}
