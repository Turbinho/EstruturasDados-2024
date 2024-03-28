import java.lang.Math;

public class PontoCartesiano {
    private double x;
    private double y;

    // Construtor
    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância euclidiana entre este ponto e outro ponto
    public double calcularDistancia(PontoCartesiano outroPonto) {
        double deltaX = this.x - outroPonto.getX();
        double deltaY = this.y - outroPonto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
