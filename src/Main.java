import model.Grafo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var grafo = new Grafo();

        var num = 0;
        while (num<1){
            System.out.println("1- adicionar Pessoa\n" +
                    "2- Adicionar relacionamento\n" +
                    "3- Listar Relacionamento\n" +
                    "0- sair");
            var op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    System.out.println("Informe o nome da pessoa: ");
                    var nome = sc.nextLine();
                    grafo.addVertice(nome);
                    break;
                case 2:
                    grafo.addAresta();
                    break;
                case 3:
                    grafo.seeVertices();
                    break;
                case 0:
                    num++;
            }
        }
    }
}