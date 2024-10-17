package P9;

public class CommercialPlane extends Plane {
    
    int numTripulantes;

    public CommercialPlane(String id, String fabricante, String modelo, int ano, int numMaxPassageiros, int velMax, int numTripulantes) {
        super(id, fabricante, modelo, ano, numMaxPassageiros, velMax, "Commercial");
        this.numTripulantes = numTripulantes;
    }

    public int getNumTripulantes() {
        return this.numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    @Override
    public String toString() {
        return "CommercialPlane{" + "\nid=" + id + ", \nfabricante=" + fabricante + ", \nmodelo=" + modelo + ", \nano=" + ano + ", \nnumMaxPassageiros=" + numMaxPassageiros + ", \nvelMax=" + velMax + ", \nnumTripulantes=" + numTripulantes + '}';
    }

    @Override
    public String getPlaneType() {
        return "Commercial";
    }

}
