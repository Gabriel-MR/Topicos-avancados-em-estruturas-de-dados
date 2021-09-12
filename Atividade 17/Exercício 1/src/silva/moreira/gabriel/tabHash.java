package silva.moreira.gabriel;

class tabHash {
    public static void main(String[] args) {
        tabAluno[] tabAluno = new tabAluno[10];

        tabAluno[0] = new tabAluno(10,"Ana");
        tabAluno[1] = new tabAluno(21,"Silas");
        tabAluno[2] = new tabAluno(22,"Ari");
        tabAluno[3] = new tabAluno(24,"Pedro");
        tabAluno[4] = new tabAluno(35,"Jonas");
        tabAluno[5] = new tabAluno(60,"Saul");
        tabAluno[6] = new tabAluno(44,"Josue");
        tabAluno[7] = new tabAluno(57,"Paulo");
        tabAluno[8] = new tabAluno(80,"Sara");
        tabAluno[9] = new tabAluno(90,"Davi");
        int hashCode, chave;
        silva.moreira.gabriel.tabAluno[] tabHash = new tabAluno[10];
        for (silva.moreira.gabriel.tabAluno aluno : tabAluno) {
            chave = (aluno.getCodAluno());
            hashCode = hash(chave);
            System.out.println("Chave = " + chave +
                    " mapeada para hascode = " + hashCode);
            if (tabHash[hashCode] == null)
                tabHash[hashCode] = aluno;
            else {
                System.out.println("** Colisao no slot da Tabela Hash ** ");
                System.out.println("Chave " + aluno.getCodAluno() +
                        " NAO ARMAZENADA NA TABELA HASH ...\n ");
            }
        }
        System.out.println("\nTabela Aluno: ");
        System.out.println("--------------------------");
        for (int i = 0 ; i < tabAluno.length; i++)
            System.out.print ("Slot " + i + " ---> " + tabAluno[i].getCodAluno()
                    + " " + tabAluno[i].getNome() + '\n') ;
        System.out.println("\nTabela HASH: ");
        System.out.println("--------------------------");
        for (int i = 0 ; i < tabHash.length; i++)
            if (tabHash[i] == null)
                System.out.println("Slot " + i + " ---> Valor nulo");
            else
                System.out.print ("Slot " + i + " ---> " +
                        tabHash[i].getCodAluno() + " " + tabHash[i].getNome() + '\n')
                        ;
    }

    public static Integer hash(Integer key) {
        return key % 10;
    }
}
