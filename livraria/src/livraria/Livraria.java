package livraria;

import java.util.Scanner;

public class Livraria {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opçao, qntestoque;
        String ISBN, titulo, cod;
        double preço, novopreço;
        livro l;

        cadastrolivros livraria = new cadastrolivros();

        do {
            exibemenu();
            System.out.println("digite a opção desejada");
            opçao = s.nextInt();

            switch (opçao) {
                case 1:
                    System.out.println("informe o ISBN do livro");
                    ISBN = s.next(); 
                    System.out.println("informe o titulo do livro");
                    titulo = s.next();
                    System.out.println("informe o preço do livro");
                    preço = s.nextDouble();
                    System.out.println("informe a quantidade em estoque do livro");
                    qntestoque = s.nextInt();
                    l = new livro(ISBN, titulo, preço, qntestoque);
                    livraria.cadastrar(l);
                    break;
                case 2:
                    livraria.exibircadastro();
                    break;
                case 3:
                    System.out.println("Informe o código do produto cujo preço queremos alterar: ");
                    cod = s.next();
                    System.out.println("informe o novo valor");
                    novopreço = s.nextDouble();
                    livraria.alterarpreço(cod, novopreço);
                    break;
                case 0:
                    break;
                default: 
                    System.out.println("Opção inválida!");        
            }
        }while (opçao != 0);
        
        
        

    
    
    
    }

    public static void exibemenu() {
        System.out.println(
                "Opções\n"
                + "1 – Cadastrar um livro\n"
                + "2 – Exibir livros cadastrados\n"
                + "3 – Alterar preço de um livro\n"
                + "0 – Sair do programa\n"
                + "Informe a opção:");
    }

}
