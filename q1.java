// Crie um programa que recebe um número inteiro positivo n (tamanho do array a ser
// criado), e uma sequência de n números inteiros e os armazena em um array. O programa
// deve em seguida percorrer este array e imprimir apenas os números pares.
// Objetivo: Exercitar declaração, inicialização e operação em arrays, uso da classe Scanner,
// estruturas de repetição, estruturas condicionais.

import java.util.Scanner;

class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert the length of the array");
        int arrayLength = receiveNumber();
        int[] array = new int[arrayLength];

        System.out.println("Insert the numbers of the array");

        for (int i = 0; i < arrayLength; i++) {
            array[i] = receiveNumber();
        }

        if (array.length > 0) {
            printEven(array);
        }

    }

    public static int receiveNumber() {
        return s.nextInt();
    }

    public static void printEven(int[] array) {
        System.out.println("The even numbers are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}