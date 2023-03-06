package livraria;

public class cadastrolivros {

    private livro[] livros;
    private int qtd;

    public cadastrolivros() {
        livros = new livro[500];
        
    }

    public void cadastrar(livro l) {
        if (this.qtd < this.livros.length) {
            int pos = buscasimples(l);
            if (pos == -2 || pos == -1) {
                this.livros[this.qtd] = l;
                this.qtd++;
                System.out.println("cadastro realizado");
            } else {
                System.out.println("produto repetido, cadastro nao realizado");
            }
        } else {
            System.out.println("cadastro cheio, cadastro nao realizado");
        }
    }

    public int buscasimples(livro l) {
        if (this.qtd == 0) {
            return -2;  // vetor esta vazio
        } else {
            for (int i = 0; i < this.qtd; i++) {
                if (this.livros[i].compareTo(l) == 0) {
                    return i;
                }
            }
            return -1; // indicar que não achou
        }
    }

    public void exibircadastro() {
        if (this.qtd == 0) {
            System.out.println("Cadastro vazio!");
        } else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(this.livros[i]);
            }
        }
    }

    private int buscanocadastro(livro ISBN) {
        if (this.qtd == 0) {
            return -2; // vetor esta vazio
        } else {
            for (int i = 0; i < this.qtd; i++) {
                if (this.livros[i].compareTo(ISBN) == 0) {
                    return i;
                }
            }
            return -1; // indicar que não achou
        }
    }
    
    public void alterarpreço(String ISBN, double p){
        livro prodAux = new livro (ISBN, "", 0, 0);
        int pos = buscasimples (prodAux);
        if (pos == -1 || pos == -2) {
            System.out.println("Produto não cadastrado!");
        }else{
            this.livros[pos].alterarPreço(p);
        }
    }
}


