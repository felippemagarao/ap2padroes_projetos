

public class ConcessionariaDirector {
    private CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro() {
        montadora.buildModelo();
        montadora.buildCor();
        montadora.buildNumPortas();
        montadora.buildMotor();
    }

    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
}
