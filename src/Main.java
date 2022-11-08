
public class Main {
    public static void main(String[] args) {
        EmployeesBook employeeBook = new EmployeesBook(person);
        System.out.println(Employee.getId());
        String[] department = new String[]{"1", "2", "3", "4", "5"};
        Employee[] person = new Employee[10];
        person[0] = new Employee("A1", "B1", "C1", "2", 1000d);
        person[1] = new Employee("A2", "B2", "C2", "1", 1500d);
        person[2] = new Employee("A3", "B3", "C3", "3", 1600d);
        person[3] = new Employee("A4", "B4", "C4", "1", 1700d);
        person[4] = new Employee("A5", "B5", "C5", "4", 1500d);
        person[5] = new Employee("A6", "B6", "C6", "5", 2000d);
        person[6] = new Employee("A7", "B7", "C7", "2", 1600d);
        person[7] = new Employee("A8", "B8", "C8", "5", 1200d);
        person[8] = new Employee("A9", "B9", "C9", "3", 1300d);
        person[9] = new Employee("A10", "10", "C10", "4", 1800d);

        System.out.println("Список сотрудников: " + employeeBook.getId());
        System.out.println("Ф.И.О. сотрудников: "employeeBook.getId() + ": "+person[].getFirstName()+person[].getSecondName()+person[].getThirdName());
        //System.out.println(employeeBook.sumSalaryTotal(person));
        System.out.println("Затраты на зарплату в месяц: "+ employeeBook.outputSalaryTotal());
        System.out.println("Сотрудник с мин.зарплатой: "+ employeeBook.outputSalaryMin());
        System.out.println("Сотрудник с макс.зарплатой: "+ employeeBook.outputSalaryMax());
        System.out.println("Средняя зарплата: "+ employeeBook.outputSalaryAverage());

    }
}