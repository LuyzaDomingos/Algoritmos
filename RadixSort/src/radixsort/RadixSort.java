package radixsort;

/**
 *
 * @author luyza
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int vetor [] = {402,401,1002,302,2303,3203,0003,007,7,14,3,6,5,0,9,83};
    int tamanho = 0; 
    tamanho =  vetor.length;
    int maior = 0;
    
    for(int i =0; i<tamanho; i++){
        if(vetor[i]>maior){
            maior = vetor[i];
        }
    }
    
    Radix radixsort = new Radix();
    radixsort.Radix(vetor, tamanho);
    radixsort.printar(vetor,tamanho);
    
    }
    
}
