import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Sistema de Cadastro de Alunos =====");
        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadeAlunos = scanner.nextInt();
        scanner.nextLine(); // consumir quebra de linha

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("\n--- Aluno " + i + " ---");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine(); // consumir quebra de linha

            AlunoNovo alunoNovo = new AlunoNovo(nome, idade, nota1, nota2, nota3);
            System.out.println("\nResultado do aluno:");
            alunoNovo.ExibirDados();
        }

        scanner.close();
        System.out.println("\nCadastro finalizado.");
            }
        }




















//        double[] notas1 = {7.0 , 8.0 , 6.0};
//        AlunoTest aluno1 = new AlunoTest("Ana clara" , 17 , notas1);
//
//        double[] notas2 = {8.0 , 5.5 , 9.0};
//        AlunoTest aluno2 = new AlunoTest("João Victor" , 18 , notas2);
//
//        aluno1.ExibirDados();
//        System.out.println();
//        aluno2.ExibirDados();

























//        int nota1 = 8;
//        int nota2 = 7;
//
//        double media = (nota1 + nota2) / 2.0;
//        boolean aprovado = media >= 7;
//
//        System.out.println("Média " + media);
//        System.out.println("Aprovado " + aprovado);
//
//        System.out.println();
//
//        String nome = "Francisco";
//        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());
//        System.out.println("Número de letras: " + nome.length());
//        System.out.println("Primeira letra: " + nome.charAt(4));

//        System.out.println();
//
//        double[] notas = {7.5, 8.0, 6.5, 9.0};
//        double soma = 0;
//        for (double nota : notas) {
//            soma += nota;
//        }
//
//        double media = soma / notas.length;
//        System.out.println("Média da turma: " + media);
//
//        System.out.println();
//
//        String nome = "Maria";
//        int idade = 17;
//        double notaFinal = 8.6;
//        boolean passou = notaFinal >= 6.0;
//
//        System.out.println("Aluno: " + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("Nota Final: " + notaFinal);
//        System.out.println("Passou? " + passou);

