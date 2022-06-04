import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().teste();
    }

    public void teste() {
        /*
        KKK, sem o senhor passando as palavras, este seria um cenário possivel kkkkkk
        String[] vetor = {"a","a","a","a","a","a","a","a","a","a"};
        String chave = "a";
         */
        String[] vetor = {"Vitor","Maria","Jose","Unibrasil","Hainosz","Abimael","Pedro","Portas","Henrique","Coringa"};
        String chave = "Coringa";
        stringOrdenacao(vetor);
        System.out.println(binarySearch(vetor, "Coringa") != -1 ? "Encontrado" : "Nao encontrado");
        System.out.println(binarySearch(vetor, "a") != -1 ? "Encontrado" : "Nao encontrado");
    }

    public void stringOrdenacao(String[] vetor) {
        System.out.println("Vetor nao ordenado: " + Arrays.toString(vetor));
        for(int posDoVetor = 0; posDoVetor < vetor.length; posDoVetor++) {
            String elementoPosX = vetor[posDoVetor];
            while (posDoVetor > 0 && elementoPosX.compareTo(vetor[posDoVetor-1]) < 0) {
                vetor[posDoVetor] = vetor[posDoVetor-1];
                posDoVetor--;
            }
            vetor[posDoVetor] = elementoPosX;
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }

    public int binarySearch(String[] vetor, String itemProcurado) {
        int primeiro = 0;
        int numItens = vetor.length;
        int ultimo = numItens - 1;

        System.out.println("Procurando o item: " + itemProcurado);

        int meio;
        while (primeiro <= ultimo) {
            meio = (primeiro + ultimo) / 2;
            if (itemProcurado.equals(vetor[meio])) {
                return meio;
            } else {
                if (itemProcurado.compareTo(vetor[meio]) < 0) {
                    ultimo = meio - 1;
                } else {
                    primeiro = meio + 1;
                }
            }
        }
        return -1;
    }

}
