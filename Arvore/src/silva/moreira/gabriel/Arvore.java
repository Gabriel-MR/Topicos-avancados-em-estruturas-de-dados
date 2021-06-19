package silva.moreira.gabriel;

public class Arvore {
    No raiz;
    int tamanho;

    public Arvore(){
        this.raiz = null;
        this.tamanho = 0;
    }

    public void inserirRaiz(int valor){
        No no = new No(valor);
        this.raiz = no;
        this.tamanho = 1;
    }

}
