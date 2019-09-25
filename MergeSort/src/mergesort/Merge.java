package mergesort;

/**
 *
 * @author luyza
 */
public class Merge {
    
    public void mergesort(int []vetor,int in,int tamanho){
        if(in<tamanho){
            //int meio = in+(tamanho-in)/2;
            int meio = (tamanho+in)/2;
            mergesort(vetor,in,meio);
            mergesort(vetor,meio+1,tamanho);
            merge(vetor,in,meio,tamanho);
        }
        
    }
    public void printar(int [] vetor, int tamanho){
        
        System.out.println("Vetor ordenado pelo Merge Sort ...");
        for(int i = 0; i<tamanho; i++){
            System.out.println(vetor[i]);
        }
    
    }
    
    public void merge(int [] vetor, int in, int meio, int tamanho){
        
        int i,j; 
        int tam_1 = meio - in+1;
        int tam_2 = tamanho - meio;
        
        int [] esq = new int[tam_1];
        int [] dir = new int[tam_2];
        
        for( i=0; i<tam_1; i++){
            esq[i] = vetor[in+i];
        }
        
        for(j=0; j<tam_2; j++){
            dir[j] = vetor[meio+1+j];
        }
        
        int k = in;
        j=0;
        i=0;
        
        while(i<tam_1 && j<tam_2){
            if(esq[i]<=dir[j]){
                vetor[k] = esq[i];
                i++;
            }
            else{
                vetor[k] = dir[j];
                j++;
            }
            k++;
        }
        
        while(i<tam_1){
            vetor[k] = esq[i];
            i++;
            k++;
        }
        
        while(j<tam_2){
            vetor[k] = dir[j];
            j++;
            k++;
        }
               
    }
}
