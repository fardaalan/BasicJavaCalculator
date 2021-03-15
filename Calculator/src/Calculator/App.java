package Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculator Sederhana");
        appCalculator();
    }

    public static void appCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int numbA = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int numbB = scanner.nextInt();

        Calculator calculator = new Calculator(numbA, numbB);
        System.out.println(numbA + " + " + numbB + " = " + calculator.tambah());
        System.out.println(numbA + " - " + numbB + " = " + calculator.kurang());
        System.out.println(numbA + " / " + numbB + " = " + calculator.bagi());
        System.out.println(numbA + " x " + numbB + " = " + calculator.kali());
        System.out.println(numbA + " % " + numbB + " = " + calculator.modulus());
    }
}
