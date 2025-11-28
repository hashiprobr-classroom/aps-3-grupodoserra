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
    public void setUp(){
        usuario1= new Usuario(1,"joe", List.of());
        usuario2 = new Usuario(2,"goi",List.of());
        cupido= new Cupido();
    }
    @Test
    public void ninguemDaLike(){
        assertFalse(cupido.deuMatch(usuario1,usuario2));
    }
    @Test
    public void primeiroDalike(){
        cupido.daLike(usuario1.getId(),usuario2.getId());
        assertFalse(cupido.deuMatch(usuario1,usuario2));

    }
    @Test
    public void segundoDaLike(){
        cupido.daLike(usuario2.getId(),usuario1.getId());
        assertFalse(cupido.deuMatch(usuario1,usuario2));

    }

}
