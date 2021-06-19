package silva.moreira.gabriel;

public class No {
    int item;
    No pai;
    No primeiroFilho;
    No proximo;


    public No(int item){
        this.item = item;
        this.pai = null;
        this.primeiroFilho = null;
        this.proximo = null;
    }

    public No pai(){
        if(this.pai == null){
            return null;
        } else {
            return (this.pai);
        }
    }

    public void imprimePai(){
        if(this.pai != null){
            System.out.println("Pai: " + this.pai.item);
        } else {
            System.out.println("Esse nó é raiz, não tem pai...");
        }
    }

    public void imprimeFilhos(){
        if(this.primeiroFilho == null){
            System.out.println("No nao tem filhos...");
        } else {
            No trab = this.primeiroFilho;
            while(trab!= null){
                System.out.println(trab.item);
                trab = trab.proximo;
            }
        }
    }

    public boolean EhInterno(){
        if(this.primeiroFilho != null){
            return true;
        } else{
            return false;
        }
    }

    public void preorder(){
        System.out.println(this.item);
        No trab = this.primeiroFilho;
        while(trab!= null){
            trab.preorder();
            trab = trab.proximo;
        }

    }

    public void posorder(){
        No trab = this.primeiroFilho;
        while(trab!=null){
            trab.posorder();
            trab = trab.proximo;
        }
        System.out.println(this.item);
    }

    public void imprimeFilhosFolhas(){
        if(this.primeiroFilho == null){
            No trab = this.primeiroFilho;
            while(trab!= null){
                System.out.println(trab.item);
                trab = trab.proximo;
            }
        } else {
            System.out.println("No nao tem filhos...");
        }
    }

    public void dobraFilhos(){
        if(this.primeiroFilho == null){
            System.out.println("No nao tem filhos...");
        } else {
            No trab = this.primeiroFilho;
            while(trab!=null){
                trab.item = trab.item * 2;
                trab = trab.proximo;
            }
        }
    }

    public void dobraPai(){
        this.pai.item = this.pai.item * 2;
    }
}
