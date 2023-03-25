
public class Employee {

    private String lastName; //Фамилия
    private String firstName; //Имя
    private String surname;  //Отчество
    private int department;
    private float salary;
    private static int counter;
    private int id;


    public Employee(String lastName, String firstName, String surname, int department, float salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }


    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public void SetDepartment(int department1) {
        this.department = department1;
    }

    public float getSalary() {
        return this.salary;
    }

    public void SetSalary(float salary1) {
        this.salary = salary1;
    }


    @Override
    public String toString() {
        return "Id: " + id + " ФИО: " + lastName + " " + firstName + " " + surname + " Отдел: " + department + " Зарплата: " + salary;
    }
}


