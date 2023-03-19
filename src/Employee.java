public class Employee {

    private String LastName; //Фамилия
    private String FirstName; //Имя
    private String Surname;  //Отчество
    private int Department;
    private float Salary;
    private static int Counter;
    private int Id;


    public int getId() { return this.Id; }
    public String getLastName() { return this.LastName; }
    public String getFirstName() { return this.FirstName; }
    public String getSurname() { return this.Surname; }
    public int getDepartment() { return this.Department; }
    public void SetDepartment(int departament1) { this.Department = departament1; }
    public float getSalary() { return this.Salary; }
    public void SetSalary(float salary1) { this.Salary = salary1; }


    // Constructor
    public Employee(String lastName, String firstName, String surname, int dept, float salary) {
        LastName = lastName;
        FirstName = firstName;
        Surname = surname;
        Department = dept;
        Salary = salary;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " ФИО: " + LastName + " " + FirstName + " " + Surname + " Отдел: " + Department + " Зарплата: " + Salary;
    }

    public static void main(String[] args) {
        Employee[] newEmployee = new Employee[10];
        newEmployee[0] = new Employee("Иванов", "Евгений", "Степанович", 1, 28400);
        newEmployee[1] = new Employee("Петров", "Александр", "Сергеевич", 1, 28700);
        newEmployee[2] = new Employee("Галкин", "Максим", "Алексеевич", 2, 19925);
        newEmployee[3] = new Employee("Пугачева", "Алла", "Борисавна", 2, 46318);
        newEmployee[4] = new Employee("Настоящий", "Николай", "Васильевия", 3, 36600);
        newEmployee[5] = new Employee("Турутов", "Андрей", "Семёнович", 3, 38000);
        newEmployee[6] = new Employee("Аганесян", "Оганес", "Суренович", 4, 42300);
        newEmployee[7] = new Employee("Энштейн", "Марк", "Саркисович", 4, 44900);
        newEmployee[8] = new Employee("Говарухин", "Дмитрий", "Владимирович", 5, 76200);
        newEmployee[9] = new Employee("Мавчун", "Ярослав", "Дмитриевич", 5, 64800);

        for (Employee i: newEmployee) {
            System.out.println(i);
        }
    }
}