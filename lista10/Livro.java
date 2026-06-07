public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    public String genero;

    public Livro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public void abrir() {}
    public void fechar() {}
    public void ler() {}
    public void marcarPagina() {}
}

