package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista a;
    @BeforeEach
    void setUp() {
        a = new Artista(1, "hashi");
    }

    @Test
    void constroi() {
        assertEquals(1,a.getIdentificador());
        assertEquals("hashi",a.getNome());
    }

    @Test
    void mudaNome() {
        a.setNome("marcelo");
        assertEquals("marcelo",a.getNome());
    }
}
