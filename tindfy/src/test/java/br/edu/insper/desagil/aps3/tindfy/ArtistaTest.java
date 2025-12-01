package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista t;
    @BeforeEach
    public void setUp(){
        t=new Artista(1,"omer");
    }
    @Test
    public void constroi(){
        assertEquals(1,t.getId());
        assertEquals("omer",t.getNome());
    }
    @Test
    public void mudaNome(){
        t.setNome("odeya");
        assertEquals("odeya",t.getNome());

    }
}
