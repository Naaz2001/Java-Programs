class Employee {
    String name;
    int empid;
    int salary;
    //default constructor
    Employee() {
        name = " ";
        empid = 0;
        salary = 0;
    }
    //parameterized constructor
    Employee(String n,int id,int s){
        name = n;
        empid = id;
        salary = s;
    }
    String showName(){
        return name;
    }
    int showSalary(){
        return salary;
    }
    //method to increase salary
    void increaseSalary(double percentage) {
        salary += salary * (percentage/100);
        System.out.println("Salary after incrementing for "+percentage+" percentage : "+salary);
    }
}
class Manager extends Employee{
    Manager(String name,int empid, int salary) {
        super(name,empid,salary);
    }
}

class EmployeeSteve {
    public static void main(String[] args) {
        Employee emp = new Employee("SHELDON", 137, 100000);
        System.out.println("Name of employee : "+emp.showName());
        System.out.println("Salary : "+emp.showSalary());
        emp.increaseSalary(10);

        Manager mng = new Manager("LEONARD",222,2200000);
        System.out.println("Name of manager : "+mng.showName());
        System.out.println("Salary : "+mng.showSalary());
        mng.increaseSalary(15);
    }
}

