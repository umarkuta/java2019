
/**
 * Write a description of class SwitchCase here.
 
/*
 * @author (your name)
 * @version (a version number or a date)
 
*/

import java.util.Scanner;

public class SwitchCase
{
   
 public static void main(String [] args)
    {
    
    int score ;
     
   char grade;
      
  Scanner input = new Scanner(System.in);
      
  System.out.println("Enter your score");
      
  score = input.nextInt();
       
 switch (score){
      
  case 90:
          
  grade= 'A';
         
   break;
     
   case 80:
         
   grade= 'B';
        
    break;
     
   case 70:
        
    grade= 'C';
         
   break;
     
   case 60:
         
   grade= 'D';
           
 break;
   
     default:
         
   grade= 'F';
     
   }
      
  System.out.println("Your test score is "+ score
         + ", which is equivalent to the grade " + grade + ".");
  
   }

}
