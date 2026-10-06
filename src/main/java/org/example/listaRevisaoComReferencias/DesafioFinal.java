package org.example.listaRevisaoComReferencias;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioFinal {

    private static final Scanner sc = new Scanner(System.in);

    private static final HashMap<String, Filme> filmes = new HashMap<>();

    public static void main(String[] args) {

        int escolha = 0;
        while (escolha != 5) {
            try {
                System.out.println("=== MEU CATÁLOGO ===");
                System.out.println("1 - Cadastrar filme");
                System.out.println("2 - Listar filmes");
                System.out.println("3 - Buscar por título");
                System.out.println("4 - Estatísticas");
                System.out.println("5 - Sair");
                System.out.print("Escolha: ");
                escolha = sc.nextInt();
                sc.nextLine();
                switch (escolha) {
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        listar();
                        break;
                    case 3:
                        buscarPorTitulo();
                        break;
                    case 4:
                        estatisticas();
                        break;
                    case 5:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException ie) {
                System.out.println("Insira um número como opção do menu.");
                sc.nextLine();
            }
        }
    }


    static void cadastrar() {
        Filme filme = new Filme();
        System.out.print("Título: ");
        filme.titulo = sc.nextLine();
        System.out.print("Gênero: ");
        filme.genero = sc.nextLine().toUpperCase();
        System.out.print("Nota: ");
        filme.nota = sc.nextDouble();

        if (filme.nota < 0 || filme.nota > 10) {
            System.out.println("A nota cadastrada deve estar entre 0 e 10.");
            return;
        }

        filme.classificacao = classificar(filme.nota);

        filmes.put(filme.titulo.toLowerCase(), filme);
    }

    static String classificar(double nota) {
        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    static void listar() {
        for (Filme filme : filmes.values()) {
            formatarFilme(filme);
        }
    }

    static void buscarPorTitulo() {
        System.out.print("Qual filme você deseja procurar? ");
        String titulo = sc.nextLine();

        Filme filme = filmes.get(titulo.toLowerCase());

        if (filme == null) {
            System.out.println("Filme não encontrado.");
            return;
        }

        formatarFilme(filme);
    }

    static void estatisticas() {
        System.out.println("Estão cadastrados " + filmes.size() + " filmes.");
        System.out.printf("Média de notas: %.2f \n", calcularMedia());
        getFilmeMaiorNota();
        filmesOtimos();
    }

    static double calcularMedia() {
        if(filmes.isEmpty()){
            return 0;
        }

        double soma = 0;
        for (Filme filme : filmes.values()) {
            soma += filme.nota;
        }

        return soma / filmes.size();
    }

    static void getFilmeMaiorNota() {
        if(filmes.isEmpty()){
            System.out.println("Não existem filmes cadastrados.");
            return;
        }
        Filme maior = new Filme();
        maior.nota = -1;
        for (Filme filme : filmes.values()) {
            if (filme.nota >= maior.nota) {
                maior = filme;
            }
        }
        System.out.println("Filme com maior nota: ");
        formatarFilme(maior);
    }

    static void filmesOtimos() {
        int i = 0;
        for (Filme filme : filmes.values()) {
            if (filme.nota >= 8) {
                i += 1;
            }
        }
        System.out.println("Existem " + i + " filmes com nota 'Ótimo'");
    }

    static void formatarFilme(Filme filme) {
        System.out.println(filme.titulo + " [" + filme.genero + "] - Nota " + filme.nota + " - " + filme.classificacao);
    }
}