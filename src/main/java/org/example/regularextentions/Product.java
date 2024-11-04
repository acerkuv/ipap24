package org.example.regularextentions;

// Класс продукта  name = "стул", number  = "50", code = "ab46"
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
