package section4;

import java.util.Scanner;

public class MainException {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     try {
         System.out.println("Enter your age");
         int age=sc.nextInt();
         if(age<19) {
             throw new InvalidAgeException();
         }else {
             System.out.println("Welcome to vote");
         }
     }catch(InvalidAgeException e) {
         System.out.println("Exception occured: "+e+": not valid");
     }finally {
         sc.close();
     }

    }

}
