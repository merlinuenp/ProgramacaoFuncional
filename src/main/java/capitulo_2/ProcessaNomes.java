package capitulo_2;

import java.util.List;
import java.util.stream.Collectors;


// Este código foi adaptado de 
// FORD, N. Functional Thinking. Sebastopol: O'Reilly Media, 2014.

public class ProcessaNomes {

    // Versão imperativa. 
    public String processarNomes(List<String> listaDeNomes) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listaDeNomes.size(); i++) {
            if (listaDeNomes.get(i).length() > 1) {
                result.append(capitalizarNome(listaDeNomes.get(i))).append(",");
            }
        }
        return result.substring(0, result.length() - 1);
    }

    // Este método converte a primeira letra da string para maiúscula
    public String capitalizarNome(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
    }
    
    
    // Versão funcional 
    public String processarNomesFuncional(List<String> listaDeNomes){
        if (listaDeNomes == null) return "";
        return listaDeNomes
                .stream()
                .filter(nome -> nome.length() > 1)
                .map(nome -> capitalizarNome(nome))
                .collect(Collectors.joining(","));      // opção para reduce 
    }
    
    
}
