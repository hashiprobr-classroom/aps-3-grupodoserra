package br.edu.insper.desagil.aps3.tindfy;

public class Pessoa {
    private int identificador;
    private String nome;

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }
}
