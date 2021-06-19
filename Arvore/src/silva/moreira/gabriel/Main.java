package silva.moreira.gabriel;

public class Main {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserirRaiz(5);

        No no4 = new No(4);
        No no3 = new No(3);
        No no7 = new No(7);
        No no1 = new No(1);
        No no2 = new No(2);
        No no8 = new No(8);
        No no0 = new No(0);
        No no6 = new No(6);
        No no21 = new No(21);
        No no12 = new No(12);

        arvore.raiz.primeiroFilho = no4;

        no4.pai = arvore.raiz;
        no4.proximo = no3;
        no4.primeiroFilho = no1;

        no1.pai = no4;
        no1.proximo = no2;

        no2.pai = no4;

        no3.pai = arvore.raiz;
        no3.proximo = no7;
        no3.primeiroFilho = no8;

        no8.pai = no3;
        no8.primeiroFilho = no21;

        no21.pai = no8;
        no21.proximo = no12;

        no12.pai = no8;

        no7.pai = arvore.raiz;
        no7.primeiroFilho = no0;

        no0.pai = no7;
        no0.proximo = no6;

        no6.pai = no7;

        arvore.raiz.imprimeFilhos();
        no8.imprimePai();
        no8.dobraFilhos();
        no2.dobraPai();
    }
}
