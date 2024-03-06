// Crie um programa que percorre um vetor de palavras (Strings) e busca por uma palavra
// digitada pelo usuário. O vetor de palavras pode ser inicializado diretamente no código (não
// é necessário informar todas as palavras do vetor por linha de comando, apenas a palavra a
// ser buscada). O programa deve informar ao usuário se a palavra foi encontrada ou não e,
// no momento em que esta for encontrada, a busca deve ser interrompida imediatamente. O
// programa deve continuamente esperar que o usuário digite novas palavras, até que ele
// digite “sair”, o que encerra o programa

import java.util.Scanner;

class Question3 {

    public static void main(String[] args) {
        String word = "";
        String[] list = { "gato", "moto", "restaurante", "cachorro" };

        boolean isLooping = true;

        while (isLooping) {
            System.out.println("type a word...");
            word = receiveWord();
            if (!word.equals("Sair")) {
                System.out.println(findWordInList(word, list));
            } else {
                isLooping = false;
            }
        }
    }

    public static String receiveWord() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        return word;
    }

    public static String findWordInList(String word, String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(word)) {
                return ("found " + word + " in position " + i + " of the list");
            }
        }

        return (word + " not found on list");
    }
}
