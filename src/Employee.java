public class Employee {

    private  String empName;
    String education;
    private Float salary;

    private  int employeeAge;

    public void setEmployeeAge(int employeeAge) {

        if(employeeAge < 70)
            this.employeeAge = employeeAge;

    }

    public int getEmployeeAge() {
        return employeeAge;
    }
}
