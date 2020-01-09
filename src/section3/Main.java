package section3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu\n1.Crickeet Player Details\n2.Hockey Player Details");
        System.out.println("Enter choice");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1) {
            System.out.println("Enter player name");
            String name=sc.nextLine();
            System.out.println("Enter team name");
            String teamName=sc.nextLine();
            System.out.println("Enter number of matches played");
            int noOfMatches=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter total runs scored");
            int totalRunsScored=sc.nextInt();
            System.out.println("Enter the number of wickets taken");
            int noOfWicketsTaken=sc.nextInt();
            CricketPlayer c=new CricketPlayer(name, teamName, noOfMatches, totalRunsScored, noOfWicketsTaken);
            c.displayPlayerStatistics();
        }
        if(choice==2) {
            System.out.println("Enter player name");
            String name=sc.nextLine();
            System.out.println("Enter team name");
            String teamName=sc.nextLine();
            System.out.println("Enter number of matches played");
            int noOfMatches=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the position");
            String position=sc.nextLine();
            System.out.println("Enter number of goals taken");
            int noOfGoals=sc.nextInt();
            HockeyPlayer h=new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
            h.displayPlayerStatistics();
        }
        sc.close();

    }

}
