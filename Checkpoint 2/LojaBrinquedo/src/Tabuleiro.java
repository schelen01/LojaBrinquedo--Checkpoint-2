package lojabrinquedo;

public class Tabuleiro extends Brinquedo {

    private Brinquedo brinquedo;
    //Herda tudo, menos o construtor do tabuleiro

    public Tabuleiro(String nome, String idBrinquedo, String marca, String classificacaoIndicativa) {
        super(nome, idBrinquedo,  marca, classificacaoIndicativa);

    }

}

