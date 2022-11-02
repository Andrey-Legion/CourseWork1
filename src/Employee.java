public class Employee {
    public static int id;               //будет меняться одновременно у всех.
    static int quantityOfEmployees = 2; //лучше ввести доп поле,которое и будет хранить значение последнего ид
    private final String firstName;
    private final String secondName;
    private final String thirdName;
    private String department;
    private double salary;

    public Employee (String firstName,String secondName,String thirdName,String department,double salary) {
        id++;
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

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}




