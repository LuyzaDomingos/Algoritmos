package coutingsort;

/**
 *
 * @author luyza
 */
public class CoutingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    int vetor [] = {56,12,1002,302,2303,3203,1,9,7,4,3,6,5,0,9,83,61,152,56488,3897,2746,6,3687,726,4988,2942};
    int tamanho = 0; 
    tamanho =  vetor.length;
    int maior = 0;
    
    for(int i =0; i<tamanho; i++){
        if(vetor[i]>maior){
            maior = vetor[i];
        }
    }
    
    Count coutingsort = new Count();
    coutingsort.CouingSort(vetor,tamanho,maior);
    
             	
       
    }
    
    
}
