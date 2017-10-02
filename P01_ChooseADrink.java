import java.util.Scanner;                                     /*100/100*/

public class P01_ChooseADrink {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strProfession = scan.nextLine();

        switch (strProfession) {
            case "Athlete":
                System.out.println("Water");
                break;
            case "Businessman":
            case "Businesswoman":
                System.out.println("Coffee");
                break;
            case "SoftUni Student":
                System.out.println("Beer");
                break;
            default:
                System.out.println("Tea");
                break;
        }
    }
}
 
 