package lojabrinquedo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        boolean continuarLooping = true;
        while (continuarLooping) {

            System.out.println("---------Escolha uma das opções abaixo---------");
            System.out.println("|   Opção 1 - Cadastrar brinquedos            |");
            System.out.println("|   Opção 2 - Mostrar brinquedos cadastrados  |");
            System.out.println("|   Opção 3 - Sair do programa                |");
            System.out.println("-----------------------------------------------");

            int operacao = entrada.nextInt();

            switch (operacao) {

                case 1:

                    System.out.println("--Qual brinquedo você gostaria de cadastrar no sistema?--");
                    System.out.println("|   Opção 1 - Boneca        |");
                    System.out.println("|   Opção 2 - Carrinho      |");
                    System.out.println("|   Opção 3 - Tabuleiro     |");
                    System.out.println("---------------------------------------");

                    System.out.println("Digite aqui sua opção: ");
                    int opcao = entrada.nextInt();

                    switch (opcao) {
                        case 1:

                            System.out.println("Digite o nome da boneca: ");
                            String nomeBoneca = entrada.next();
                            System.out.println("Digite o Id da boneca: ");
                            String idBoneca = entrada.next();
                            System.out.println("Digite a marca da boneca: ");
                            String marcaBoneca = entrada.next();
                            System.out.println("Digite a classificação indicativa da boneca: ");
                            String classIndicativaBoneca = entrada.next();
                            Boneca boneca = new Boneca(nomeBoneca, idBoneca, marcaBoneca, classIndicativaBoneca);
                            estoque.addBrinquedo(boneca);
                            break;
                        case 2:

                            System.out.println("Digite o nome do carrinho: ");
                            String nomeCarrinho = entrada.next();
                            System.out.println("Digite o Id do carrinho: ");
                            String IdCarrinho = entrada.next();
                            System.out.println("Digite a marca da carrinho: ");
                            String marcaCarrinho = entrada.next();
                            System.out.println("Digite a classificação indicativa da carrinho: ");
                            String classIndicativaCarrinho = entrada.next();
                            Carrinho carrinho = new Carrinho(nomeCarrinho, IdCarrinho, marcaCarrinho, classIndicativaCarrinho);
                            estoque.addBrinquedo(carrinho);
                            break;

                        case 3:

                            System.out.println("Digite o nome do tabuleiro: ");
                            String nomeTabuleiro = entrada.next();
                            System.out.println("Digite o Id do tabuleiro: ");
                            String idTabuleiro = entrada.next();
                            String marcaTabuleiro = entrada.next();
                            System.out.println("Digite a classificação indicativa da tabuleiro: ");
                            String classIndicativaTabuleiro = entrada.next();
                            Tabuleiro tabuleiro = new Tabuleiro(nomeTabuleiro, idTabuleiro, marcaTabuleiro, classIndicativaTabuleiro);
                            estoque.addBrinquedo(tabuleiro);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opcao);
                    }

                case 2:
                    continuarLooping = false;
                    estoque.mostrarLista();
                    break;
                case 3:
                    continuarLooping = false;
                    break;

            }

        }
    }
}




