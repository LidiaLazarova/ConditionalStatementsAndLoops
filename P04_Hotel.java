
import java.util.Scanner;

public class P04_Hotel {                                     /*100/100*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strMonth = scan.nextLine();
        int intNightsCount = Integer.parseInt(scan.nextLine());

        double dblPriceStudio = 0.00;
        double dblPriceDouble = 0.00;
        double dblPriceSuite = 0.00;

        if (intNightsCount <= 7 && (strMonth.equals("May") || strMonth.equals("October"))) {
            dblPriceStudio = 50.00 * intNightsCount;
            dblPriceDouble = 65.00 * intNightsCount;
            dblPriceSuite = 75.00 * intNightsCount;


        } else if (intNightsCount > 7 && strMonth.equals("May")) {
            dblPriceStudio = ((50.00 * intNightsCount) - ((50.00 * intNightsCount) * 0.05));
            dblPriceDouble = 65.00 * intNightsCount;
            dblPriceSuite = 75.00 * intNightsCount;


        } else if (intNightsCount > 7 && strMonth.equals("October")) {
            dblPriceStudio = (50.00 * (intNightsCount - 1.0) - (50.00 * (intNightsCount - 1.0) * 0.05));
            dblPriceDouble = 65.00 * intNightsCount;
            dblPriceSuite = 75.00 * intNightsCount;


        } else if (intNightsCount <= 7 && (strMonth.equals("June") || strMonth.equals("September"))) {
            dblPriceStudio = 60.00 * intNightsCount;
            dblPriceDouble = 72.00 * intNightsCount;
            dblPriceSuite = 82.00 * intNightsCount;

        } else if (intNightsCount > 7 && intNightsCount <= 14 && (strMonth.equals("September") || strMonth.equals("June"))) {
            dblPriceStudio = (60.00 * (intNightsCount - 1.0));
            dblPriceDouble = 72.00 * intNightsCount;
            dblPriceSuite = 82.00 * intNightsCount;

        } else if (intNightsCount > 14 && (strMonth.equals("September") || strMonth.equals("June"))) {
            dblPriceStudio = (60.00 * (intNightsCount - 1.0));
            dblPriceDouble = ((72.00 * intNightsCount) - ((72.00 * intNightsCount) * 0.1));
            dblPriceSuite = 82.00 * intNightsCount;


        } else if (intNightsCount <= 14 && (strMonth.equals("July") || strMonth.equals("August") || strMonth.equals("December"))) {
            dblPriceStudio = 68.00 * intNightsCount;
            dblPriceDouble = 77.00 * intNightsCount;
            dblPriceSuite = 89.00 * intNightsCount;


        } else if (intNightsCount > 14 && (strMonth.equals("July") || strMonth.equals("August") || strMonth.equals("December"))) {
            dblPriceStudio = 68.00 * intNightsCount;
            dblPriceDouble = 77.00 * intNightsCount;
            dblPriceSuite = ((89.00 * intNightsCount) - ((89.00 * intNightsCount) * 0.15));

        }

        System.out.printf("Studio: %.2f lv.\n", dblPriceStudio);
        System.out.printf("Double: %.2f lv.\n", dblPriceDouble);
        System.out.printf("Suite: %.2f lv.\n", dblPriceSuite);

    }
}
