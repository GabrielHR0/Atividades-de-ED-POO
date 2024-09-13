package listaEncadeada;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.generateList(10);

        lista.addBloco(25, 5);
        //lista.removeBloco(1);
        lista.addBlocoRecursive(999, 15);
        lista.printList();

        //System.out.println(lista.searchBloco(1).getValue());


    }
}
