
public abstract class CarroBuilder {
  protected CarroProduct carro;

  public CarroBuilder() {
    this.carro = new CarroProduct();
  }

  public abstract void buildModelo();

  public abstract void buildCor();

  public abstract void buildNumPortas();

  public abstract void buildMotor();

  public CarroProduct getCarro() {
    return carro;
  }
}
