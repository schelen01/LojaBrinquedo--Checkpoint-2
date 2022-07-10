package lojabrinquedo;

public abstract class Brinquedo {

    private String nome;
    private String marca;
    private String classificacaoIndicativa;
    private String idBrinquedo;
    private double precoVenda;


    public Brinquedo(String nome, String idBrinquedo, String marca, String classificacaoIndicativa) {
        this.nome = nome;
        this.idBrinquedo = idBrinquedo;
        this.marca = marca;
        this.classificacaoIndicativa = classificacaoIndicativa;

    }

    public Brinquedo (String nome, String idBrinquedo, String marca) {
        if (nome == null && idBrinquedo == null && marca == null ){
            throw new NullPointerException("Os Campos não podem ser nulos");
        }
        this.nome = nome;
        this.idBrinquedo = idBrinquedo;
        this.marca = marca;
        System.out.println("Os Campos não podem ser nulos");
    }

    @Override
    public String toString() {
        return this.nome + " "
                + this.idBrinquedo + " "
                + this.marca + " "
                + this.classificacaoIndicativa;
    }

}



