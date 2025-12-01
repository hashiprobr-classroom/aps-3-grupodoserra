package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CupidoTest {
    private Usuario usuariofalso(int id){
        Usuario usuario= mock(Usuario.class);
        when(usuario.getId()).thenReturn(id);
        return usuario;
    }
    private Cupido c;
    private Usuario u1;
    private Usuario u2;
    @BeforeEach
    public void setUp(){
        u1= usuariofalso(1);
        u2= usuariofalso(2);
        c= new Cupido();
    }
    @Test
    public void ninguemDaLike(){
        assertFalse(c.deuMatch(u1,u2));
    }
    @Test
    public void primeiroDaLike(){
        c.daLike(1,2);
        assertFalse(c.deuMatch(u1,u2));
    }
    @Test
    public void segundoDaLike(){
        c.daLike(2,1);
        assertFalse(c.deuMatch(u1,u2));
    }
    
}
