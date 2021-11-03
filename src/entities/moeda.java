package entities;

public class moeda {
    String nome;
    String pais;
    float valor;

    public void setMoeda(String nome, String pais, float valor) {
        this.nome = nome;
        this.pais = pais;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public String getPais() {
        return pais;
    }

}
