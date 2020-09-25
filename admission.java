import java.util.Scanner;
;public class admission
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SATrank = 0;
        int rankclass = 0;
        int awarkrank = 0;
        int rankresidence = 1;

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

        if (awards >=10) {
            awarkrank = 3;
        } else if (awards < 10 && awards >= 8) {
            awarkrank = 2;
        } else if (awards < 8 && awards >= 3) {
            awarkrank = 1;
        }
        System.out.println("where are you from?");
        String residence = scanner.next();

        if (residence.equals("colorado") ) {
            rankresidence = 3;
        } else if (residence.equals("florida")) {
            rankresidence = 0;
        }

        if (rankresidence == 0 || rankclass == 0 || awarkrank == 0 || SATrank == 0) {
            System.out.println("You will not be accepted to this college.");
        } else if ((rankclass + rankresidence + awarkrank + SATrank) >= 6) {
            System.out.println("You will be accepted to this college.");
        }
    }
}