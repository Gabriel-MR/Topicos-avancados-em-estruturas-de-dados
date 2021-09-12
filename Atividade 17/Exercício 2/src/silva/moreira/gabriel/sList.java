package silva.moreira.gabriel;

class sList {
    private static class No{
        Integer conteudo;
        No proximo;

        public No(Integer conteudo){
            this.conteudo = conteudo;
            this.proximo = null;
        }

        public Integer getConteudo(){
            return this.conteudo;
        }
    }

    private Integer tamanho = 0;
    private No head = null;

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void InsereInicio(Integer key){
        No novoNo = new No(key);
        if(this.tamanho == 0){
            this.tamanho++;
            this.head = novoNo;
        }
        else{
            novoNo.proximo = this.head;
            this.head = novoNo;
            this.tamanho++;
        }
    }

    public String printLista(){
        StringBuilder texto = new StringBuilder();
        if(!this.isEmpty()){
            No atual = this.head;
            texto.append(atual.getConteudo().toString());
            while(atual.proximo != null){
                atual = atual.proximo;
                texto.append(", ").append(atual.getConteudo().toString());
            }
        }
        return texto.toString();
    }
}
