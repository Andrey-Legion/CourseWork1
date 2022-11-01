
public class Main {
    public static void main(String[] args) {
        private Employee[] employee;
        Employee[] employee= new Employee[10];
        System.out.println(Employee.getId());
        String[] department = new String[]{"1", "2", "3", "4", "5"};
        Employee employee1 = new Employee("A1","B1","C1","2" ,1,1000d);
        Employee employee2 = new Employee("A2","B2","C2","1" ,2,1500d);
        /*person1.firstName = "A1";
        person1.secondName = "B1";
        person1.thirdName = "C1";
        person1.department[]="2";
        person1.salary=1000d;*/
        System.out.println("Список сотрудников: "+Employee().getId());
//        System.out.println("Затраты на зарплату в месяц: "+);
//        System.out.println("Сотрудник с мин.зарплатой: "+);
//        System.out.println("Сотрудник с макс.зарплатой: "+);
//        System.out.println("Средняя зарплата: "+);
        //System.out.println("Ф.И.О. сотрудников: "+employee().getFirstName()+employee().getSecondName()+employee().getThirdName());
        Employee.printAllEmployees();
        Employee.printAllData();
    }
}