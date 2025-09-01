package br.edu.insper.desagil.aps3.tindfy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void registraLike(Integer id1,Integer id2){
        List<Integer> lista = likes.get(id1);
        if(!lista.contains(id2)){
            lista.add(id2);
        }
    }

    public boolean match(Usuario u1, Usuario u2){
        int id1 = u1.getIdentificador();
        int id2 = u2.getIdentificador();

        boolean u1Curtiuu2 = likes.containsKey(id1) && likes.get(id1).contains(id2);
        boolean u2Curtiuu1 = likes.containsKey(id2) && likes.get(id2).contains(id1);

        return u1Curtiuu2 && u2Curtiuu1;
    }
}
