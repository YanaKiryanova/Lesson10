package org.example;

public class Contract {
    public static void subString(String str) {
        String nStr = str.substring(0, 13).replaceAll("\\W[a-zA-Z]{3}\\W", "-");
        System.out.println(nStr);

    }

    public static void replaceAll(String str) {
        String nStr = str.replaceAll("\\W[a-zA-Z]{3}\\W", "-***-");
        System.out.println(nStr);
    }

    public static void toLowerCase(String str) {
        String nStr = str.substring(5).replaceAll("[0-9]", "").replace("--", "/").replace("-YX", "/Y/X").toLowerCase();
        System.out.println(nStr);
    }

    public static void StringBild(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.delete(0, 5).delete(4, 9).deleteCharAt(8).replace(9, 10, "/").replace(3, 4, "/").replace(7, 8, "/");
        String nStr = stringBuilder.toString().toLowerCase();
        System.out.println(nStr);
    }

    public static void contains(String str) {
        String abc = "ABC";
        System.out.println(str.toLowerCase().contains(abc.toLowerCase()));
    }

    public static void start(String str) {
        System.out.println(str.startsWith("555"));
    }

    public static void end(String str) {
        System.out.println(str.endsWith("1a2b"));
    }

}
