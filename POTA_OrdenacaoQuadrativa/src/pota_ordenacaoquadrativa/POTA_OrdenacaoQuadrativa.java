package pota_ordenacaoquadrativa;

/**
 *
 * @author adaltoss
 */
public class POTA_OrdenacaoQuadrativa {
    
    public static final int[]  VETOR = { 12 , 3 , 10 , 15 , 7 , 1 , 28 , 12 , 25 , 35 , 5 };//, 70 , 26 }; 

    public static void main(String[] args) {
        bubbleSort();
        insertionSort();
        selectionSort();
    }
    
    public static void bubbleSort(){
        int[] dados = { 12 , 3 , 10 , 15 , 7 , 1 , 28 , 12 , 25 , 35 , 5 };
        
        System.out.println("Vetor Desordenado...");
        imprimir(dados);
        
        int aux;
        boolean ordenado;
        
        int iteracoes = 0;
        
        for (int i = 0; i < dados.length; i++) {
            
            ordenado = true;
            
            for (int j = 0; j < (dados.length - 1 ); j++) {
                iteracoes++;
                if( dados[j] > dados[j+1] ){
                    aux = dados[j];
                    dados[j] = dados[j+1];
                    dados[j+1] = aux;
                    ordenado = false;
                }
            }
            if( ordenado ){
                break;
            }
        }
        System.out.println("Vetor ordenado por BubbleSort com " + iteracoes + " iterações.");
        imprimir(dados);
    }
    
    
    public static void insertionSort(){
        int[] dados = { 12 , 3 , 10 , 15 , 7 , 1 , 28 , 12 , 25 , 35 , 5 };
        
        System.out.println("Vetor Desordenado...");
        imprimir(dados);
        
        int iteracoes = 0; 
        
        for (int i = 1; i < dados.length ; i++) {
            int key = dados[i];
            int j = i-1;
            while( j >=0 && key < dados[j] ){
                iteracoes++;
                int aux = dados[j];
                dados[j] = dados[j+1];
                dados[j + 1] = aux;
                j--;
            }
            
            
        }
        System.out.println("Vetor ordenado por InsertionSort com " + iteracoes + " iterações.");
        imprimir(dados);
    }
    
    
    public static void selectionSort(){
        int[] dados = { 12 , 3 , 10 , 15 , 7 , 1 , 28 , 12 , 25 , 35 , 5 };
        
        System.out.println("Vetor Desordenado...");
        imprimir(dados);
        
        int iteracoes = 0; 
        int aux;
        
        for (int i = 0; i < dados.length; i++) {
            int menorValor = dados[i];
            int posicaoMenorValor = i;
            
            for (int j = i; j < 10; j++) {
                iteracoes++;
                if( dados[j] < menorValor ){
                    menorValor = dados[j];
                    posicaoMenorValor = j;
                }
            }
            if( menorValor < dados[i] ){
                aux = dados[i];
                dados[i] = dados[posicaoMenorValor];
                dados[posicaoMenorValor] = aux;
            }
        }
        System.out.println("Vetor ordenado por SelectionSort com " + iteracoes + " iterações.");
        imprimir(dados); 
    }
    
    
    public static void imprimir(int[] vetor){
        for (int i : vetor) {
            System.out.print( i + " - ");
        }
        System.out.println("\n --------------------------------");
    }
    
}
