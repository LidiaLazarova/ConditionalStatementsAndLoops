import java.util.Scanner;                 /*100/100*/

public class P02_ChooseADrink2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strProfession = scan.nextLine();
        int intGuantity = Integer.parseInt(scan.nextLine());


        if (strProfession.equals("Athlete")) {
            System.out.printf("The Athlete has to pay %.2f.", (intGuantity * 0.7));

        } else if (strProfession.equals("Businessman")) {
            System.out.printf("The Businessman has to pay %.2f.", (intGuantity * 1.0));
        } else if (strProfession.equals("Businesswoman")) {
            System.out.printf("The Businesswoman has to pay %.2f.", (intGuantity * 1.0));
        } else if (strProfession.equals("SoftUni Student")) {
            System.out.printf("The SoftUni Student has to pay %.2f.", (intGuantity * 1.70));
        } else {
            System.out.printf("The %s has to pay %.2f.", strProfession, (intGuantity * 1.20));
        }
    }
}
 