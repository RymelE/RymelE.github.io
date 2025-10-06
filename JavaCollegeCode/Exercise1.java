


//Write your imports here if needed
import java.util.Scanner;

public class Exercise1 {
public static void main(String [] args){
 // Write your code here
 Scanner input = new Scanner(System.in);
 System.out.println("Enter number of students: ");
 int students = input.nextInt();
 int[] scores = new int[students];
 System.out.println("Enter "+ students + "scores: ");

 for (int i = 0; i < students; i++){
     scores[i] = input.nextInt();
 }

 int best = scores[0];
 for (int i = 0; i < scores.length; i++){
     if (scores[i] > best){
         best = scores[i];
     }
 } 

 for (int i =0; i < students; i++){
     char grade;
     if (scores[i] >= best - 10){
         grade = 'A';
     } else if (scores[i] >= best - 20) {
         grade = 'B';
     } else if (scores[i] >= best - 30) {
         grade = 'C';
     } else if (scores[i] >= best - 40) {
         grade = 'D';
     } else {
         grade = 'F';
         }    

         System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
     }

     input.close();
 }
}
