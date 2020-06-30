/*
 * Dada uma lista de objetos do tipo Empregado (com nome, salário), 
 * faça uma função que retorne o total da folha de pagamento da empresa. 
 */
package blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioFixacao2 {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList();
        lista.add(new Empregado("Plops", 1000.50)); 
        lista.add(new Empregado("Xops", 10000.20));
        lista.add(new Empregado("Bob", 100000.10));
//        Double soma = lista.stream().reduce(0.0, (subtotal, emp) -> subtotal + emp.salario, Double::sum);
//        System.out.println("Soma: " + soma);
		
	// solução 2
	Double soma = lista.stream().mapToDouble(emp -> emp.salario)
            .reduce(0.0, (subtotal, x) -> subtotal + x);
		
		
//        System.out.println("Soma: " + somar(0.0, lista));
    }
    
    static Double somar(Double subtotal, List<Empregado> lista){
        if (lista.isEmpty()){
            return subtotal;
        }
        subtotal += lista.get(0).salario;
        lista.remove(0);
        return somar(subtotal, lista);
    }
    
    
    static class Empregado {
        public String nome;
        public Double salario;
        
        Empregado(String nome, Double salario){
            this.nome = nome;
            this.salario = salario;
        }
    }
}
