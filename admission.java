import java.util.Scanner;
;public class Admissions 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SATrank = 0;
        int rankclass = 0;
        int awarkrank = 0;
        int residence = 0;

        System.out.println("To see if you will be accepted into this college you must answer a few quetions");
        System.out.println("What is your SAT score?");
        int SAT = scanner.nextInt();
        if (SAT >=1500) {
            SATrank = 3;
        } else if (SAT < 1500 && SAT >= 1400) {
            SATrank = 2;
        } else if (SAT < 1400 && SAT >= 1200) {
            SATrank = 1;
        }
        System.out.println("What is your Class Rank?");
        int classrank = scanner.nextInt();
        if (classrank >=95) {
            rankclass = 3;
        } else if (classrank < 95 && classrank >= 90) {
            rankclass = 2;
        } else if (classrank < 90 && classrank >= 85) {
            rankclass = 1;
        }
        
        System.out.println("how many awards have you won?");
        int awards = scanner.nextInt();
        if (SAT >=1500) {
            SATrank = 3;
        } else if (SAT < 1500 && SAT >= 1400) {
            SATrank = 2;
        } else if (SAT < 1400 && SAT >= 1200) {
            SATrank = 1;
        }
        System.out.println("where are you from?");
        int residence = scanner.nextInt();

        


    }
}