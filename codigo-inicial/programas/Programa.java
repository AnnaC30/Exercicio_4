package programas;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String toString() {
        return nome + " " + sobrenome + " - " + telefone;
    }
}

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Incluir pessoa");
            System.out.println("2 - Listar todos os cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                case 1:
                    if (contatos.size() < MAX_CONTATOS) {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Sobrenome: ");
                        String sobrenome = sc.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();

                        contatos.add(new Contato(nome, sobrenome, telefone));
                        System.out.println("Contato adicionado com sucesso!");
                    } else {
                        System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
                    }
                    break;
                case 2:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\nLista de contatos:");
                        for (Contato c : contatos) {
                            System.out.println(c);
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
