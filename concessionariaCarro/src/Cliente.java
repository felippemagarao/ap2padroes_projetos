public class Cliente {
    public static void main(String[] args) {
        // Montadora Fiat
        CarroBuilder fiatBuilder = new FiatBuilder();
        ConcessionariaDirector concessionariaFiat = new ConcessionariaDirector(fiatBuilder);
        concessionariaFiat.construirCarro();
        CarroProduct carroFiat = concessionariaFiat.getCarro();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Carro Fiat: " + carroFiat);
        System.out.println("-----------------------------------------------------------------------------");

        // Montadora Volks
        CarroBuilder volksBuilder = new VolksBuilder();
        ConcessionariaDirector concessionariaVolks = new ConcessionariaDirector(volksBuilder);
        concessionariaVolks.construirCarro();
        CarroProduct carroVolks = concessionariaVolks.getCarro();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Carro Volks: " + carroVolks);
        System.out.println("-----------------------------------------------------------------------------");
    }
}