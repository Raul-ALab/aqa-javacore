package org.raul.lesson_3;

public class EmployeeController {

    /* 5.С помощью цикла вывести информацию только о
    сотрудниках старше 40 лет. */
    public static void retrieveByAge(Employee[] employees, int ageGreater) {
        for (Employee emp : employees) {
            if (!(emp.getAge() < ageGreater)) {
                emp.employeeDetailsToConsole();
            }
        }
    }
}
