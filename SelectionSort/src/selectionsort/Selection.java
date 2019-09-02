package selectionsort;

/**
 *
 * @author luyza
 */
public class Selection {
    
    public void selectionSortAlgortimo(int [] vetor, int tamanho){
        int minimo = 0, aux = 0;
        
        /*
            Percorrendo o vetor elemento por elemento
        */
        for(int i = 0; i<tamanho-1; i++){
            
            /*
                Econtrando o menor elemento no vetor desordenado
            */
            minimo = i;
            for(int j = i+1; j<tamanho; j++){
                if(vetor[j]<vetor[minimo]){
                    minimo = j;
                }
                
                /*
                    Troca o mínimo elemento com o primmeiro elemento
                */
                if(minimo!=i){
                    aux = vetor[i];
                    vetor[i] = vetor[minimo];
                    vetor[minimo] = aux;
                }             
            }
        }
        
        System.out.println("Vetor ordenado pelo Selection Sort ...");
        for(int i = 0; i<tamanho; i++){
            System.out.println(vetor[i]);
        }
    }
        
}
