package com.devsuperior.demo.Entities;

public class Department {
    private long id;
    private String nome;
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

    public Department(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Department() {
    }
}