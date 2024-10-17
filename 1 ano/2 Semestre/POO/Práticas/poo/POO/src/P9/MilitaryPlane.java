package P9;

public class MilitaryPlane extends Plane {

    int numMunicion;

    public MilitaryPlane(String id, String fabricante, String modelo, int ano, int numMaxPassageiros, int velMax, int numMunicion) {
        super(id, fabricante, modelo, ano, numMaxPassageiros, velMax, "Military");
        this.numMunicion = numMunicion;
    }

    public int getNumMunicion() {
        return this.numMunicion;
    }

    public void setNumMunicion(int numMunicion) {
        this.numMunicion = numMunicion;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" + "\nid=" + id + ", \nfabricante=" + fabricante + ", \nmodelo=" + modelo + ", \nano=" + ano + ", \nnumMaxPassageiros=" + numMaxPassageiros + ", \nvelMax=" + velMax + ", \nnumMunicion=" + numMunicion + '}';
    }

    @Override
    public String getPlaneType() {
        return "Military";
    }

}
