public class Main {


    public static void getEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int getTotalSalary(Employee[] employees) {
        int totalSalaryPerMonth = 0;
        for (Employee employee : employees) {
            totalSalaryPerMonth += employee.getSalary();
        }
        return totalSalaryPerMonth;
    }

    public static Employee getEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static int getAverageSalary(Employee[] employees){
        int averageSalary = getTotalSalary(employees) / employees.length;
        return averageSalary;
    }

    public static void printEmployeesName(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }



    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван1", 1, 1000);
        employees[1] = new Employee("Иванов Иван2", 2, 3000);
        employees[2] = new Employee("Иванов Иван3", 5, 4000);
        employees[3] = new Employee("Иванов Иван4", 4, 2000);
        employees[4] = new Employee("Иванов Иван5", 3, 7000);
        employees[5] = new Employee("Иванов Иван6", 1, 9000);
        employees[6] = new Employee("Иванов Иван7", 2, 3000);
        employees[7] = new Employee("Иванов Иван8", 5, 8000);
        employees[8] = new Employee("Иванов Иван9", 4, 4000);
        employees[9] = new Employee("Иванов Иван10", 3, 900);

        System.out.println("список всех сотрудников: ");
        getEmployees(employees);
        System.out.println("сумма затрат на зп в месяц: " + getTotalSalary(employees));
        System.out.println("сотрудник с минимальной зп: " + getEmployeeWithMinSalary(employees));
        System.out.println("сотрудник с максимальной зп: " + getEmployeeWithMaxSalary(employees));
        System.out.println("средняя зп: " + getAverageSalary(employees));
        System.out.println("ФИО сотрудников: ");
        printEmployeesName(employees);
    }

}