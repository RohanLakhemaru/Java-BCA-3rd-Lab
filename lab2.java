
//QNO1: Write a program to print numbers between 100 and 200 which are exactly divisible by 5. 
import java.util.Scanner;

class DivByFive {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++)

        {
            // System.out.println(i +"");
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
// ONO 2:Write a program to find the sum of first N natural numbers

class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number");
        int a = sc.nextInt();
        int i;
        int sum = 0;
        for (i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println("sum is :" + sum);
    }
}

// QNO 3:Write a prigram to input and a number and find its reverse.
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number");
        int rev = 0;
        int n = sc.nextInt();
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("reverse is " + rev);
    }
}

// QNO 4a: Write a program to display the series
class Series {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// (4b)

class Series2 {
    public static void main(String[] args) {
        int sp = 1;
        for (int i = 5; i >= 1; i -= 2) {
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            sp++;
        }

    }

}

class Series3 {
    // public static void main(String[] args)
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}

// 4D
class Series4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// Qno 5; WRITE A PROGRAM TO PRINT ALL PRIME NUMBERS BETWWEN 100 AND 200class
class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 100 and 200 are:");

        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Not prime
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime
    }
}


//Qno 6 Write a program to print all palindrome number from 100 to 500
class PalindromeNumbers {

    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 100 and 500 are:");

        for (int num = 100; num <= 500; num++) {
            if (isPalindrome(num)) {
                System.out.print(num+" ");
            }
        }
    }

    // Function to check if a number is palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        return originalNum == revNum;
    }
}
