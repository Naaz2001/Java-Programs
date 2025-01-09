import java.util.*;
class Worker {
    private double salaryRate;
    public void fun1(String name,int Rate){
        this.salaryRate = Rate;
        System.out.println("Worker Name : "+name+"\nSalary Rate : "+salaryRate);
    }
}
class DailyWorker extends Worker {
    private double salaryRate;
    private int days;
    public void fun2(int rate){
        Scanner sc = new Scanner(System.in);
        this.salaryRate = rate;
        System.out.println("Enter the number of days worker worked : ");
        int day = sc.nextInt();
        this.days = day;
        double salary = rate * day;
        System.out.println("Monthly salary of daily worker : "+salary);
    }
    public void ComPay(int hours) {
        double salary = salaryRate * hours;
        System.out.println("Salary of the worker per week after working for "+ days +" days at the rate of "+salaryRate+" : "+salary);
    }
}
class SalariedWorker extends Worker{
    private double salaryRate;
    public void fun3(int rate) {
        this.salaryRate = rate;
        double salary = salaryRate * 40;
        System.out.println("Salary of a Salaried Worker : "+salary);
    }
    public void ComPay(int hours) {
        double salary = salaryRate * hours;
        System.out.println("Salary of the worker per week after working for "+ hours +" hours at the rate of "+salaryRate+" : "+salary);
    }
}
public class WorkerMain {
    public static void main(String[] args) {
        DailyWorker obj1 = new DailyWorker();
        obj1.fun1("Steven Smith", 500);
        obj1.fun2(500);
        obj1.ComPay(15);
        SalariedWorker obj2 = new SalariedWorker();
        obj2.fun1("Joe Root", 450);
        obj2.fun3(750);
        obj2.ComPay(72);
    }
}

