package P8;

class Motociclo extends Veiculo implements KmPercorridosInterface {
    private double kmPercorridos;

    public Motociclo(String matricula, String marca, String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        this.kmPercorridos = 0.0;
    }

    @Override
    public void registarKm(double km) {
        this.kmPercorridos += km;
    }

    @Override
    public double getKmPercorridos() {
        return this.kmPercorridos;
    }
}