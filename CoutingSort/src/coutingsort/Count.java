package coutingsort;

/**
 *
 * @author luyza
 */
public class Count {
    
    public void coutingSortAlgoritmo(int []array, int tamanho){
        
        int maior = 0, menor = 0;
        
        for(int j = 0; j<tamanho; j++){
            if(array[j]>maior){
                maior = array[j];
            }
            if(array[j]<menor){
                menor = array[j];
            }
        }
        
        int limite = maior-menor+1; // "range" do vetor auxiliar para o vetor de frequências
        int [] vetor_ordenado = new int[tamanho];
        int [] vetor_auxiliar = new int[limite]; 
        

        // preenchendo com zero o vetor auxiliar    
        for(int i = 0; i<limite; i++){
            vetor_auxiliar[i] = 0;
        }
        
        // contar a frequencia para o vetor dos valores
        for(int i = 0; i<tamanho; i++){
            vetor_auxiliar[array[i]-menor]+=1;
        }
        
        // está somando os conteudos do vetor auxiliar
        for(int i = 1; i<limite; i++){
            vetor_auxiliar[i]+=vetor_auxiliar[i-1];
        }
        
        
        // colocando as posições corretas no vetor ordenado
        for(int i = tamanho-1; i>=0; i--){
            vetor_ordenado[vetor_auxiliar[array[i]- menor]-1] = array[i];
            vetor_auxiliar[array[i]-menor]--;
        }
        
        
        // colocando os elementos corretos no vetor original
        for(int i = 0; i<tamanho; i++){
            array[i] = vetor_ordenado[i];
        }
        
        
        System.out.println("Vetor ordenado pelo Couting Sort ...");
        for(int i = 0; i<tamanho; i++){
            
            System.out.println(array[i]);
        }
        
    }



    
}
