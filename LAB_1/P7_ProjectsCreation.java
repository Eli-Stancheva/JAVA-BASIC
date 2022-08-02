package BASICS.LAB_1;

import java.util.Scanner;

public class P7_ProjectsCreation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String Architect = (scan.next());
        int project = Integer.parseInt(scan.next());
        int a = project * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",Architect, a, project);
    }
}
