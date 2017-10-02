import java.util.Scanner;                /*100/100 */

public class P03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intGroupSize = Integer.parseInt(scan.nextLine());
        String strPackage = scan.nextLine();

        double dblPrise = 0.0;

        if (intGroupSize <= 50 && strPackage.equals("Normal")) {
            dblPrise = ((2500 + 500) - ((2500 + 500) * 0.05)) / intGroupSize;
            System.out.println("We can offer you the Small Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);
        } else if (intGroupSize <= 50 && strPackage.equals("Gold")) {
            dblPrise = ((2500 + 750) - ((2500 + 750) * 0.1)) / intGroupSize;
            System.out.println("We can offer you the Small Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);
        } else if (intGroupSize <= 50 && strPackage.equals("Platinum")) {
            dblPrise = ((2500 + 1000) - ((2500 + 1000) * 0.15)) / intGroupSize;
            System.out.println("We can offer you the Small Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);

        } else if (intGroupSize > 50 && intGroupSize <= 100 && strPackage.equals("Normal")) {
            dblPrise = ((5000 + 500) - ((5000 + 500) * 0.05)) / intGroupSize;
            System.out.println("We can offer you the Terrace");
            System.out.printf("The price per person is %.2f$", dblPrise);

        } else if (intGroupSize > 50 && intGroupSize <= 100 && strPackage.equals("Gold")) {
            dblPrise = ((5000 + 750) - ((5000 + 750) * 0.1)) / intGroupSize;
            System.out.println("We can offer you the Terrace");
            System.out.printf("The price per person is %.2f$", dblPrise);

        } else if (intGroupSize > 50 && intGroupSize <= 100 && strPackage.equals("Platinum")) {
            dblPrise = ((5000 + 1000) - ((5000 + 1000) * 0.15)) / intGroupSize;
            System.out.println("We can offer you the Terrace");
            System.out.printf("The price per person is %.2f$", dblPrise);

        } else if (intGroupSize > 100 && intGroupSize <= 120 && strPackage.equals("Normal")) {
            dblPrise = ((7500 + 500) - ((7500 + 500) * 0.05)) / intGroupSize;
            System.out.println("We can offer you the Great Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);

        } else if (intGroupSize > 100 && intGroupSize <= 120 && strPackage.equals("Gold")) {
            dblPrise = ((7500 + 750) - ((7500 + 750) * 0.1)) / intGroupSize;
            System.out.println("We can offer you the Great Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);
        } else if (intGroupSize > 100 && intGroupSize <= 120 && strPackage.equals("Platinum")) {
            dblPrise = ((7500 + 1000) - ((7500 + 1000) * 0.15)) / intGroupSize;
            System.out.println("We can offer you the Great Hall");
            System.out.printf("The price per person is %.2f$", dblPrise);
        } else {
            System.out.println("We do not have an appropriate hall.");

        }
    }

}