
package livraria;


public class livro implements Comparable <livro> {
    
    private String ISBN;
    private String titulo;
    private double preço;
    private int qntestoque;
    
    
    public livro(String c, String t, double p, int q){ //CONSTRUTOR
        this.ISBN = c;
        this.titulo = t;
        this.preço = p;
        this.qntestoque = q;     
    }

    
    public String getISBN() {
        return ISBN;
    }

    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public double getPreço() {
        return preço;
    }

    
    public void setPreço(double preço) {
        this.preço = preço;
    }

    
    public int getQntestoque() {
        return qntestoque;
    }

    
    public void setQntestoque(int qntestoque) {
        this.qntestoque = qntestoque;
    }

    @Override
    public int compareTo(livro c) {
        return this.ISBN.compareTo(c.ISBN);
    }
    
    public String toString () {
        return this.ISBN + " " + this.titulo + " " + this.preço + " " + this.qntestoque;
    }
    
    public void alterarPreço(double p){
        double preçoatual = this.getPreço();
        double novoPreço = p;
        this.setPreço(novoPreço);
        System.out.println("preço alterado !!");
    }
    
    
    
    
}
