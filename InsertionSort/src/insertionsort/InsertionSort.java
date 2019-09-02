
package insertionsort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author luyza
 */
public class InsertionSort {

    public static void main(String[] args) {
        
        
        try{
            FileReader arquivo = new FileReader("C:\\Users\\luyza\\Desktop\\Algoritmos\\InsertionSort\\src\\instancias-num\\num.100000.1.txt");
            BufferedReader le_arquivo = new BufferedReader(arquivo); 
            
            
            int tamanho = 0; 
            tamanho = Integer.parseInt(le_arquivo.readLine());
            String linha;
            int [] vetor = new int[tamanho];
            int i = 0;
            
            while((linha = le_arquivo.readLine())!=null){
                
                vetor[i] = Integer.parseInt(linha);
                i++;
            }
            
            le_arquivo.close();
            
            Insertion insertionsort = new Insertion() ;
            insertionsort.insertionSortAlgoritmo(vetor, tamanho);
                        
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
