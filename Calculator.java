import java.util.Scanner;


class New{

    void add(){
        
        System.out.println("Enter your first number: " );

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
    
        System.out.println(" Enter your second number:" );
        int num2 = input.nextInt();

        int result = num + num2;
        int sub = num - num2;
        int result1 = num * num2;
        int  conclusion = num / num2;
         
         
        System.out.println("Total is: " + result );
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " +result1);
        System.out.println("Division is: " + conclusion );
        
         
        input.close();

    }
}

class Calculator{
public static void main(String args[]){
New obj = new New();
obj.add();
}


       }
