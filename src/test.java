import java.util.Random;

public class test {
    public static void main(String[] arg){

        QuickSort quickSort = new QuickSort();
        Random random = new Random();
        int vetor[] = new int[27];
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = 10+ random.nextInt(40);
            System.out.println("numeros fora da ordem:"+ vetor[i]);
        }


        quickSort.organizaNumbers(vetor);
        imprimirNumbers(vetor);
    }
    private static void imprimirNumbers(int[] vetor){
        System.out.println("Numero:\n");
        for (int num : vetor){
            System.out.println("numeros dentro da ordem: " + num);
        }
    }
}
