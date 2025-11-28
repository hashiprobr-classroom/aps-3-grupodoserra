package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupdioMusicalTest {
    private CupidoMusical a;
    private Usuario usuario1;
    private Usuario usuario2;
    @BeforeEach
    public void setUp(){
        List<Musica>musicau1=new ArrayList<>();
        List<Musica>musicau2=new ArrayList<>();
        usuario1= new Usuario(1,"joe",musicau1);
        usuario2 = new Usuario(2,"goi",musicau2);
        a= new CupidoMusical();
    }
    @Test
    public void semLikesComMusicas(){
        Artista omer= new Artista(1,"omer");
        Musica musica1=new Musica(omer,"horef baoto");
        usuario1.adiciona(musica1);
        usuario2.adiciona(musica1);
        assertFalse(a.deuMatch(usuario1,usuario2));

    }
    @Test
    public void comLikesSemMusicas(){
        a.daLike(usuario1.getId(),usuario2.getId());
        a.daLike(usuario2.getId(),usuario1.getId());
        assertFalse(a.deuMatch(usuario1,usuario2));
    }
    @Test
    public void ComLikesComMusicas(){
        Artista omer= new Artista(1,"omer");
        Musica musica1=new Musica(omer,"horef baoto");
        usuario1.adiciona(musica1);
        usuario2.adiciona(musica1);
        a.daLike(usuario1.getId(),usuario2.getId());
        a.daLike(usuario2.getId(),usuario1.getId());
        assertTrue(a.deuMatch(usuario1,usuario2));



    }

}
