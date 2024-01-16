import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0;
        float percentage;
        String grade;
    
        Scanner s1= new Scanner(System.in);

        System.out.print("Enter Number of Subject: ");
        count = s1.nextInt();

        for (i = 1; i <= count; i++) {
            System.out.print("Enter Marks of " + i + " Subject out of 100 : ");
            float temp = s1.nextFloat(); 
            
            totalMarks += temp;
        }
        
        percentage = (totalMarks / (count * 100)) * 100;

        System.out.println("Total MArks : " + totalMarks);
        System.out.println("Percentage : " + percentage);

        // Each subject is of 100 Marks

        if (percentage>90.0){
            grade = "A";
            System.out.println("Grade : "+grade);
        }
        else if ( percentage <= 90.0 && percentage >80.0 ){
            grade = "B";
            System.out.println("Grade : "+grade);
        }
        else if (percentage <= 80.0 && percentage >70.0){
            grade = "C";
            System.out.println("Grade : "+grade);
        }
        else if (percentage <= 70.0 && percentage >60.0){
            grade = "D";
            System.out.println("Grade : "+grade);
        }
        else if (percentage <= 60.0 && percentage >50.0){
            grade = "E";
            System.out.println("Grade : "+grade);
        }
        else if (percentage <= 50.0 && percentage >40.0){
            grade = "F";
            System.out.println("Grade : "+grade);
        }
        else{
            grade="Fail";
            System.out.println("Grade : "+grade);

        }
    }
}