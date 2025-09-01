package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CupidoMusicalTest {

    private CupidoMusical cupidoMusical;
    private Usuario u1;
    private Usuario u2;
    private Musica musicaComum;
    private Musica musicaU1;
    private Musica musicaU2;

    @BeforeEach
    void setUp() {
        cupidoMusical = new CupidoMusical();

        musicaComum = new Musica(new Artista(1, "Artista 1"), "Música Comum");
        musicaU1 = new Musica(new Artista(1, "Artista 1"), "Música U1");
        musicaU2 = new Musica(new Artista(2, "Artista 2"), "Música U2");

        u1 = new Usuario(1, "Usuario 1", List.of(musicaComum, musicaU1));
        u2 = new Usuario(2, "Usuario 2", List.of(musicaComum, musicaU2));
    }

    @Test
    void semLikesComMusicas() {
        assertFalse(cupidoMusical.match(u1, u2));
    }

    @Test
    void comLikesSemMusicas() {
        cupidoMusical.registraLike(u1.getIdentificador(), u2.getIdentificador());
        cupidoMusical.registraLike(u2.getIdentificador(), u1.getIdentificador());

        assertFalse(cupidoMusical.match(u1, u2));
    }

    @Test
    void comLikesComMusicas() {
        cupidoMusical.registraLike(u1.getIdentificador(), u2.getIdentificador());
        cupidoMusical.registraLike(u2.getIdentificador(), u1.getIdentificador());

        assertTrue(cupidoMusical.match(u1, u2));
    }
}
