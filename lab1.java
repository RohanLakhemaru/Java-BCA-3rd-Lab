// QNO 1: write a program to input of a circle and find its area
import java.util.Scanner;
class AreaOfCircle
{
    public static void main(String[] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the radius of the circle");
    float r = sc.nextFloat();
    float area = (22*r*r)/7;
    sc.close();
    System.out.println("Area of circle is :"+ area);
    }
    

}
// QNO 2: write a program to input three numbers and find the sum of their cubes
    class SumOfCubes
    {
        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int sum = ((a*a*a)+(b*b*b)+(c*c*c));
        System.out.println("sum of three numbers =:"+ sum);
    }
}
//QNO 3:Write a program to input a number and check odd/even
class CheckOddEven{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    sc.close();
    if(a%2==0)
        {
            System.out.println("Even ");
        }
        else
        {
            System.out.println("Odd ");
        }
}
}
//QNO 4: Write a program to input 3 numbers and find the greatest one
class GreatestOne{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        if(a>=b){
            if(a>=c){
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println(c+" is greatest");
            }
        }else{
            if(b>c){
                System.out.println(b+" is great");
            }else
                {
                    System.out.println(c+" is greatest");
                }
            
}
}
}
//QNO 5:Write a program to input a character and check vowel/consonant using switch
class VowelConsonant{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        //char userInput = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        sc.close();
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered character is a vowel.");
                break;
            default:

                System.out.println("Entered character is a consonant.");
                break;
    }
    }
}
//QNO 6:create a menu
class MenuDriven{

    private static void Add(int a, int b) {
        int addResult = a + b;
        System.out.println("Result of addition: " + addResult);
    }
    private static void Subtract(int a, int b) {
        int subtractResult = a - b;
        System.out.println("Result of subtraction: " + subtractResult);
    }

    private static void Multiply(int a, int b) {
        int multiplyResult = a * b;
        System.out.println("Result of multiplication: " + multiplyResult);
    }

    private static void Division(int a, int b) {
        float divisionResult = (float) a / b;
        System.out.println("Result of division: " + divisionResult);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mUserInput1, mUserInput2;

        System.out.println("Enter first number:");
        mUserInput1 = scan.nextInt();

        System.out.println("Enter second number:");
        mUserInput2 = scan.nextInt();

        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        // scan.close();

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Add(mUserInput1, mUserInput2);
                break;
            case 2:
                Subtract(mUserInput1, mUserInput2);
                break;
            case 3:
                Multiply(mUserInput1, mUserInput2);
                break;
            case 4:
                Division(mUserInput1, mUserInput2);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}