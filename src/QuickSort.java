public class QuickSort {
    private void inverter(int[] vetor,int i , int j){
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    private int particao(int[] vetor, int inicio, int fim){
        int i, j, k = fim;
        j = inicio+1;
        i = vetor[inicio];

        while (j <= k){
            while (j<= k && vetor[j] <= i){
                j++;
            }
            while (k >= j && vetor[k] > i){
                k--;
            }
            if (j < k){
                inverter(vetor,k,j);
            }
        }
        inverter(vetor,inicio, k);
        return k;
    }

    private void quickSort(int[] vetor, int inicio, int fim){
        if(fim > inicio){
            int qsIndex = particao(vetor,inicio, fim);
            quickSort(vetor,inicio,qsIndex-1);
            quickSort(vetor, qsIndex + 1, fim);
        }
    }

    public void organizaNumbers(int[] vetor){
        quickSort(vetor, 0 ,vetor.length -1);
    }



}
