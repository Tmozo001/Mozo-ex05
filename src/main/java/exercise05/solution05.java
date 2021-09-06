/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Mozo
 */
/*
Psuedo
ask the user for a first number using print
scan number into an integer variable using scanner from keyboard
ask the user for a second number
scan number into another integer variable using scanner from keyboard
assign a variable to the answer of the math(sum sub times div)
convert the strings to integers with Integer.parseInt(string)
perform the math and assign the soln to variables
printf the solutions with the according variables and specifiers.
*/
package exercise05;
import java.util.Scanner;

public class solution05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the First number?");
        String first = input.nextLine();
         int num1 = Integer.parseInt(first);

        System.out.println("What is the Second number?");
        String second = input.nextLine();
        int num2 = Integer.parseInt(second);

        int sum = num1 + num2;
        int sub = num1 - num2;
        int times = num1 * num2;
        int div = (num1)/num2;

        System.out.printf("10 + 5 = %d\n10 - 5 = %d\n10 * 5 = %d\n10 / 5 = %d", sum, sub, times, div);
    }


}
