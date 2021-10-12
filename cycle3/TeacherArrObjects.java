import java.util.Scanner
class EmployeeT{
int empid ;
String  name;
float salary;
String address;
//EmployeeT(){}

EmployeeT (int empid , String name, float salary, String address)
{
this.empid = empid;
this.name = name;
this.salary = salary;
this.address = address;
}
}
class Teacher extends EmployeeT{
    
String department, subject;
Teacher (int empid , String name, float salary, String address, String department, String subject){
    super(empid,name,salary,address);
    this.department = department;
    this.subject = subject;
}
public void display()
{
System.out.println("teacher id :"+ empid);
System.out.println("teacher name:" + name);
System.out.println("teacher salary:" + salary);
System.out.println ("teacher address:" + address);
}
}
public  class TeacherArrObjects {
    public static void main(String []args){
        System.out.println("enter the number of teachers");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the teacher details one by one:");
        Teacher teacher[] = new Teacher[n];
       //canner scT= new Scanner (System .in);
        int tid ; String name ; float salary ; String address;
        String department;
        String subject;
       
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter"+i+"teacher details:");
            System.out.println("Enter teacher id(integer):");
            tid=sc.nextInt();
            System.out.println("Enter teacher name(string):");
            name=sc.next();
            System.out.println("Enter teacher salary(float):");
            salary=sc.nextFloat();
            System.out.println("Enter teacher address(string):");
            address=sc.next();
            System.out.println("Enter teacher department(string):");
            department=sc.next();
            System.out.println("Enter teacher subject(string):");
            subject=sc.next();
            Teacher t = new Teacher( tid, name, salary, address, department,subject);
            teacher [ i ] = t;
        }
            System.out.println("teachers are:");
            for(Teacher x : teacher){
                x.display();  System.out.println("");     
            }
          
}  }
            
