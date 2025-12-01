package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioTest {
    private Artista artistafalso(int id){
        Artista artista = mock(Artista.class);
        when(artista.getId()).thenReturn(id);
        return artista;
    }
    private Musica musicafalsa(Artista artista,String titulo){
        Musica musica = mock(Musica.class);
        when(musica.getArtista()).thenReturn(artista);
        when(musica.getTitulo()).thenReturn(titulo);
        return musica;
    }
    private Usuario u;
    @BeforeEach
    public void setUp(){
        List<Musica> musicas=new ArrayList<>();
        musicas.add(musicafalsa(artistafalso(1),"horef"));
        musicas.add(musicafalsa(artistafalso(2),"im eshkachech"));
        musicas.add(musicafalsa(artistafalso(3),"ben hashvilim"));
        u=new Usuario(10,"jo",musicas);
    }
    @Test
    public void naoAdiciona(){
        u.adiciona(musicafalsa(artistafalso(1),"horef"));
        assertEquals(3,u.getMusicas().size());
    }
    @Test
    public void adiciona(){
        u.adiciona(musicafalsa(artistafalso(10),"s"));
        assertEquals(4,u.getMusicas().size());
    }



}
