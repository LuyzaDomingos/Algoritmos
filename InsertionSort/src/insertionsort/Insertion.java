
package insertionsort;

/**
 *
 * @author luyza
 */
public class Insertion {
    
    public void insertionsortAlgoritmo(int []vetor, int nelem){
        int j = 0, chave = 0;
        
        /*
            Se o vetor já está ordenado;
        */
        if(nelem<=1){
            for(int i = 0; i<nelem; i++){
                System.out.println(vetor[i]);
            }
        }
        
        /*
            Se o vetor não está ordenado , então é aplicado o algoritmo do InsertionSort
        */
        for(int i = 0; i<nelem; i++){
            chave = vetor[i];
            j = i-1; //#j é o índice dos itens a esquerda a serem comparados
            
            //Enquanto o vetor não estiver no começo ou a chave for menor que os elementos dos itens já comparados
            while(j>=0 && chave<vetor[j]){
                vetor[j+1] = vetor[j]; //desloca o elemento para posição a direita
                j--; //decrementa #j para comparar com o próximo item a esquerda
            }
            vetor[j+1] = chave; // insere a chave no lugar correto do vetor
        }
       
        System.out.println("Vetor está ordenado...");
        
        for(int i = 0; i<nelem; i++){
                System.out.println(vetor[i]);
            }
            
    }
        
}
