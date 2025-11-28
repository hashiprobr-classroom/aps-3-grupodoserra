package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {
    @Override
    public boolean deuMatch(Usuario u1, Usuario u2) {
        if (!super.deuMatch(u1, u2)) {
            return false;
        }

        for (Musica musicaU1 : u1.getMusicas()) {
            if (u2.jaAdicionou(musicaU1)) {
                return true;
            }
        }

        return false;
    }
}
