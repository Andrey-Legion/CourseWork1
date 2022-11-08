import java.util.Objects;

public class Employee {
    private final int id;
    private static int quantityOfEmployees = 1;
    private final String firstName;
    private final String  secondName;
    private final String thirdName;
    private String department;
    private double salary;

    public Employee (String firstName,String secondName,String thirdName,String department,double salary) {
        this.id=quantityOfEmployees++;
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
                "id=" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(secondName, employee.secondName) && Objects.equals(thirdName, employee.thirdName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, thirdName, department, salary);
    }
}




