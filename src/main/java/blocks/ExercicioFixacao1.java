/*
 * Faça um programa em que seja dada uma lista de números. 
 * Combine as operações de filter e reduce para que sejam 
 * somados todos os números pares. 
 */
package blocks;

import java.util.Arrays;
import java.util.List;

public class ExercicioFixacao1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        Integer soma = lista.stream().filter(x -> x % 2==0).reduce(0, Integer::sum);
        Integer soma = lista.stream().filter(x -> x % 2==0).
                reduce(0, (a,b) -> a+b);
        
        System.out.println("Soma: " + soma);
    }
}
