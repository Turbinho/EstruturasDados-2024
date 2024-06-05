package Exercicio8;
import java.util.Random;

public class Vetor {
    private int[] dados;

    public Vetor(int tamanho) {
        dados = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            dados[i] = rand.nextInt(10000) + 1;
        }
    }

    public int[] getDados() {
        return dados;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }

    public int[] cloneDados() {
        return dados.clone();
    }
}
