package listaEncadeada;

public class Lista {
    private Bloco inicio;

    public Bloco addBloco(int value) {
        Bloco newBloco = new Bloco(value);
        newBloco.setProx(this.inicio);
        this.inicio = newBloco;
        return newBloco;
    }
    public Bloco addBloco(int value, int position){
        Bloco newBloco = new Bloco(value);
        Bloco aux = searchBloco(position - 1);
        if (aux == this.inicio){
            addBloco(value);
        } else {
            newBloco.setProx(aux.getProx());
            aux.setProx(newBloco);

        }
        return newBloco;
    }

    public void removeBloco(int position){
        if (position != 1){
            Bloco aux = searchBloco(position - 1);
            if (aux != null){
                aux.setProx(aux.getProx().getProx());
            }
        } else {
            this.inicio = this.inicio.getProx();
        }

    }

    public Bloco searchBloco(int position){
        Bloco aux = this.inicio;
        if (aux != null) {
            for (int i = 1; i < position; i++) {
                aux = aux.getProx();
            }
        }
        return aux;
    }

    public void generateList(int listlength){
        for(int i=0; i < listlength; i++){
            Bloco novo = new Bloco(i);
            novo.setProx(this.inicio);
            this.inicio = novo;
        }
    }

    public void printList(){
        Bloco aux = inicio;
        while (aux!=null){
            System.out.println(aux.getValue());
            aux = aux.getProx();
        }
    }

}
