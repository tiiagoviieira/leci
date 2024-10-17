package P9;

public class Plane {
    String id;
    String fabricante;
    String modelo;
    int ano;
    int numMaxPassageiros;
    int velMax;
    String planeType = "Plane";

    public Plane(String id, String fabricante, String modelo, int ano, int numMaxPassageiros, int velMax, String PlaneType) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.numMaxPassageiros = numMaxPassageiros;
        this.velMax = velMax;
        this.planeType = PlaneType;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumMaxPassageiros() {
        return this.numMaxPassageiros;
    }

    public void setNumMaxPassageiros(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }

    public int getVelMax() {
        return this.velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public String toString() {
        return "Plane{" + "\nid=" + id + ", \nfabricante=" + fabricante + ", \nmodelo=" + modelo + ", \nano=" + ano + ", \nnumMaxPassageiros=" + numMaxPassageiros + ", \nvelMax=" + velMax + '}';
    }

    public String getPlaneType() {
        return this.planeType;
    }
}
