public class EmployeeBook {
    private Employee[] employees;
    private int size;

    public EmployeeBook(){
        employees = new Employee[10];
    }

    public boolean addEmployee (String name, int department, int salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(name, department, salary);
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printEmployees() {
        System.out.println("список всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int getTotalSalary() {
        int totalSalaryPerMonth = 0;
        for (Employee employee : employees) {
            totalSalaryPerMonth += employee.getSalary();
        }
        return totalSalaryPerMonth;
    }

    public Employee getEmployeeWithMinSalary() {
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

    public Employee getEmployeeWithMaxSalary() {
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

    public  int getAverageSalary() {
        int averageSalary = getTotalSalary() / employees.length;
        return averageSalary;
    }

    public void printEmployeesName() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    // повышенная сложность:
    // 1.
    public void indexation(float percent) {
        for (Employee employee : employees) {
            float percentageValue = (100 + percent) / 100;
            employee.setSalary((int) (employee.getSalary() * percentageValue));
        }
    }

    // 2.a.
    public Employee getEmployeeWithMinSalaryFromDepartment(int department) {
        int minSalaryFromDepartment;
        Employee employeeWithMinSalaryFromDepartment = null;
        for (Employee employee : employees) {                     // находим первого сотрудника отдела и записываем его в
            if (employee.getDepartment() == department) {         // переменную employeeWithMinSalaryFromDepartment
                employeeWithMinSalaryFromDepartment = employee;
                break;
            }
        }
        if (employeeWithMinSalaryFromDepartment == null) {          //если нет сотрудников в отделе
            System.out.println("в таком отделе нет сотрудников");
            return null;
        }
        minSalaryFromDepartment = employeeWithMinSalaryFromDepartment.getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalaryFromDepartment) {
                minSalaryFromDepartment = employee.getSalary();
                employeeWithMinSalaryFromDepartment = employee;
            }
        }
        return employeeWithMinSalaryFromDepartment;
    }

    // 2.b.
    public Employee getEmployeeWithMaxSalaryFromDepartment(int department) {
        int maxSalaryFromDepartment;
        Employee employeeWithMaxSalaryFromDepartment = null;
        for (Employee employee : employees) {                     // находим первого сотрудника отдела и записываем его в
            if (employee.getDepartment() == department) {         // переменную employeeWithMaxSalaryFromDepartment
                employeeWithMaxSalaryFromDepartment = employee;
                break;
            }
        }
        if (employeeWithMaxSalaryFromDepartment == null) {          //если нет сотрудников в отделе
            System.out.println("в таком отделе нет сотрудников");
            return null;
        }
        maxSalaryFromDepartment = employeeWithMaxSalaryFromDepartment.getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalaryFromDepartment) {
                maxSalaryFromDepartment = employee.getSalary();
                employeeWithMaxSalaryFromDepartment = employee;
            }
        }
        return employeeWithMaxSalaryFromDepartment;
    }

    // 2.c.
    public int getTotalSalaryInDepartment(int department) {
        int totalSalaryInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalaryInDepartment += employee.getSalary();
            }
        }
        return totalSalaryInDepartment;
    }

    // 2.d.
    public int getAverageSalaryInDepartment(int department) {
        int countEmployeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                countEmployeesInDepartment++;
            }
        }
        int averageSalaryInDepartment = getTotalSalaryInDepartment(department) / countEmployeesInDepartment;
        return averageSalaryInDepartment;
    }


    // 2.e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public void indexationInDepartment(int department, float percent) {
        for (Employee employee : employees) {
            float percentageValue = (100 + percent) / 100;
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percentageValue));
            }
        }
    }


    // 2.f.  Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public void printEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.printEmployeeWithoutDepartment();
            }
        }
    }


    // 3.a. Получить в качестве параметра число и вывести: Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)
    public void printSmallerSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                employee.printEmployeeWithoutDepartment();
            }
        }
    }


    // 3.b. Получить в качестве параметра число и вывести: Всех сотрудников с зп больше или равно числа (распечатать id, фио и зп в консоль)
    public void printBiggerSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                employee.printEmployeeWithoutDepartment();
            }
        }
    }



}
