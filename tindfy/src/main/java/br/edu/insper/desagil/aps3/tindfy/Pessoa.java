package br.edu.insper.desagil.aps3.tindfy;

public class Pessoa {
    private int id;
    private String nome;
    public Pessoa(int id ,String nome){
        this.nome=nome;
        this.id=id;
    }
    public int getId(){return id;}
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome=nome;}


}
