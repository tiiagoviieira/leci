package P8;

public class Main {
    public static void main(String[] args) {
        EmpresaAluguer empresa = new EmpresaAluguer("RentACar", "12345", "rentacar@example.com");

        Motociclo moto = new Motociclo("AB-12-34", "Honda", "CBR 1000RR", 200);
        empresa.adicionarViatura(moto);

        Ligeiro carro = new Ligeiro("CD-56-78", "Volkswagen", "Golf", 150, "123456789", 500);
        empresa.adicionarViatura(carro);

        Taxi taxi = new Taxi("EF-90-12", "Toyota", "Prius", 120, "987654321", 400, "T123");
        empresa.adicionarViatura(taxi);

        pesadoMercaderias camiao = new pesadoMercaderias("GH-34-56", "Scania", "R500", 500, "456789012", 10, 20);
        empresa.adicionarViatura(camiao);

        pesadoPassageiros autocarro = new pesadoPassageiros("IJ-78-90", "Mercedes-Benz", "Tourismo", 400, "345678901", 15, 50);
        empresa.adicionarViatura(autocarro);

        System.out.println("Lista de viaturas da empresa:");
        for (Veiculo veiculo : empresa.getViaturas()) {
            System.out.println(veiculo);
        }

        Veiculo comMaiorKm = null;
        double maiorKm = 0.0;
        for (Veiculo veiculo : empresa.getViaturas()) {
            if (veiculo instanceof KmPercorridosInterface) {
                KmPercorridosInterface veiculoComKm = (KmPercorridosInterface) veiculo;
                if (veiculoComKm.getKmPercorridos() > maiorKm) {
                    maiorKm = veiculoComKm.getKmPercorridos();
                    comMaiorKm = veiculo;
                }
            }
        }
        System.out.println("Viatura com maior quilómetros percorridos:");
        System.out.println(comMaiorKm);
    }
}