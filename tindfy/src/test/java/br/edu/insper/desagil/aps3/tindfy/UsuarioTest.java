package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario usuario;
    private Musica musica3;
    private Musica musica4;

    @BeforeEach
    void setUp() {
        Artista artista = new Artista(1, "Artista X");

        List<Musica> musicas = new ArrayList<>();

        Musica musica1 = new Musica(artista, "Musica 1");
        Musica musica2 = new Musica(artista, "Musica 2");

        musica3 = new Musica(artista, "Musica 3");
        musica4 = new Musica(artista, "Musica 4");

        musicas.add(musica1);
        musicas.add(musica3);
        musicas.add(musica2);

        usuario = new Usuario(1, "Usuario 1", musicas);

    }

    @Test
    void naoAdiciona() {
        usuario.adicionaMusica(musica3);
        assertEquals(3, usuario.getMusicas().size());
    }

    @Test
    void adiciona() {
        usuario.adicionaMusica(musica4);
        assertEquals(4, usuario.getMusicas().size());
    }
}
