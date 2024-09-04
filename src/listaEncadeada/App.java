package listaEncadeada;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.generateList(10);
        //lista.showList();
        Bloco bloconovo = new Bloco(12);

        System.out.println("                              ");
        lista.addBloco(bloconovo);
        //lista.showList();

        System.out.println("                             ");
        //lista.searchBlocoByPosition(6);

        System.out.println("                             ");
        Bloco bloconovo2 = new Bloco(40);
        lista.addBlocoBeforePosition(bloconovo2, 6);
        //lista.showList();

        System.out.println("                             ");
        Bloco bloconovo3 = new Bloco(50);
        lista.addBlocoInPosition(bloconovo3, 2);
        //lista.showList();

        System.out.println("                             ");
        lista.removeBloco(0);
        lista.showList();
    }
}
