import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class EXsEstSeq {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        // 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        System.out.println("EXERCICIO 1");

        System.out.println("Valor 1: ");
        a = sc.nextInt();

        System.out.println("Valor 2: ");
        b = sc.nextInt();

        soma = a + b;
        System.out.println("Soma = " + soma);


        // EX2 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        System.out.println("EXERCICIO 2");
        double raio, area;
        double pi = 3.14159;

        System.out.print("Valor do raio: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio,2);
        System.out.printf("\nSaída = %.4f%n",area);


        //EX 3 -  Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        System.out.println("EXERCICIO 3");
        int A, B, C, D;
        int diferenca;
        System.out.println("A: ");
        A = sc.nextInt();
        System.out.println("B: ");
        B = sc.nextInt();
        System.out.println("C: ");
        C = sc.nextInt();
        System.out.println("D: ");
        D = sc.nextInt();
        System.out.println();
        diferenca = A * B - C * D;
        System.out.println("Diferenca = " + diferenca);

        //EX 4 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.
        System.out.println("EXERCICIO 4");
        int number, hours;
        double earn, salario;
        System.out.println("Write your number: ");
        number = sc.nextInt();
        System.out.println("Digite o numero de horas trablhadas:");
        hours = sc.nextInt();
        System.out.println("Now, if you can write how much you get by hour: ");
        earn = sc.nextDouble();

        salario = earn * hours;
        System.out.printf("Numero: %d. Salario = $%.2f",number,salario);

        //EX 5 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
        System.out.println("EXERCICIO 5");
        int cod, qtn;
        int cod2, qtn2;
        double valor1, valor2;

        System.out.println("PEÇA 1: ");
        System.out.println("Codigo: ");
        cod = sc.nextInt();
        System.out.println("Valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Quantidade: ");
        qtn = sc.nextInt();

        System.out.println("PEÇA 2: ");
        System.out.println("Codigo: ");
        cod2 = sc.nextInt();
        System.out.println("Valor: ");
        valor2 = sc.nextDouble();
        System.out.println("Quantidade: ");
        qtn2 = sc.nextInt();

        System.out.printf("Valor a pagar R$ %.2f",valor1 * qtn + valor2 * qtn2); // Soma os valores e multiplica pela quantidade
        sc.close();
        }
    }
