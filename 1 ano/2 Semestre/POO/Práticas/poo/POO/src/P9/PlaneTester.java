package P9;
import java.util.Scanner;

public class PlaneTester {

    public static void main(String[] args) {
        PlaneManager manager = new PlaneManager();
        manager.addPlane();
        manager.addPlane();
        manager.addPlane();
        manager.addPlane();
        manager.printAllPlanes();
        System.out.println("nsira o id de um dos avioes para eleminar!");
        Scanner a = new Scanner(System.in);
        String id = a.next();
        manager.removePlane(id);
        manager.printAllPlanes();
        manager.getCommercialPlanes();
        manager.getMilitaryPlanes();
        manager.getFastestPlane();
        a.close();
    }

}
