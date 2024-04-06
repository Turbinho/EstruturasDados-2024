package Repositório.EstruturasDados-2024.Exercício2;

public class Alunos {
    private String nome;
    private int idade;
    private double nota;

    //Construtor
    public Alunos (String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    
    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getNota(){
        return nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(double nota){
        this.nota = nota;
    }


}
