package br.edu.insper.desagil.aps3.tindfy;

public class Musica {
    private Artista artista;
    private String titulo;

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Musica(Artista artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }
}
