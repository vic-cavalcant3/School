public class Aluno {
    String nome;
    int idade;
    double[] notas;

    public Aluno(String nome, int idade, double[] notas){
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public double CalcularMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean aprovado(){
        return CalcularMedia() >= 7;
    }

    public void ExibirDados(){
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("A idade do aluno é: " + idade   );
        System.out.println("A media do aluno é: " + CalcularMedia());
        System.out.println("O aluno foi aprovado? " + (aprovado() ? "Sim" : "Não"));

    }

}
