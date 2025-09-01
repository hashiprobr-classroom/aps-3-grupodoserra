package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa{
    private List<Musica> musicas;

    public List<Musica> getMusicas() {
        return musicas;
    }

    public Usuario(int id, String nome, List<Musica> musicas) {
        super(id, nome);
        this.musicas = musicas;
    }

    public boolean temMusica(Musica musica){
        for (Musica m: musicas) {
            boolean mesmoArtista = m.getArtista().getId() == musica.getArtista().getId();
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
