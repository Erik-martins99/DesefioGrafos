package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grafo {
    private List<Pessoa> vertices;
    private List<Relacionamento> arestas;
    private Scanner sc;

    public Grafo(){
        this.vertices = new ArrayList<Pessoa>();
        this.arestas = new ArrayList<Relacionamento>();
        this.sc = new Scanner(System.in);
    }

    public void addVertice(String nome){
        Pessoa pessoa = new Pessoa(nome);
        vertices.add(pessoa);
    }

//    public void addAresta(Pessoa p1, Pessoa p2, Integer peso){
//        var relacionamento = new Relacionamento(p1, p2, peso);
//        this.arestas.add(relacionamento);
//    }

    public void addAresta(){
        try {
            for (int i = 0; i < vertices.size(); i++) {
                System.out.println(i + "- " + this.vertices.get(i).getNome());
            }
            System.out.println("informe o primeiro indice: ");
            var p1 = sc.nextInt();
            System.out.println("informe o segundo indice: ");
            var p2 = sc.nextInt();
            System.out.println("informe o peso: ");
            var peso = sc.nextInt();
            var relacionamento = new Relacionamento(vertices.get(p1), vertices.get(p2), peso);
            this.arestas.add(relacionamento);
        } catch (Exception e) {
            System.out.println("Erro valor invalido informado!");
        }
    }

    public void seeVertices(){
        System.out.println("\n");
        for(Relacionamento r: arestas){
            System.out.println("---------------------------");
            System.out.println(r.getP1().getNome() + " <----"
                    + r.getPeso() + "----> " + r.getP2().getNome());
            System.out.println("---------------------------");
        }
        System.out.println("\n");
    }
}
