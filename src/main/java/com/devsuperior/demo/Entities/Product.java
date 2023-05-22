package com.devsuperior.demo.Entities;

public class Product {
    public Product(long id, String nome, double price, Department department) {
        this.id = id;
        this.nome = nome;
        this.price = price;
        this.department = department;
    }
    public Product(){}

    private long id;
    private String nome;
    private double price;
    private Department department;
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
