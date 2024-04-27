/*Demonstration of Instance Variable Usage.*/
public class Employee{
  public String name;
  private double salary;
  public Employee(String EmpName){ //INSTANCE VARIABLE 
    name=EmpName;
  }
  public void details(double EmpSal){ //INSTANCE VARIABLE
    salary=EmpSal;
  }
  public void display(){
    System.out.println("Employee Name:"+name);
    System.out.println("Employee Salary:"+salary);
  }
  public static void main(String []args){
    Employee e=new Employee("Vaishnav");
    e.details(1000.00);
    e.display();
  }
}
    
