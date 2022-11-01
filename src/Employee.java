public class Employee {
    public static int id;
    private final String firstName;
    private final String secondName;
    private final String thirdName;
    private String department;
    private double salary;

    public Employee (int id,String firstName,String secondName,String thirdName,String department,double salary) {
        this.id+=1;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.department = department;
        this.salary = salary;
    }
    public static int getId () {
        return id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }
    public String getThirdName(){
        return this.thirdName;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void printAllEmployees() {
        for (int i = 0; i < id; i++) {
            Employee employee = employee[i];
            System.out.println(Employee.getId() + ": " + Employee.getFirstName() + Employee.getSecondName() + Employee.getThirdName());
        }
    }
    public void printAllData() {
        for (int i = 0; i < id; i++) {
            Employee employee = employee[i];
            System.out.println(Employee.getId() + ": " + Employee.employee());

        }
    }

}




