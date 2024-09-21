package ex_01;

public class Livro {
    private String titulo;
    private String autor;
    private int nrPaginas;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
       if(titulo != null && !titulo.isEmpty()){
           this.titulo = titulo;
       } else {
           System.out.println("Titulo invalido");
       }

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrPaginas() {
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas) {
        this.nrPaginas = nrPaginas;
    }
}
