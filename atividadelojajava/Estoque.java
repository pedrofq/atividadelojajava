package atividadelojajava;

import atividadelojajava.Mercadoria;
import java.util.ArrayList;

public class Estoque {
    
    ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();

    public Estoque() {
    }
    
    public void adicionarMercadoriaEstoque(Mercadoria mercadoria)
    {
        this.mercadorias.add(mercadoria);
    }

    public ArrayList<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
}
