package CollegeStuff.labprograms.Java.main;


// Main hub to run various Java programs if using other packages
// I have not used since its in same package
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.studentdetails;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.substringfunc;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.sumofproducts;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.matrixrowsum;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.mirrorinverse;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.numericswitch;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.fibonnaccinum;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.matrixaddsub;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.salarycheck;
import CollegeStuff.labprograms.Java.srcprogram.ScannerRunner.distancefeet;


import java.lang.System;
import java.lang.Exception;
import java.util.Scanner;
import java.util.InputMismatchException;


public class mainHubVS {
     public static void main(String[] args) throws Exception {
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired program :");
        System.out.println("1: Student Details");
        System.out.println("2: Sum of Products");
        System.out.println("3: Matrix Row Sum");
        System.out.println("4: Mirror Inverse");
        System.out.println("5: Numeric Switch");
        System.out.println("6: Fibonacci Number");
        System.out.println("7: Matrix addition and subtraction");
        System.out.println("8: Salary Check of Employee");
        System.out.println("9: Distance in Feet and Inches");
        
        try {
            System.out.print("Fetch the program using the number: ");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Program to access student details name and marks in 2 subjects and find their total marks, average and grade them accordingly");
                    studentdetails student = new studentdetails();
                    student.studentinfo();
                    break;
                case 2:
                    System.out.println("Program to read two inputs having same digits and multiplying each inputs digit with other and find their SOP");
                    sumofproducts sop = new sumofproducts();
                    sop.sop();
                    break;
                case 3:
                    System.out.println("Program to create a matrix of two dimensions and find sum of each row");
                    matrixrowsum twodim = new matrixrowsum();
                    twodim.matrixrow();
                    break;
                case 4:
                    System.out.println("Program to check whether the array is a mirror inverse ");
                    mirrorinverse flip = new mirrorinverse();
                    flip.mirrorreverse();
                    break;
                case 5:
                    System.out.println("Program to input two numbers and peform arthmetic operations using switch case ");
                    numericswitch maths = new numericswitch();
                    maths.arithmeticswitch();
                    break;
                case 6:
                    System.out.println("Program to find Fibonnacci number by inputting the range from start till end using java ");
                    fibonnaccinum fibonnacci = new fibonnaccinum();
                    fibonnacci.fibonnacii();
                    break;
                case 7:
                    System.out.println("Program to add and subtract two matrices of same dimensions");
                    matrixaddsub matrix = new matrixaddsub();
                    matrix.matrixaddingsubing();
                    break;
                case 8:
                    System.out.println("Program to check salary of employee and calculate PF, DA, HRA, Gross and Net Salary");
                    salarycheck salary = new salarycheck(); 
                    salary.employeeSalaryCheck();
                    break;
                case 9:
                    System.out.println("Program to extract String elements ");
                    substringfunc extract = new substringfunc();
                    extract.ExtractString();
                    break;
                case 10:
                    System.out.println("Program to find distance in feet and inches");
                    distancefeet feet = new distancefeet();
                    feet.feetfinder();
                    break;
                default:
                    System.out.println("Not in my .$directory please take that L and cope");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        } finally {
            input.close();
        }
        System.out.println("Thank you for using the Notslig$directory!");
        System.exit(0);   
  }
}
