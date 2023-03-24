import java.util.Arrays;

public class Main {
    public static Employee[] newEmployee = new Employee[10];

    public static void printEmployee(String people) {
        for (Employee employee : newEmployee) System.out.println(employee);
    }

    public static void printFIO(String name) {
        String fio = null;
        for (Employee employee : newEmployee) {
            fio = employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSurname();
            System.out.println(fio);

        }
    }

    public static void calculateTotalSalary(String sal) {
        float sum = 0f;
        for (Employee employee : newEmployee) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц равна: " + sum);
    }

    public static void calculateMinSalary(String salMin) {
        float minSal = newEmployee[0].getSalary();
        for (Employee employee : newEmployee) {
            if (employee.getSalary() < minSal) {
                minSal = employee.getSalary();
                if (employee.getSalary() == minSal) {
                    System.out.println("Сотрудник с минимальной зарплатой " + employee);
                }
            }
        }
    }

    public static void calculateMaxSalary(String salMax) {
        float maxSal = newEmployee[0].getSalary();
        for (Employee employee : newEmployee) {
            if (employee.getSalary() > maxSal) {
                maxSal = employee.getSalary();
                if (employee.getSalary() == maxSal) {
                    System.out.println("Сотрудник с максимальной зарплатой " + employee);
                }
            }
        }
    }

    public static void calculateAverageSalary(String averageSal) {
        float averege = 0f;
        for (Employee employee : newEmployee) {
            averege = averege + employee.getSalary() / newEmployee.length;
        }
        System.out.println("Средняя зарплата состовляет: " + averege);
    }

    static void calculateIndexSalary(String ind) {
        float index = 10;
        float onePercent = 0;
        float indexSalary = 0;
        if (index >= 1) {
            for (Employee employee : newEmployee) {
                onePercent = employee.getSalary() / 100;
                indexSalary = onePercent * index + employee.getSalary();
                employee.SetSalary(indexSalary);
                System.out.println("Если проидексировать зарплату на " + index +" % " + "зарплата будут состовлять " + employee);
            }
        }
    }

    public static void minDepartmentSal(int inputDepartment) {
        float minSalary = newEmployee[0].getSalary();
        for (Employee i : newEmployee) {
            int a = i.getDepartment();
            if (a == inputDepartment) {
                for (Employee employee : newEmployee) {
                    if (employee.getSalary() < minSalary) {
                        minSalary = employee.getSalary();
                        if (employee.getSalary() == minSalary) {
                            System.out.println("Сотрудник с минимальной зарплатой " + employee);
                        }
                    }
                }
            }

        }
    }
    public static void maxDepartmentSal(int inputDepartment) {
        float maxSalary = Float.MIN_VALUE;
        for (Employee i : newEmployee) {
            int a = i.getDepartment();
            if (a == inputDepartment) {
                for (Employee employee : newEmployee) {
                    if (employee.getSalary() > maxSalary) {
                        maxSalary = employee.getSalary();
                        if (employee.getSalary() == maxSalary) {
                            System.out.println("Сотрудник с максимальной зарплатой " + employee);
                        }
                    }
                }
            }

        }
    }
    public static void sumDeptSal(int inputDepartment) {
        int sumDeptSalary = 0;
        for (Employee i : newEmployee) {
            int a = i.getDepartment();
            if (a == inputDepartment) {
                float b = i.getSalary();
                sumDeptSalary += b;
            }

        }
        System.out.println("Затраты на зарплату в отделе " + sumDeptSalary);
    }

    public static void averageDepartmentSal(int inputDepartment) {
        int quantityEmployee = 0;
        float averegeDepertment = 0f;
        for (Employee i : newEmployee) {
            int a = i.getDepartment();
            if (a == inputDepartment) {
                ++quantityEmployee;
                averegeDepertment = (averegeDepertment + i.getSalary()) / quantityEmployee;

            }
        }
        System.out.println("Средняя зарплата состовляет: " + averegeDepertment);
    }

    public static void indexDepartmentSalary (int inputDepartment, float index) {
        for (Employee i : newEmployee) {
            int j = i.getDepartment();
            if (j == inputDepartment) {
                float a = i.getSalary();
                index = (a / 100) * index;
                a = a + index;
                System.out.println("При индексации на " + index + " %, зарплата составит " + a);
            }
        }
    }

    static void printDepartmentFio (int inputDepartment){
        for (Employee i : newEmployee) {
            String fioDepart = null;
            int j = i.getDepartment();
            if (j == inputDepartment) {
                fioDepart = "id: " + i.getId() + " ФИО: " + i.getLastName() + " " + i.getFirstName() + " " + i.getSurname() + " Зарплата: " + i.getSalary();
            }
            if (j == inputDepartment) {
                System.out.println(fioDepart);
            }
        }
    }

static void calculateLowerIncomingSalary (int inputDepartment, float incomingSalary){

        String fioDepart = null;
    for (Employee i : newEmployee) {
        int j = i.getDepartment();
        if (j == inputDepartment) {
            if (i.getSalary()< incomingSalary){
                fioDepart = "id: " + i.getId() + " ФИО: " + i.getLastName() + " " + i.getFirstName() + " " + i.getSurname() + " Зарплата: " + i.getSalary();
            }
        }
    }
    System.out.println(fioDepart);
}

    static void calculateUpperIncomingSalary (int inputDepartment,float incomingSalary ){
        String fioDepart = null;
        for (Employee i : newEmployee) {
            int j = i.getDepartment();
            if (j == inputDepartment) {
                if (i.getSalary()> incomingSalary){
                    fioDepart = "id: " + i.getId() + " ФИО: " + i.getLastName() + " " + i.getFirstName() + " " + i.getSurname() + " Зарплата: " + i.getSalary();
                }
            }
        }
        System.out.println(fioDepart);
    }




    public static void main (String[] args) {

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



        printEmployee(Arrays.toString(newEmployee));
        calculateTotalSalary(Arrays.toString(newEmployee));
        calculateMinSalary(Arrays.toString(newEmployee));
        calculateMaxSalary(Arrays.toString(newEmployee));
        calculateAverageSalary(Arrays.toString(newEmployee));
        printFIO(Arrays.toString(newEmployee));
        calculateIndexSalary(Arrays.toString(newEmployee));
    }
}
