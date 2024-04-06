public class TestePontoCartesiano {
    public static void main(String[] args) {
        // Teste do TAD PontoCartesiano
        PontoCartesiano ponto1 = new PontoCartesiano(3, 4);
        PontoCartesiano ponto2 = new PontoCartesiano(6, 8);

        System.out.println("Coordenadas do ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre os pontos: " + distancia);
    }
}
