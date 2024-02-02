package org.raul.lesson_3;


class DriverClass {
    public static void main(String[] args) {

        // 4.Создать массив из 5 сотрудников.
        Employee[] empArray = new Employee[5];

        // для каждой ячейки массива задаем объект
        empArray[0] = new Employee("Jason Statham", "Scrum Master",
                "jstatham@example.co.uk", "+44-0123-3210-00", 33350f, 56);

        empArray[1] = new Employee("Megan Boone", "Auto QA Engineer",
                "mboone@example.com", "+1-010101-3210-01", 25150f, 41);

        empArray[2] = new Employee("James Spader", "TCO",
                "jtspader@example.com", "+1-020202-3210-02", 40550f, 63);

        empArray[3] = new Employee("Kevin Hart", "Junior DevOps Engineer",
                "khart@example.org", "+1-030303-3210-03", 19500f, 33);

        empArray[4] = new Employee("Karen Gillan", "Software Developer",
                "kgillan@example.co.uk", "+44-0134-4310-04", 25950f, 27);


        // Отобразить информацию о сотрудниках старше 40 лет.
        EmployeeController.retrieveByAge(empArray, 40);
    }
}
