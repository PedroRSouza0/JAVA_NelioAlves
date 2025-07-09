import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C;

        System.out.println("Digite o valor de A");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C");
        C = sc.nextDouble();

        System.out.printf("Area triangulo = %.3f%n", A*C/2);
        System.out.printf("Area do circulo = %.3f%n",(C*3.14159)*C);
        System.out.printf("Area do trapezio = %.3f%n",(A+B)*C/2);
        System.out.printf("Area do Quadrado = %.3f\n",Math.pow(B,2));
        System.out.printf("Area do Retangulo = %.3f%n",A*B);

        sc.close();
        }
    }
