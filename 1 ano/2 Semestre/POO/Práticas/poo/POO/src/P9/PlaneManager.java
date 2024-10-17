package P9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaneManager {

    List<Plane> planes = new ArrayList<>();

    public PlaneManager() {
    }

    public void addPlane() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique o id do avião:");
        String id = input.next();
        System.out.println("Indique o fabricante do avião:");
        String fabricante = input.next();
        System.out.println("Indique o modelo do avião:");
        String modelo = input.next();
        System.out.println("Indique o ano do avião:");
        int ano = input.nextInt();
        System.out.println("Indique o número máximo de passageiros do avião:");
        int numMaxPassageiros = input.nextInt();
        System.out.println("Indique a velocidade máxima do avião:");
        int velMax = input.nextInt();
        System.out.println("Indique o tipo de avião (Military ou Commercial):");
        String PlaneType = input.next();
        Plane plane = new Plane(id, fabricante , modelo, ano, numMaxPassageiros, velMax, PlaneType);
        planes.add(plane);
        System.out.println();
        System.out.println("Plane added!");
        input.close();
    }

    public void addPlaneWithObject(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId() == id) {
                planes.remove(plane);
                return;
            }
        }
    }

    public Plane searchPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }
        return null; 
    }

    public List<Plane> getCommercialPlanes() {
        List<Plane> comercial = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getPlaneType().equals("Commercial")) {
                comercial.add(plane);
            }
        }
        return comercial;
    }

    public List<Plane> getMilitaryPlanes() {
        List<Plane> militar = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getPlaneType().equals("Military")) {
                militar.add(plane);
            }
        }
        return militar;
    }

    public void printAllPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    public Plane getFastestPlane () {
        int max = 0;
        Plane fastest = null;
        for (Plane plane : planes) {
            if (plane.getVelMax() > max) {
                fastest = plane;
            }
        }
        return fastest;
    }
}
