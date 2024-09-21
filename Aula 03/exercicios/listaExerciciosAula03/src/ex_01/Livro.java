package ex_01;

public class Livro {
    public String titulo;
    public String autor;
    public int nrPaginas;

    public Livro(int nrPaginas, String titulo, String autor) {
        this.nrPaginas = nrPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void abrirLivro(String titulo){
        System.out.println("O livro " + titulo + " foi aberto");
    }


    public void ler(int pagina){
        System.out.println("Voce esta na pagina " + pagina);
    }
}
