package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa{
    private List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario(int identificador, String nome, List<Musica> musicas) {
        super(identificador, nome);
        this.musicas = musicas;
    }

    public boolean temMusica(Musica musica){
        for (Musica m: musicas) {
            boolean mesmoArtista = m.getArtista().getIdentificador() == musica.getArtista().getIdentificador();
            boolean mesmoTitulo = m.getTitulo().equals(musica.getTitulo());

            if (mesmoArtista && mesmoTitulo){
                return true;
            }
        }
        return false;
    }
    public void adicionaMusica(Musica musica) {
        if (!temMusica(musica)) {
            musicas.add(musica);
        }
    }
}
