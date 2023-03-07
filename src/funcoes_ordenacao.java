public class funcoes_ordenacao {
    
    private static void ordenacao_simples(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                }
            }
        }

    }

    private static void ordenacao_melhorada1(int[] vet, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                }
            }
        }

    }
     
    private static void ordenacao_melhorada2(int[] vet, int N) {
        boolean trocou = false;
        int i = 0;
        do{
            trocou = false;
            for (int j = 0; j < (N - 1 - i); j++) {
                if (vet[j] > vet[j + 1]) {
                    troca(vet, j, j + 1);
                    trocou = true;
                }
            }
            i++;
        }while(trocou);

    }

    static void selection(int[] vet, int N) {
        for (int fixo = 0; fixo < (N - 1); fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < N; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
    }

    private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }

}

