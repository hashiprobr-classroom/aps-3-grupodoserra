package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {

    @Override
    public boolean match(Usuario u1, Usuario u2) {
        if (!super.match(u1, u2)) {
            return false;
        }

        for (Musica musicaU1 : u1.getMusicas()) {
            if (u2.temMusica(musicaU1)) {
                return true;
            }
        }

        return false;
    }
}
