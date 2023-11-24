

public class CarroProduct {
    private String modelo;
    private String cor;
    private int numPortas;
    private String motor;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", numPortas=" + numPortas +
                ", motor='" + motor + '\'' +
                '}';
    }
}