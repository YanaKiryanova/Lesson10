package org.example;


public class Dop {

    public static void word(String str) {
        String[] arr = str.replace(", ", " ").replace(".", "").split(" ");
        String max = arr[0];
        String min = arr[0];

        for (String word : arr) {
            if (word.length() >= max.length()) {
                max = word;
            } else if (word.length() <= min.length() && word.length() > 2) {
                min = word;
            }
        }
        System.out.println("Саммое длинное слово в предложении = " + max + "\n" + "Саммое короткое слово в предложении (Исключая предлог)= " + min);
    }

    public static void duplicat3(String str) {
        String nStr = str.replaceAll(".", "$0$0");
        System.out.println(nStr);
    }

    public static void dupl3(String str) {
        String[] strin = str.split("");
        String[] nStr = new String[strin.length * 2];
        int i = 0;
        int j = 0;
        while (i < nStr.length) {
            if (i % 2 == 0) {
                nStr[i] = strin[j];
                i++;
            } else {
                nStr[i] = strin[j];
                j++;
                i++;
            }
        }
        String arrayToString = String.join("", nStr);
        System.out.println(arrayToString);
    }
}

