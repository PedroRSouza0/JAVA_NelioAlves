//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f\n",product1,price1);
        System.out.printf("%s, which price is  $ %.2f\n",product2,price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n",age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f%n",measure);
        System.out.printf("Rounded (three decimal places): %.3f\n",measure);
        // US DECIMAL POINT
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %f",measure);
    }
}