package one.innovation.digital.marcopollivier.orientacaoObjeto.segundoDesafio;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
//        Uma estrutura para percorrer um vetor. Um vetor é uma "matriz" que só contém uma linha.

//        System.out.println("Hello world");
//        int numbers[] = {0, 1, 3, 4, 5};
//        for (int i = 3; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//        Uma estrutura para percorrer um vetor e retornar um valor caso ele esteja dentro do mesmo e a sua posição.

//        Scanner scanner = new Scanner(System.in);
//        int numbers[] = {10, 5, 30, 7, 6};
//        int tamanho = numbers.length;
//        int choose;
//        boolean find = false;
//        System.out.println("Informe qual número você quer achar no vetor:");
//        choose = scanner.nextInt();
//        for (int i = 0; i < tamanho; i++) {
//            if (numbers[i] == choose) {
//                System.out.println("O número " + choose + " está presente no vetor. Na posição: " + i);
//                find = true;
//            }
//        }
//        if (find == false) {
//            System.out.println("O número " + choose + " não foi encontrado.");
//        }

//        Matriz com 25 posições preenchido automaticamente e exibindo os valores um ao lado do outro.
//        Lembrar de não usar o ln pra não pular linha

//        int preenchimento = 5;
//        int numbers[][] = new int[preenchimento][preenchimento];
//
//        for (int i = 0; i < preenchimento; i++) {
//            for (int j = 0; j < preenchimento; j++) {
//                numbers[i][j] = (int) (Math.random() * 10);
//                System.out.print("[" + numbers[i][j] + "]");
//
//            }
//            System.out.println("");
//        }
//       Na teoria isto deveria funcionar, porém, dá ele retorna esse erro Cannot assign field because is null
//       e não estou com cabeça, mas eu entendi a lógica.
//       Erro resolvido, consistia apenas na falta da instância de um objeto dentro do laço.

//        Código responsável por criar um vetor de objetos e guardar informações nele e logo após exibir.


//        Livros[] livros = new Livros[3];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            livros[i] = new Livros();
//            System.out.println("Informe o novo nome: ");
//            livros[i].setNome(scanner.nextLine());
//            System.out.println("Informe o preço: ");
//            livros[i].setPreco(scanner.nextInt());
//            System.out.println("Informe as páginas: ");
//            livros[i].setPaginas(scanner.nextInt());
//            scanner.nextLine();
//        }
//
//        for (int i = 0; i < livros.length; i++) {
//            System.out.println("Nome do livro: " + livros[i].getNome());
//            System.out.println("Preço do livro: " + livros[i].getPreco());
//            System.out.println("Páginas do livro: " + livros[i].getPaginas());
//        }
    }
}
