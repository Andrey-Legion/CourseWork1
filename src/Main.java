
public class Main {
    public static void main(String[] args) {
        Employee[] person;
        Employee[] person= new Employee[10];
        System.out.println(Employee.getId());
        String[] department = new String[]{"1", "2", "3", "4", "5"};
        Employee person1 = new Employee("A1","B1","C1","2" ,1000d);
        Employee person2 = new Employee("A2","B2","C2","1" ,1500d);
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

        public void printAllEmployees() {
            for (int i = 0; i < id; i++) {
                Employee person = person[i];
                System.out.println(Employee.getId() + ": " + Employee.getFirstName() + Employee.getSecondName() + Employee.getThirdName());
            }
        }
        public void printAllData() {
            for (int i = 0; i < id; i++) {
                Employee person = person[i];
                System.out.println(Employee.getId() + ": " + Employee.person());

            }
        }
    }
}