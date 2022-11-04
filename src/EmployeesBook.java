public class EmployeesBook {
    private Employee[] person;
    //private final String[] employeeList = new String[10];
    //String[0]="A1 "+"B1 "+"C1.";
    //String[1]="A2 "+"B2 "+"C2.";
    //String[2]="A3 "+"B3 "+"C3.";
    public EmployeesBook(Employee[] person) {
        this.person = person;
    }
    public double outputSalaryTotal (Employee[] person) {
        double sumSalaryTotal;
        for (Employee person1 : person) {
            if (person1 == null) {
                System.out.println("Incorrect data input!");
            } else {
                sumSalaryTotal += person1.getSalary();
            }

        }
        return sumSalaryTotal;
    }
    public double outputSalaryMax (Employee[] person){
        double salaryMax=0;
        for (Employee person[] : person) {
            if (person[] != null) {
                salaryMax= person[].getSalary();
                break;
                }
        for (Employee person[] : person){
            if (person[]!= null && person[].getSalary()>salaryMax){
                salaryMax= person[].getSalary();
            }

        }
        return salaryMax;
    }
    public double outputSalaryMin (Employee[] person) {
        double salaryMin=0;
        for (Employee person[] : person) {
            if (person[] !=null){
                salaryMin = person[].getSalary();
                break;
            }
        for (Employee person[] : person) {
            if (person[] !=null && person[].getSalary()<salaryMin) {
                salaryMin= person[].getSalary();
            }
        }
        return salaryMin;
    }
    public double outputSalaryAverage (Employee[] person){
        double salaryAverage;
        for (Employee person[] : person){
            salaryAverage=Employee[] person().getSalary()/person[person.length-1];
        }
        return salaryAverage;
    }

    public String printAllEmployees(Employee[] person) {
        String allPerson;
        for (int i = 0; i < person.length; i++) {
            Employee person = person[i];
            allPerson=Employee.getId() + ": " + Employee.getFirstName() + Employee.getSecondName() + Employee.getThirdName();
        }

    }
    public String printAllData(Employee[] person) {
        String dataPerson;
        for (int i = 0; i < person.length; i++) {
            Employee person = person[i];
            dataPerson=Employee.getId() + ": " + Employee[] person();

        }
    }
}
