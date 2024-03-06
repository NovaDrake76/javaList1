// Crie um programa que receba um número inteiro como parâmetro, representando um
// número de segundos, e imprime o valor correspondente no formato “hh:mm:ss”. Por
// exemplo, para a entrada 9610, o programa deve imprimir “02:40:10”

import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Type the seconds...");

        int inputedSeconds = receiveNumber();
        int hours = (inputedSeconds / 60) / 60;
        int minutes = (inputedSeconds % 3600) / 60;
        int remainingSeconds = inputedSeconds % 60;

        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds));
    }

    public static int receiveNumber() {
        return scanner.nextInt();
    }

}
