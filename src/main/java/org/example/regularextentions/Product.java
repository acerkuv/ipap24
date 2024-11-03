package org.example.regularextentions;

public class Product {
    public Product(String name, String number, String code) {
        this.name = name;
        this.number = number;
        this.code = code;
    }

    String name;
    String number;

    public String getCode() {
        return code;
    }

    String code;
}
