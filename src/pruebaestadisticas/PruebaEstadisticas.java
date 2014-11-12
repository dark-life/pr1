
package pruebaestadisticas;

public class PruebaEstadisticas {

    public static void main(String[] args) {
        String palabra = " abcdabcd ";
        EstadisticasRistras e1 = new EstadisticasRistras();
        /**
         * es.procesa("hola ola.");
 es.procesa("hola mundo.");
 System.out.println("Número de caracteres "+es.númeroCaracteres());
 System.out.println("Número de palabras "+es.númeroPalabras());
 System.out.println("Más frecuentes "+es.másFrecuentes(10));
         */
        e1.procesa(palabra);
        e1.procesa("Hola");
        System.out.println(e1.númeroCaracteres());
        
    }
    
}
