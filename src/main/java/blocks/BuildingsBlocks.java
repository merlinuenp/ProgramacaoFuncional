package blocks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingsBlocks {
    public static void main(String[] args) {
        //// map
//        List<Integer> lista = Arrays.asList(1, 2, 4);
//        IntStream novaLista = lista.stream().mapToInt(i -> 28 / i); 
//        novaLista.forEach( i ->  System.out.print(i + ",")); 
        
        //// filter
//        List<Integer> idades = Arrays.asList(15, 16, 16, 17, 18, 18, 21, 22, 45);
//        List maiores = idades.stream().filter(i -> i >= 18).collect(Collectors.toList());
//        //List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//        maiores.forEach( i ->  System.out.print(i + ",")); 
//        
        
        //// reduce
        List<Integer> lista = Arrays.asList(3, 5, 7, 3, 1);
//        Integer soma = lista.stream().reduce(0, (subtotal, element) -> subtotal + element);
        Integer soma = lista.stream().reduce(0, Integer::sum);

        System.out.println("Soma: " + soma);
        
        List<Integer> lista2 = lista.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        lista2.forEach( i ->  System.out.print(i + ",")); 
  
    }
}
