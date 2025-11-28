package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void daLike(int id1, int id2) {
        likes.putIfAbsent(id1, new ArrayList<>());

        for (int idAnalisado : likes.get(id1)) {
            if (idAnalisado == id2) {
                return;
            }
        }

        likes.get(id1).add(id2);
    }

    public boolean deuMatch(Usuario usuario1, Usuario usuario2) {
        int id1 = usuario1.getId();
        int id2 = usuario2.getId();

        if (!likes.containsKey(id1) || !likes.containsKey(id2)) {
            return false;
        }

        return likes.get(id1).contains(id2)
                && likes.get(id2).contains(id1);
    }
}
