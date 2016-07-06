/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.resultscomparison;

import java.util.Scanner;

/**
 *
 * @author Bipins
 */
public class Program 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
 {
        
       System.out.println("Mark Sheet of the students:");
       System.out.println("1.   Name: Ramesh Aryal");
       System.out.println("2.   Name: Anju Shrestha");
       System.out.println("3.   Name: Ashish Prasai");
       Scanner input=new Scanner(System.in);
       
       while(true)
       {
           System.out.println("Choose the Symbol No. of the student.");
           int choice;
           choice= input.nextInt();
      
           String[] subjects={"English", "Nepali", "Science", "Maths", "Computer"};
           double[] marks=new double[subjects.length];
       
       switch(choice)
       {
           case 1:
           {
        for(int i=0; i<subjects.length;i++)
        {
            System.out.println("Enter marks for:" + subjects[i]);
            marks[i]= input.nextDouble();      
        }
        
       
       if(marks[0]<32 || marks[1]<32 || marks[2]<32 || marks[3]<32 || marks[4]<32)
         System.out.println("The result is Fail."); 
       else
       {
        System.out.println("Congratulations! You are pass.");
        
        double total=0;
        for(int i=0; i<subjects.length;i++)
        {
            total=total+marks[i];
        }
        
        System.out.println("The total marks is:"+ " " +total);
        
        double percentage = (total/500)*100;
        System.out.println("The total percentage is" + " " + percentage + "%");
        
         if (percentage >= 80)
        
            System.out.println("You are pass in Distinction.");
        
        else if (percentage < 80 && percentage >=60) 
        
            System.out.println("You are pass in First Division.");
        
        else if (percentage < 60 && percentage >= 45) 
        
            System.out.println("You are pass in Second Division.");
        
        else if(percentage < 45 && percentage >= 32) 
       
            System.out.println("You are pass in Third Division.");
       }
        }
           break;
             case 2:
           {
        for(int i=0; i<subjects.length;i++)
        {
            System.out.println("Enter marks for:" + subjects[i]);
            marks[i]= input.nextDouble();      
        }
        
       
       if(marks[0]<32 || marks[1]<32 || marks[2]<32 || marks[3]<32 || marks[4]<32)
         System.out.println("The result is Fail."); 
       else
       {
        System.out.println("Congratulations! You are pass.");
        
        double total=0;
        for(int i=0; i<subjects.length;i++)
        {
            total=total+marks[i];
        }
        
        System.out.println("The total marks is:"+ " " +total);
        
        double percentage = (total/500)*100;
        System.out.println("The total percentage is" + " " + percentage + "%");
        
         if (percentage >= 80)
        
            System.out.println("You are pass in Distinction.");
        
        else if (percentage < 80 && percentage >=60) 
        
            System.out.println("You are pass in First Division.");
        
        else if (percentage < 60 && percentage >= 45) 
        
            System.out.println("You are pass in Second Division.");
        
        else if(percentage < 45 && percentage >= 32) 
       
            System.out.println("You are pass in Third Division.");
       }
        }
             break;
               case 3:
           {
        for(int i=0; i<subjects.length;i++)
        {
            System.out.println("Enter marks for:" + subjects[i]);
            marks[i]= input.nextDouble();      
        }
        
       
       if(marks[0]<32 || marks[1]<32 || marks[2]<32 || marks[3]<32 || marks[4]<32)
         System.out.println("The result is Fail."); 
       else
       {
        System.out.println("Congratulations! You are pass.");
        
        double total=0;
        for(int i=0; i<subjects.length;i++)
        {
            total=total+marks[i];
        }
        
        System.out.println("The total marks is:"+ " " +total);
        
        double percentage = (total/500)*100;
        System.out.println("The total percentage is" + " " + percentage + "%");
        
         if (percentage >= 80)
        
            System.out.println("You are pass in Distinction.");
        
        else if (percentage < 80 && percentage >=60) 
        
            System.out.println("You are pass in First Division.");
        
        else if (percentage < 60 && percentage >= 45) 
        
            System.out.println("You are pass in Second Division.");
        
        else if(percentage < 45 && percentage >= 32) 
       
            System.out.println("You are pass in Third Division.");
       }
        }
             
    }
        System.out.println("DO YOU WANT TO CONTINUE? : ");
            if (input.next().equalsIgnoreCase("n")) 
                System.exit(0);
      }
 }
 }

    


    

