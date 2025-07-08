//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 19;
        double renda = 1.900;

        System.out.println("Olá Mundo");
        System.out.printf("%.2f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS\n",x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n",nome,idade,renda);


        // Casting
        int a, b;
        double resultado;

        a = 5;
        b = 2;
        resultado = (double) a / b;

        System.out.println(resultado);

        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        char p;
        p = sc.next().charAt(0);
        System.out.println("Voce digitou: " + p);

        sc.close(); // Finaliza o scanner
    }
}