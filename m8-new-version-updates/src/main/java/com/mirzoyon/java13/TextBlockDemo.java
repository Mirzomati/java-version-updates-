package com.mirzoyon.java13;

public class TextBlockDemo {
    public static void main(String[] args) {

        var address = "7925 Jones Branch drive \n" +
                "Mclean, va 22102";

        System.out.println(address);

        //will print it excatly how you write it.
        var address2 = """
                7925 Jones Branch Dr
                McLean, VA 22102
                """;
        System.out.println(address2);















    }
}
