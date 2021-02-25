package one.innovation.digital.marcopollivier.orientacaoObjeto.desafio.primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Integer count = 1;
        System.out.println("Quantas pessoas terão no carro: ");
        Integer entradaP = new Scanner(System.in).nextInt();

        for (int i = 0; i < entradaP; i++){
            System.out.println("Informe o nome da pessoa que entrará no carro: ");
            String entrada = new Scanner(System.in).next();
            pessoas.add(new Pessoa(entrada));
            carro.setQuantidade(count++);
        }

        System.out.println("Alguém deseja sair? s/n");
        String resposta = new Scanner(System.in).next();
        if (resposta.toLowerCase().equals("s")){
            System.out.println("Informe o nome: ");
            String entradaN = new Scanner(System.in).next();
            for (Pessoa pessoa : pessoas) {
                if(pessoa.getNome().equals(entradaN)){
                    pessoas.remove(pessoa);
                    break;
                }
            }
        }

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }


//        carro.all();
//
//        System.out.println("Deseja alterar a quantidade de pessoas? s/n");
//        String resposta = new Scanner(System.in).next();
//        if (resposta.equals("s")){
////      Por algum motivo não está entrando no escopo, mas tudo bem.
////      O motivo era esse:
////      == checks to see if the actual object references are the same.
////      equals(...) checks if the two Strings hold the same string (ie the same characters in the same order)
//            System.out.println("Informe a nova quantidade de pessoas: ");
//            Scanner scI = new Scanner(System.in);
//            carro.setQuantidade(scI.nextInt());
//            System.out.println("A nova quantidade é: " + carro.mostrarQuantidade());
//        }
    }
}
