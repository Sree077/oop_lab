import java.util.Scanner;
class Employee {
    public String name;
    public int age;
    public long number;
    public String address;
    public double salary;
    public void printSalary(){
        System.out.println("Salary = "+salary);
    }
}
class Officer extends Employee{
    public String specialization;
}
class Manager extends Employee{
    public String department;
}
class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Officer O = new Officer();
        System.out.print("Enter officer's name: ");
        O.name=in.nextLine();
        System.out.print("Enter officer's age:");
        O.age=in.nextInt();
        in.nextLine();
        System.out.print("Enter specialization: ");
        O.specialization=in.nextLine();
        System.out.println("Enter address: ");
        O.address=in.nextLine();
        System.out.println("Officer name: "+O.name);
        System.out.println("Officer age: "+O.age);
        System.out.println("Officer specialization: "+O.specialization);
        System.out.println("Officer address: "+O.address);
        Manager m = new Manager();
        System.out.print("Enter manager's name: ");
        m.name=in.nextLine();
        System.out.print("Enter age: ");
        System.out.print("Enter Manager's salary: ");
        m.salary=in.nextInt();
        m.printSalary();
        in.close();
    }
}


