package listaEncadeada;

public class Lista {
    private Bloco inicio;

    public void addBloco(Bloco novo) {
        novo.setProx(this.inicio);
        this.inicio = novo;
    }

    public void addBlocoBeforePosition(Bloco newBloco, int position){
        Bloco aux = this.inicio;
        for(int i=0; i < position; i++){
            aux = aux.getProx();
        }
        newBloco.setProx(aux.getProx());
        aux.setProx(newBloco);
    }

    public void addBlocoInPosition(Bloco newBloco, int position){
        Bloco aux = this.inicio;
        for(int i=0; i < position-1; i++){
            aux = aux.getProx();
        }
        newBloco.setProx(aux.getProx());
        aux.setProx(newBloco);
        
    }

    public void removeBloco(int position){
        Bloco aux = this.inicio;
        if (position != 0){
            for(int i=0; i < position-1; i++){
                aux = aux.getProx();
            }
            aux.setProx(aux.getProx().getProx());
        } else {
            this.inicio = this.inicio.getProx();
        }
        
    }

    public void searchBlocoByPosition(int position){
        Bloco aux = this.inicio;
        for (int i=0; i<position; i++){
            aux = aux.getProx();
        }
        System.out.println(aux.getValue());
    }

    public void generateList(int listlength){
        for(int i=0; i < listlength; i++){
            Bloco novo = new Bloco(i);
            novo.setProx(this.inicio);
            this.inicio = novo;
        }
    }

    public void showList(){
        Bloco aux = inicio;
        while (aux!=null){
            System.out.println(aux.getValue());
            aux = aux.getProx();
        }
    }

}
