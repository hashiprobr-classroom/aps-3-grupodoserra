package br.edu.insper.desagil.aps3.tindfy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>>likes;
    public Cupido(){
        this.likes= new HashMap<>();
    }
    public void daLike(int id1,int id2){}
    public boolean deuMatch(Usuario usuario1, Usuario usuario2){return false;}

}
