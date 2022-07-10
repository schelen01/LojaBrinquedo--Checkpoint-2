package lojabrinquedo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int quantidade;
    private double precoCompra;
    private List<Brinquedo> listaBrinquedo = new ArrayList<Brinquedo>();



    public void addBrinquedo(Brinquedo brinquedo){
        this.listaBrinquedo.add(brinquedo);
    }
    public void mostrarLista(){
        for(Brinquedo brinquedo : listaBrinquedo){
            System.out.println(brinquedo);
        }
    }

    public List<Brinquedo> getListaBrinquedo() {
        return listaBrinquedo;
    }

    public void setListaBrinquedo(List<Brinquedo> listaBrinquedo) {
        this.listaBrinquedo = listaBrinquedo;
    }


}
