package coutingsort;

/**
 *
 * @author luyza
 */
public class Count {
    
    public void CouingSort(int []array, int tamanho,int maior){
        
        
        int [] vetor_ordenado = new int[array[0]];
        int [] vetor_auxiliar = new int[maior+1];
        

         
        for(int i = 0; i<maior; i++){
            vetor_auxiliar[i] = 0;
        }
        
        for(int i = 0; i<tamanho; i++){
            vetor_auxiliar[array[i]]++;
        }
        
        for(int i = 1; i<maior; i++){
            vetor_auxiliar[i]+=vetor_auxiliar[i-1];
        }
        
        for(int i = tamanho-1; i>=0; i--){
            vetor_ordenado[vetor_auxiliar[array[i]]-1] = array[i];
            vetor_auxiliar[array[i]]-=1;
        }
        
        for(int i = 0; i<tamanho; i++){
            array[i] = vetor_ordenado[i];
            
            System.out.print(array[i] + " ");
        }
    }



    
}
