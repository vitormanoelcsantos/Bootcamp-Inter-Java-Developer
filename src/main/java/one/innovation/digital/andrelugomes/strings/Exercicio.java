package one.innovation.digital.andrelugomes.strings;

import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {

//      Converte uma String em um Array de char, ou seja, uma String de 10 posições irá ser convertida
//      em um vetor char[] de 10 posições
        System.out.println("A B C D E F G".toCharArray());
        String letras = "ABCDEFG";
        for (char letrasChar : letras.toCharArray()){
            System.out.println("Char: "+ letrasChar);
        };

//
//      O método split quebra uma String em várias substrings a partir de um caracter definido por você.
//      Por exemplo, a String "nome;teste;10", se você escolher como caracter o ";" ele quebrará a string
//      em nome teste 10, ou seja, um vetor de três posições.
        String frase = "Aula de java";
        String array[] = frase.split(" ");// escolhendo o espaço
        for (int i = 0; i < array.length; i++){
            System.out.println("A string cortada fica: " + array[i]);
        }


//      Como as strings são imutáveis, a operação de concatenação na verdade gera e retorna um novo objeto String
//      contendo os caracteres pertencentes às duas (ou mais) strings que participaram da concatenação.
//      Funcionando igual ao +.
        System.out.println("Aula".concat(" de Java"));


//      Ambos os métodos tem a função de substituir um conjunto de caracteres por outro conjunto de caracteres,
//      porém a diferença entre eles consiste no fato do método replaceAll utilizar expressão regular (regex)
//      para encontrar o grupo de caracteres.
        System.out.println("12345678910 abcd qw".replaceAll("[0,9,A-Z]".toLowerCase(), "#"));
//      Já o replace utiliza somente o grupo em si como filtro.
        System.out.println("12345678910 abcd qw".replace("12345678910", "#"));
    }
}
