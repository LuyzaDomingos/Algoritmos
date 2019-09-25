package quicksort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author luyza
 */
public class QuickSort {

    
    public static void main(String[] args) {
        
        try{
            FileReader arquivo = new FileReader("C:\\Users\\luyza\\Desktop\\Algoritmos\\SelectionSort\\test\\num.10000.2.txt");
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
            //System.out.println("tamanho do vetor = "+tamanho);
            
            Quick quicksort = new Quick();
            quicksort.quicksort(vetor, 0, tamanho-1);
            quicksort.printar(vetor,tamanho);
            
                        
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
