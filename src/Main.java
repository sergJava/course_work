public class Main {
    static void printBound (){
        System.out.println("_____________________________________________");
        System.out.println();
    }




    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван0", 1, 1000);
        employeeBook.addEmployee("Иванов Иван1", 2, 3500);
        employeeBook.addEmployee("Иванов Иван2", 5, 4000);
        employeeBook.addEmployee("Иванов Иван3", 4, 2000);
        employeeBook.addEmployee("Иванов Иван4", 3, 7000);
        employeeBook.addEmployee("Иванов Иван5", 1, 9000);
        employeeBook.addEmployee("Иванов Иван6", 2, 3000);
        employeeBook.addEmployee("Иванов Иван7", 5, 8000);
        employeeBook.addEmployee("Иванов Иван8", 4, 4000);
        employeeBook.addEmployee("Иванов Иван9", 3, 900);
        employeeBook.addEmployee("Иванов Иван10", 1, 3900);             //нет места в списке



        employeeBook.printEmployees();
        printBound();

        System.out.println("удаление сотрудника..");
        employeeBook.deleteEmployee(7);
        employeeBook.printEmployees();
        printBound();


        System.out.println("добавление сотрудника..");
        employeeBook.addEmployee("Иванов Петр10", 1, 2000);
        employeeBook.printEmployees();
        printBound();

        System.out.println("получить сотрудника по id:");
        System.out.println(employeeBook.getEmployeeById(8));
        printBound();

        System.out.println("сумма затрат на зп в месяц: " + employeeBook.getTotalSalary());
        System.out.println("сотрудник с минимальной зп: " + employeeBook.getEmployeeWithMinSalary());
        System.out.println("сотрудник с максимальной зп: " + employeeBook.getEmployeeWithMaxSalary());
        System.out.println("средняя зп: " + employeeBook.getAverageSalary());
        printBound();

        System.out.println("ФИО сотрудников: ");
        employeeBook.printEmployeesName();
        printBound();

        System.out.println("индексация всего предприятия:");
        employeeBook.indexation(10);
        employeeBook.printEmployees();
        printBound();

        System.out.printf("2.a. сотрудник отдела с мин. зп:   %s\n", employeeBook.getEmployeeWithMinSalaryFromDepartment(1));
        System.out.printf("2.b. сотрудник отдела с макс. зп:   %s\n", employeeBook.getEmployeeWithMaxSalaryFromDepartment(1));
        System.out.printf("2.c. сумма затрат на зп по отделу:   %d\n", employeeBook.getTotalSalaryInDepartment(1));
        System.out.printf("2.d. средняя зп по отделу:  %d\n", employeeBook.getAverageSalaryInDepartment(1));
        printBound();

        System.out.println("2.e. индексация отдела..");
        employeeBook.indexationInDepartment(1, 20);
        employeeBook.printEmployees();
        printBound();

        System.out.println("2.f. сотрудники отдела");
        employeeBook.printEmployeesDepartment(1);
        printBound();

        System.out.println("3.a. вывести всех сотрудников с зп меньше числа");
        employeeBook.printSmallerSalary(4000);
        printBound();

        System.out.println("3.b. вывести всех сотрудников с зп больше или равно числа");
        employeeBook.printBiggerSalary(4000);

    }

}