package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa {
    private List<Musica> musicas;

    public Usuario(int id, String nome, List<Musica> musicas) {
        super(id, nome);
        this.musicas = musicas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }


    public boolean jaAdicionou(Musica musica) {
        for (Musica m : musicas) {
            boolean mesmoArtista = m.getArtista().getId() == musica.getArtista().getId();
            boolean mesmoTitulo = m.getTitulo().equals(musica.getTitulo());

            if (mesmoArtista && mesmoTitulo) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(Musica musica) {
        if (!jaAdicionou(musica)) {
            musicas.add(musica);
        }
    }
}
