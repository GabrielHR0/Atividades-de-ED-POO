package listaEncadeada;

public class Bloco {
    private int value;
    private Bloco prox;

    public Bloco(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Bloco getProx() {
        return prox;
    }

    public void setProx(Bloco prox) {
        this.prox = prox;
    }
}
