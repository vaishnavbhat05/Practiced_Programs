// Local Variable Scope with and without Initialization//
public class Variable_Initialize{
    void SheepAge(){
        int age = 0; // With Initialization
        // int age ;  Without Initialization
        age = age + 7;
        System.out.println("Age: "+age);
    }
    public static void main(String []args){
        Variable_Initialize t=new Variable_Initialize();
        t.SheepAge();
    }
}
