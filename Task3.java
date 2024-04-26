import java.util.Scanner;
public class Task3{
    /**
     * @param args
     */
    public static void main(String[] args){
        /*Write a JAVA program to find the maximum between three numbers. */
        // int a= 10,b=20,c=30;
        // if (a>b && a>c){
        //     System.out.println("The greatest number is " + a);
        // }
        // else if (b>c && b>a){
        //     System.out.println("The greatest number is"+ b);
        // }
        // else{
        //     System.out.println("The greatest number is" + c);
        // }


        /*Write a JAVA program to check whether a 
        number is negative, positive, or zero. */
        // int a=10;
        // if (a>0){
        //         System.out.println("It is a positive number");
        // }
        // else if (a<0){
        //         System.out.println("It is a negative number");
        // }
        // else if (a==0){
        //         System.out.println("It is ZERO");
        // }
        // else{
        //         System.out.println("Invalid number");
        // }

        /* Write a JAVA program to check whether 
        a number is divisible by 5 and 11 or not.*/
        // int a=19;
        // if (a%5==0){
        //         System.out.println("It is divisible by 5");
        // }
        // else if (a%11==0){
        //         System.out.println("It is divisible by 11");

        // }
        // else{
        //         System.out.println("Invalid number");
        // }

        /*Write a JAVA program to check whether 
        a number is even or odd. */
        // int num=40;
        // if (num%2==0){
        //         System.out.println("It is an even number");
        // }
        // else if(num%3==0){
        //         System.out.println("It is an odd number");
        // }
        // else{
        //         System.out.println("It is an invalid number");
        // }


        /* Write a JAVA program to check whether a year is a leap year or not. */
        // Scanner year = new Scanner(System.in);
        // System.out.println("Enter a year :");
        // int y=year.nextInt();
        // if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
        //         System.out.println(y + " is a leap year");
        // }
        // else{
        //         System.out.println(y + " is not a leap year");
        // }
        // year.close();



        /*Write a JAVA program to input any alphabet 
        and check whether it is vowel or consonant. */
        // Scanner cw = new Scanner(System.in);
        // System.out.print("Enter an alphabet: ");
        // char ch = cw.next().charAt(0);
        
        // // Convert the alphabet to lowercase for easier comparison
        // ch = Character.toLowerCase(ch);
        
        // // Check if the entered character is a vowel or a consonant
        // if (ch >= 'a' && ch <= 'z') {
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         System.out.println(ch + " is a vowel.");
        //     } else {
        //         System.out.println(ch + " is a consonant.");
        //     }
        // } else {
        //     System.out.println("Invalid input. Please enter an alphabet.");
        // }
        
        // cw.close();


        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) 
        and converts it to the corresponding GPA value. Use a switch case statement to 
        handle different grades.*/
        // Scanner result = new Scanner(System.in);
        // System.out.print("Enter student's grade (A, B, C, D, or F): ");
        // char grade = result.next().toUpperCase().charAt(0);
        
        // double gpa;
        
        // switch (grade) {
        //     case 'A':
        //         gpa = 4.0;
        //         break;
        //     case 'B':
        //         gpa = 3.0;
        //         break;
        //     case 'C':
        //         gpa = 2.0;
        //         break;
        //     case 'D':
        //         gpa = 1.0;
        //         break;
        //     case 'F':
        //         gpa = 0.0;
        //         break;
        //     default:
        //         System.out.println("Invalid grade entered.");
        //         return; // Exit the program if an invalid grade is entered
        // }
        
        // System.out.println("Equivalent GPA: " + gpa);
        
        // result.close()

        /* Create a Java program that takes two numbers and an operator (+, -, *, /) as 
        inputs and performs the corresponding arithmetic operation using a switch case statement.*/
        Scanner op = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        double num1 = op.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = op.nextDouble();
        System.out.println("Enter operator(+,-,*,/)");
        char operator = op.next().charAt(0);

        switch (operator) {
            case '+':
                double result = num1+num2;
                System.err.println("Addition:" +result);
                break;
            case '-':
                double result1 = num1-num2;
                System.out.println("Subtraction:" +result1);
                break;
            case '*':
                double result2 = num1*num2;
                System.out.println("Multiplication:" +result2);
                break;
            case '/':
                double result3 = num1/num2;
                System.out.println("Division:" +result3);
                break;
            default:
                System.out.println("Invalid operator.");                
                break;
        }
        
        op.close();


        /*Write a Java program that takes an integer input (1 to 12) representing a month and 
        prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        Scanner ritu = new Scanner(System.in);
        System.out.println("Enter a month (1 to 12):");
        int month = ritu.nextInt();

        switch (month) {
            case 1,2,3:
                System.out.println("Winter Season.");
                break;
            case 4,5,6:
                System.out.println("Spring Season");
                break;
            case 7,8,9:
                System.out.println("Summer Season");
                break;
            case 10,11,12:
                System.out.println("Fall Season");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }

        ritu.close();

        /*Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle)
         based on the user's choice using a switch case. */
        Scanner geometry = new Scanner(System.in);
        System.out.println("Shape Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your shape: ");
        int shape = geometry.nextInt();

        double area = 0;

        switch (shape) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = geometry.nextDouble();
                area = 3.14 * radius * radius;
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = geometry.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double breadth = geometry.nextDouble();
                area = length * breadth;
                break;
            case 3: // Square
                System.out.print("Enter the side length of the square: ");
                double side = geometry.nextDouble();
                area = side * side;
                break;
            case 4: // Triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = geometry.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = geometry.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("The area of the shape is: " + area + "sq.cm");

        geometry.close();

    }
}