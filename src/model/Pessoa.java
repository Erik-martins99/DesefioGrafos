package model;

public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome.toLowerCase();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
