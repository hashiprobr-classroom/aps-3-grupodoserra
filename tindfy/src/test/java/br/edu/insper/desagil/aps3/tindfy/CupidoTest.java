package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CupidoTest {

    private Cupido cupido;
    private Usuario usuario1;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        cupido = new Cupido();
        usuario1 = new Usuario(1, "Usuario 1", List.of());
        usuario2 = new Usuario(2, "Usuario 2", List.of());
    }

    @Test
    void ninguemDaLike() {
        assertFalse(cupido.match(usuario1, usuario2));
    }

    @Test
    void primeiroDaLike() {
        cupido.registraLike(usuario1.getId(), usuario2.getId());
        assertFalse(cupido.match(usuario1, usuario2));
    }

    @Test
    void segundoDaLike() {
        cupido.registraLike(usuario2.getId(), usuario1.getId());

        assertFalse(cupido.match(usuario1, usuario2));
    }
}
