package capitulo_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda {

    public static void main(String[] args) {
        Integer a[] = new Integer[]{10, 20, 30, 40};
        List<Integer> lista = Arrays.asList(a);
        lista.forEach(i -> System.out.println(i));
    }

    public static IntStream transformar(List<Double> orig) {
        return orig.stream().mapToInt(i -> i.intValue());
    }

    public static Integer reduzir(List<Integer> lista) {
        return lista
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
    }

    public static Integer reduzir2(List<Integer> lista){
        return lista.stream().reduce(0, Integer::sum);
    }
    
    
}
