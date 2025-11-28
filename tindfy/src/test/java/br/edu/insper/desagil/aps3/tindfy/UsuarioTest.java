package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    private Usuario usuario;
    private Musica musica1;
    private  Artista omer;
    @BeforeEach
    public void setUp(){
        List<Musica>musicas=new ArrayList<>();
        omer = new Artista(1,"omer");
        musica1 = new Musica(omer,"58");
        Musica musica2 = new Musica(omer,"sof");
        Musica musica3 = new Musica(omer,"tzamud");
        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);
        usuario=new Usuario(2,"joseph",musicas);
    }
    @Test
    public void naoAdiciona(){
      usuario.adiciona(musica1);
      assertEquals(3,usuario.getMusicas().size());
    }
    @Test
    public void adiciona(){
        Musica musica4 = new Musica(omer,"hoze");
        usuario.adiciona(musica4);
        assertEquals(4,usuario.getMusicas().size());

    }
}
