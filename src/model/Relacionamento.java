package model;

public class Relacionamento {
    private Pessoa p1;
    private Pessoa p2;
    private Integer peso;

    public Relacionamento(Pessoa p1, Pessoa p2, Integer peso){
        this.p1 = p1;
        this.p2 = p2;
        this.peso = peso;
    }

    public Pessoa getP1() {
        return p1;
    }

    public void setP1(Pessoa p1) {
        this.p1 = p1;
    }

    public Pessoa getP2() {
        return p2;
    }

    public void setP2(Pessoa p2) {
        this.p2 = p2;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
