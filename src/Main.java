public class Main {


    public static void printEmployees(Employee[] employees) {
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

    public static int getAverageSalary(Employee[] employees) {
        int averageSalary = getTotalSalary(employees) / employees.length;
        return averageSalary;
    }

    public static void printEmployeesName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    // повышенная сложность:
    // 1.
    public static void indexation(Employee[] employees, float percent) {
        for (Employee employee : employees) {
            float percentageValue = (100 + percent) / 100;
            employee.setSalary((int) (employee.getSalary() * percentageValue));
        }
    }

    // 2.a.
    public static Employee getEmployeeWithMinSalaryFromDepartment(Employee[] employees, int department) {
        int minSalaryFromDepartment;
        Employee employeeWithMinSalaryFromDepartment = null;
        for (Employee employee : employees) {                     // находим первого работника отдела и записываем его в
            if (employee.getDepartment() == department) {         // переменную employeeWithMinSalaryFromDepartment
                //minSalaryFromDepartment = employee.getSalary();
                employeeWithMinSalaryFromDepartment = employee;
                break;
            } else {
                System.out.println("в таком отделе нет сотрудников");
                return null;
            }
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
    public static Employee getEmployeeWithMaxSalaryFromDepartment(Employee[] employees, int department) {
        int maxSalaryFromDepartment;
        Employee employeeWithMinSalaryFromDepartment = null;
        for (Employee employee : employees) {                     // находим первого работника отдела и записываем его в
            if (employee.getDepartment() == department) {         // переменную employeeWithMinSalaryFromDepartment
                employeeWithMinSalaryFromDepartment = employee;
                break;
            } else {
                System.out.println("в таком отделе нет сотрудников");
                return null;
            }
        }
        maxSalaryFromDepartment = employeeWithMinSalaryFromDepartment.getSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalaryFromDepartment) {
                maxSalaryFromDepartment = employee.getSalary();
                employeeWithMinSalaryFromDepartment = employee;
            }
        }
        return employeeWithMinSalaryFromDepartment;
    }

    // 2.c.
    public static int getTotalSalaryInDepartment(Employee[] employees, int department) {
        int totalSalaryInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalaryInDepartment += employee.getSalary();
            }
        }
        return totalSalaryInDepartment;
    }

    // 2.d.
    public static int getAverageSalaryInDepartment(Employee[] employees, int department) {
        int countEmployeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                countEmployeesInDepartment++;
            }
        }
        int averageSalaryInDepartment = getTotalSalaryInDepartment(employees, department) / countEmployeesInDepartment;
        return averageSalaryInDepartment;
    }


    // 2.e. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public static void indexationInDepartment(Employee[] employees, int department, float percent) {
        for (Employee employee : employees) {
            float percentageValue = (100 + percent) / 100;
            if (employee.getDepartment() == department) {
                employee.setSalary((int) (employee.getSalary() * percentageValue));
            }
        }
    }


    // 2.f.  Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public static void printEmployeesDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.printEmployeeWithoutDepartment();
//                System.out.println("имя: " + employee.getName() +
//                        ", id = " + employee.getId() +
//                        ", зарплата: " + employee.getSalary());
            }
        }
    }


    // 3.a. Получить в качестве параметра число и вывести: Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)
    public static void printSmallerSalary(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                employee.printEmployeeWithoutDepartment();
            }
        }
    }


    // 3.b. Получить в качестве параметра число и вывести: Всех сотрудников с зп больше или равно числа (распечатать id, фио и зп в консоль)
    public static void printBiggerSalary(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                employee.printEmployeeWithoutDepartment();
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван1", 1, 1000);
        employees[1] = new Employee("Иванов Иван2", 2, 3500);
        employees[2] = new Employee("Иванов Иван3", 5, 4000);
        employees[3] = new Employee("Иванов Иван4", 4, 2000);
        employees[4] = new Employee("Иванов Иван5", 3, 7000);
        employees[5] = new Employee("Иванов Иван6", 1, 9000);
        employees[6] = new Employee("Иванов Иван7", 2, 3000);
        employees[7] = new Employee("Иванов Иван8", 5, 8000);
        employees[8] = new Employee("Иванов Иван9", 4, 4000);
        employees[9] = new Employee("Иванов Иван10", 3, 900);

//        System.out.println("список всех сотрудников: ");
//        getEmployees(employees);
//        System.out.println("сумма затрат на зп в месяц: " + getTotalSalary(employees));
//        System.out.println("сотрудник с минимальной зп: " + getEmployeeWithMinSalary(employees));
//        System.out.println("сотрудник с максимальной зп: " + getEmployeeWithMaxSalary(employees));
//        System.out.println("средняя зп: " + getAverageSalary(employees));
//        System.out.println("ФИО сотрудников: ");
//        printEmployeesName(employees);

//        indexation(employees, 10);
//        printEmployees(employees);

//        System.out.printf("2.a. сотрудник отдела с мин. зп:   %s\n", getEmployeeWithMinSalaryFromDepartment(employees, 6));
//        System.out.printf("2.b. сотрудник отдела с макс. зп:   %s\n", getEmployeeWithMaxSalaryFromDepartment(employees, 4));
//        System.out.printf("2.c. сумма затрат на зп по отделу:   %d", getTotalSalaryInDepartment(employees, 5));.
//        System.out.printf("2.d. средняя зп по отделу:  %d\n", getAverageSalaryInDepartment(employees, 3));

//        System.out.println("2.e. индексация отдела:");
//        indexationInDepartment(employees, 2, 20);
//        printEmployees(employees);

//        System.out.println("2.f. сотрудники отдела");
//        printEmployeesDepartment(employees, 4);

//        System.out.println("3.a. вывести всех сотрудников с зп меньше числа");
//        printSmallerSalary(employees, 4000);

//        System.out.println("3.b. вывести всех сотрудников с зп больше или равно числа");
//        printBiggerSalary(employees, 4000);

    }

}