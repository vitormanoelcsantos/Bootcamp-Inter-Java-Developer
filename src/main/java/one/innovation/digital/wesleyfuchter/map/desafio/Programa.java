package one.innovation.digital.wesleyfuchter.map.desafio;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        hashMap();
        traco();
        hashTable();
        traco();
        treeMap();
        traco();
    }

    static void traco(){
        System.out.println();
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println();
    }

    static void hashMap(){
        Map<String, String> estadosBrasileiros = new HashMap<>();
        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("AP", "Amapá");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("CE", "Ceará");
        estadosBrasileiros.put("DF", "Distrito Federal");
        estadosBrasileiros.put("ES", "Espírito Santo");
        estadosBrasileiros.put("GO", "Goiás");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("PA", "Pará");
        estadosBrasileiros.put("PB", "Paraíba");
        estadosBrasileiros.put("PR", "Paraná");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piauí");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("RO", "Rondônia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("TO", "Tocantins");

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println(estadosNomesSiglas);
        }
        System.out.println();

        estadosBrasileiros.remove("MG");
        estadosBrasileiros.put("DF", "Distrito Federal");

        System.out.println("Tamanho do HashMap: " + estadosBrasileiros.size());
        System.out.println();

        estadosBrasileiros.remove("MS", "Mato Grosso do Sul");


        System.out.println("O estado de Santa Catarina está presente no HashMap? " + estadosBrasileiros.containsKey("SC"));
        System.out.println();

        System.out.println("O estado do Maranhã está está presente no HashMap? " + estadosBrasileiros.containsValue("Maranhão"));
        System.out.println();

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println("Nome do estado: " + estadosNomesSiglas.getValue() + ". (" + estadosNomesSiglas.getKey()+ ")");
        }
    }
    static void hashTable(){
        Map<String, String> estadosBrasileiros = new Hashtable<>();
        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("AP", "Amapá");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("CE", "Ceará");
        estadosBrasileiros.put("DF", "Distrito Federal");
        estadosBrasileiros.put("ES", "Espírito Santo");
        estadosBrasileiros.put("GO", "Goiás");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("PA", "Pará");
        estadosBrasileiros.put("PB", "Paraíba");
        estadosBrasileiros.put("PR", "Paraná");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piauí");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("RO", "Rondônia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("TO", "Tocantins");

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println(estadosNomesSiglas);
        }
        System.out.println();

        estadosBrasileiros.remove("MG");
        estadosBrasileiros.put("DF", "Distrito Federal");

        System.out.println("Tamanho do mapa HashTable: " + estadosBrasileiros.size());
        System.out.println();

        estadosBrasileiros.remove("MS", "Mato Grosso do Sul");


        System.out.println("O estado de Santa Catarina está presente no HashTable? " + estadosBrasileiros.containsKey("SC"));
        System.out.println();

        System.out.println("O estado do Maranhã está está presente no HashTable? " + estadosBrasileiros.containsValue("Maranhão"));
        System.out.println();

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println("Nome do estado: " + estadosNomesSiglas.getValue() + ". (" + estadosNomesSiglas.getKey()+ ")");
        }
    }
    static void treeMap(){
        Map<String, String> estadosBrasileiros = new TreeMap<>();
        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("AP", "Amapá");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("CE", "Ceará");
        estadosBrasileiros.put("DF", "Distrito Federal");
        estadosBrasileiros.put("ES", "Espírito Santo");
        estadosBrasileiros.put("GO", "Goiás");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("PA", "Pará");
        estadosBrasileiros.put("PB", "Paraíba");
        estadosBrasileiros.put("PR", "Paraná");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piauí");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("RO", "Rondônia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("TO", "Tocantins");

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println(estadosNomesSiglas);
        }
        System.out.println();

        estadosBrasileiros.remove("MG");
        estadosBrasileiros.put("DF", "Distrito Federal");

        System.out.println("Tamanho do TreeMap: " + estadosBrasileiros.size());
        System.out.println();

        estadosBrasileiros.remove("MS", "Mato Grosso do Sul");

        System.out.println("O estado de Santa Catarina está presente no TreeMap? " + estadosBrasileiros.containsKey("SC"));
        System.out.println();

        System.out.println("O estado do Maranhã está está presente no TreeMap? " + estadosBrasileiros.containsValue("Maranhão"));
        System.out.println();

        for (Map.Entry<String, String> estadosNomesSiglas : estadosBrasileiros.entrySet()) {
            System.out.println("Nome do estado: " + estadosNomesSiglas.getValue() + ". (" + estadosNomesSiglas.getKey()+ ")");
        }

        estadosBrasileiros.get(3);
    }
}
