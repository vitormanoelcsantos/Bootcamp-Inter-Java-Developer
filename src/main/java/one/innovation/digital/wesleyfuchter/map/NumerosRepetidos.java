package one.innovation.digital.wesleyfuchter.map;

import java.util.HashMap;
import java.util.Map;

public class NumerosRepetidos {
    public static void main(String[] args) {
        HashMap<Integer, Integer> arrayRepetidos = new HashMap<>();

        Integer[] meuArray = {0, 0, 1, 2, 3, 3, 3, 4, 2, 5, 5};

        for (int i = 0; i < meuArray.length; i++) {
            Integer item = meuArray[i];

            if (arrayRepetidos.containsKey(item)) {
                arrayRepetidos.put(item, arrayRepetidos.get(item) + 1);
            } else
                arrayRepetidos.put(item, 1);
        }

        System.out.println("---> " + arrayRepetidos);

        StringBuilder sb = new StringBuilder();

        int overAllCount = 0;

        for (Map.Entry<Integer, Integer> e : arrayRepetidos.entrySet()) {
            if (e.getValue() > 1) {
                overAllCount += 1;

                sb.append("\n");
                sb.append(e.getKey());
                sb.append(": ");
                sb.append(e.getValue());
                sb.append(" vezes.");
            }

        }

        sb.insert(0, "\nSão eles:");
        sb.insert(0, overAllCount);
        sb.insert(0, "Números repetidos: ");


        System.out.println(sb);
    }
}