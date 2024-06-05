package Exercicio8;

public class Main {
    public static void main(String[] args) {
        int tamanhoVetor = 1000;
        Vetor vetor = new Vetor(tamanhoVetor);

        int[] vetorBolha = vetor.cloneDados();
        int[] vetorSelecao = vetor.cloneDados();
        int[] vetorInsercao = vetor.cloneDados();

        long inicio, fim;

        // Medindo tempo de execução do Bolha
        inicio = System.currentTimeMillis();
        Ordenacao.bolha(vetorBolha);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução - Bolha: " + (fim - inicio) + " ms");

        // Medindo tempo de execução do Seleção
        inicio = System.currentTimeMillis();
        Ordenacao.selecao(vetorSelecao);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução - Seleção: " + (fim - inicio) + " ms");

        // Medindo tempo de execução do Inserção
        inicio = System.currentTimeMillis();
        Ordenacao.insercao(vetorInsercao);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução - Inserção: " + (fim - inicio) + " ms");
    }
}

