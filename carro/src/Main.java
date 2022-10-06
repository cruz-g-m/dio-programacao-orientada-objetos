public class Main {
    public static void main(String[] args) {
       
        Carro carro = new Carro();

        carro.setCor("Amarela");
        carro.setModelo("Celta");
        carro.setCapacidadeTanque(20);

        System.out.println("Carro: ");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque() + "L");

        System.out.println("Preço para encher o tanque: " + carro.totalValorTanque(2.5) + " R$");

        System.out.println("======== // ======== // ====");

        Carro carro2 = new Carro("Cinza", "Fiat", 35);

        System.out.println("Carro: ");
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque() + "L");
        
        System.out.println("Preço para encher o tanque: " + carro2.totalValorTanque(2.5) + " R$");

    }
}
