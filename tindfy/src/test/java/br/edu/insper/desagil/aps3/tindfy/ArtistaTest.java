package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista artista;
    @BeforeEach
    public void setUp(){
        artista=new Artista(1,"omer");
    }
    @Test
    public void constroi(){
        assertEquals(1,artista.getId());
        assertEquals("omer",artista.getNome());
    }
    @Test
    public void mudaNome(){
        artista.setNome("odeya");
        assertEquals("odeya",artista.getNome());
    }

}
