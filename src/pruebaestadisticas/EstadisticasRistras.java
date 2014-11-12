
package pruebaestadisticas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EstadisticasRistras {
    private final Map<Character, Integer> caracteresDistintos;
    private final Map<String, Integer> palabrasDistintas;

    public EstadisticasRistras() {
        this.caracteresDistintos = new HashMap<>();
        this.palabrasDistintas = new HashMap<>();
    }

    

    public EstadisticasRistras(String ristra) {
        this();
        procesa(ristra);
    }
    
    public void procesa(String ristra){
        for (Character caracter : ristra.toCharArray()) {
            if (!caracter.equals(' ')) {
                caracteresDistintos.put(caracter, getFrequency(caracter, caracteresDistintos)+1);
            }
        }
        
    }
    
    public int númeroPalabras(){
        return palabrasDistintas.size();
    }
    
    public int númeroCaracteres(){
        return caracteresDistintos.size();
    }
    public int frecuenciaPalabra(String palabra){
        return 0;
    }
    
    public List<String> masFrecuentes (int n){
        List<String> listaPalabras = new LinkedList<>();
        return null;
    }

    private Integer getFrequency(Character caracter, Map<Character, Integer> caracteresDistintos) {
        if(caracteresDistintos.containsKey(caracter)){
            return caracteresDistintos.get(caracter);
        }
        
        return 0;
    }
}
