package P8;
import java.util.ArrayList;
import java.util.List;

public class EmpresaAluguer {
    String nome;
    String codigoPostal;
    String email;
    List<Veiculo> viaturas;

    public EmpresaAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.viaturas = new ArrayList<>();
    }

    public void adicionarViatura(Veiculo viatura) {
        this.viaturas.add(viatura);
    }

    public void removerViatura(Veiculo viatura) {
        this.viaturas.remove(viatura);
    }

    public void imprimirViaturas() {
        for (Veiculo viatura : this.viaturas) {
            System.out.println(viatura);
        }
    }

    public List<Veiculo> getViaturas() {
        return this.viaturas;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigoPostal() {
        return this.codigoPostal;
    }   

    public String getEmail() {
        return this.email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Veiculo> getMaxKM () {
        double maxKm = 0;
        Veiculo maxKmViatura = null;
        for (Veiculo viatura : viaturas) {
            if (viatura instanceof KmPercorridosInterface) {
                if (viatura.getKmPercorridos() > maxKm) {
                    maxKm = viatura.getKmPercorridos();
                    maxKmViatura = viatura;
                }
            }
        }
    }
}
