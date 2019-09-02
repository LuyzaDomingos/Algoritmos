package radixsort;

/**
 *
 * @author luyza
 */
public class Radix {
    
    public void contar (int [] vetor, int n, int exp){
        
    int [] vetor_saida = new int[n];
    int [] cont = new int[10];
    
    for(int i = 0; i<10; i++){
        cont[i] = 0;
    }

    //frequencias
    for(int i = 0; i<n; i++){//
        cont[(vetor[i]/exp)%10]++;
    }

    for(int i = 1; i<10; i++){
        cont[i]+=cont[i-1];
    }


    for(int i = n-1; i>=0; i--){
        vetor_saida[cont[(vetor[i]/exp)%10]-1] = vetor[i];
        cont[(vetor[i]/exp)%10]--;
    }

    for(int i = 0; i<n; i++){
        vetor[i]=vetor_saida[i];
    } 
    
 }
    
    public void Radix(int [] vetor, int n){
        
        int maior = 0;
        
        for(int i =0; i<n; i++){
        if(vetor[i]>maior){
            maior = vetor[i];
        }
        
        for(int exp = 1; (maior/exp) > 0; exp*=10){
            contar(vetor,n,exp);
        }   
    }   
}
    
    public void printar(int vetor[], int tamanho){
        for(int j = 0; j<tamanho; j++){
            System.out.print(vetor[j] + " ");
        }
    }
    
    
    
    
}
