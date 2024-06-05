package Exercicio2;
public class Vetor {
    private Alunos[] alunos;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade){
        this.capacidade = capacidade;
        this.alunos = new Alunos[capacidade];
        this.tamanho = 0;
    }

    public adicionarAluno(Aluno aluno){
        if (tamanho < capacidade){
            Alunos[tamanho] = alunos;
            tamanho++;
        }else{
            System.out.print("Cheio.");
        }
    }
}
