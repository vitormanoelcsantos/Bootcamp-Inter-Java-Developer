package one.innovation.digital.joaopaulo.fatorial.fatorialComMemoization;

import java.util.HashMap;

public class Programa {
    static HashMap<Integer, Integer> mapaFatoraial = new HashMap<>();
    public static void main(String[] args) {
        long i = System.nanoTime();
        System.out.println(fatorialComMemoization(5));
        long f = System.nanoTime();
        System.out.println("Primeiro Fatorial: " +(f-i));

        i = System.nanoTime();
        System.out.println(fatorialComMemoization(5));
        f = System.nanoTime();
        System.out.println("Segundo Fatorial: " +(f-i));
    }
    public static Integer fatorialComMemoization(Integer valor){
        if(valor == 1){
            return valor;
        }else {
            if (mapaFatoraial.containsKey(valor)){
                return mapaFatoraial.get(valor);
            }else {
                Integer resultado = valor * fatorialComMemoization(valor - 1);
                mapaFatoraial.put(valor, resultado);
                return resultado;
            }
        }
    }
}
