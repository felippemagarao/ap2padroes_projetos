

public class FiatBuilder extends CarroBuilder {
    @Override
    public void buildModelo() {
        carro.setModelo("Fiat");
    }
    @Override
    public void buildCor() {
        carro.setCor("Vermelho");
    }
    @Override
    public void buildNumPortas() {
        carro.setNumPortas(4);
    }
    @Override
    public void buildMotor() {
        carro.setMotor("1.0");
    }
}
