

public class VolksBuilder extends CarroBuilder {
    @Override
    public void buildModelo() {
        carro.setModelo("Volks");
    }
    @Override
    public void buildCor() {
        carro.setCor("Azul");
    }
    @Override
    public void buildNumPortas() {
        carro.setNumPortas(2);
    }
    @Override
    public void buildMotor() {
        carro.setMotor("2.0");
    }
}
