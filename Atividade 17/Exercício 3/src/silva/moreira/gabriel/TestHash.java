package silva.moreira.gabriel;

public class TestHash {
    public static void main(String[] args) {
        Integer[] codigoEmpregado = new Integer[]{23, 45, 77, 11, 33, 49, 10, 4, 89, 14};
        Integer[] tabhash = new Integer[10];

        for (Integer codigo : codigoEmpregado) {
            Integer indiceHash = hash(codigo);
            if (tabhash[indiceHash] != null){
                Integer novo_indice = rehashing(tabhash, indiceHash);
                tabhash[novo_indice] = codigo;
            }
            tabhash[indiceHash] = codigo;
        }

        System.out.println("\nTabela HASH:");
        System.out.println("--------------------------");
        for(int i=0; i<tabhash.length; i++){
            if (tabhash[i] == null)
                System.out.println("Slot " + i + " ---> Valor nulo");
            else
                System.out.println("Slot" + i + " ---> " + tabhash[i]);
        }
    }

    public static Integer hash(Integer key) {
        return (key % 10);
    }

    public static Integer rehashing(Integer[] tabhash, Integer indice) {
        for (Integer i = indice + 1 ; i < tabhash.length ; i ++) {
            if (tabhash[i] == null )
                return i;
        }
        for (Integer i = 0 ; i < indice ; i++ ) {
            if (tabhash[i] == null )
                return i;
        }
        return null;
    }
}

