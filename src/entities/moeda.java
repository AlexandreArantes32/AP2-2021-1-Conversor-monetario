package entities;

public class moeda {
    String nome;
    String pais;
    float valor;

    public float conversao(float valor){
        float quantia;
        quantia = valor*this.valor;
        return quantia;
    }
}
