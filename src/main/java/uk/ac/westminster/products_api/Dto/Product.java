package uk.ac.westminster.products_api.Dto;

public class Product {
    private Integer id;
    private String name;
    private double price;

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
