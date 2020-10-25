package com.anskul.lab_5;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Branchs branchs = new Branchs();
        branchs = branchs.loadJason("https://api.privatbank.ua/p24api/pboffice?json&city=%D0%94%D0%BD%D0%B5%D0%BF%D1%80%D0%BE%D0%BF%D0%B5%D1%82%D1%80%D0%BE%D0%B2%D1%81%D0%BA&address=%D0%A2%D0%B8%D1%82%D0%BE%D0%B2%D0%B0");
        System.out.println(branchs);

    }
}
