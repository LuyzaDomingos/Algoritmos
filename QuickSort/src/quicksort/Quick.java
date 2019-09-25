package quicksort;

/**
 *
 * @author luyza
 */
public class Quick {
    
    
    public void quicksort(int []vetor,int in,int tamanho){
        if(in<tamanho){
            int meio = quick(vetor,in,tamanho);
            quicksort(vetor,in,meio-1);
            quicksort(vetor,meio+1,tamanho);
           
        }
        
    }
    public void printar(int [] vetor, int tamanho){
        
        System.out.println("Vetor ordenado pelo Quick Sort ...");
        for(int i = 0; i<tamanho; i++){
            System.out.println(vetor[i]);
        }
    
    }
    
    public int quick(int [] vetor, int in, int tamanho){
        int pivo = vetor[tamanho];
        int i = in-1;
        
        for(int j = in; j<tamanho; j++){
            if(vetor[j]<pivo){
                i++;
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
        
        int aux = vetor[i+1];
        vetor[i+1] = vetor[tamanho];
        vetor[tamanho] = aux;
        
        return i+1;
    }
        
}
