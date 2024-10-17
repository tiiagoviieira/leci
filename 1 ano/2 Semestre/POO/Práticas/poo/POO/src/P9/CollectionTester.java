package P9;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        int[] dimensions = {1000, 5000, 10000, 20000, 40000, 100000};

        System.out.println("Collection\tAdd (ms)\tSearch (ms)\tRemove (ms)");

        Collection<Integer> col;

        for (int DIM : dimensions) {
            col = new ArrayList<>();
            double[] arrayListTimes = checkPerformance(col, DIM);
            System.out.println("ArrayList(" + DIM + ")\t" + arrayListTimes[0] + "\t\t" + arrayListTimes[1] + "\t\t" + arrayListTimes[2]);

            col = new LinkedList<>();
            double[] linkedListTimes = checkPerformance(col, DIM);
            System.out.println("LinkedList(" + DIM + ")\t" + linkedListTimes[0] + "\t\t" + linkedListTimes[1] + "\t\t" + linkedListTimes[2]);

            col = new HashSet<>();
            double[] hashSetTimes = checkPerformance(col, DIM);
            System.out.println("HashSet(" + DIM + ")\t" + hashSetTimes[0] + "\t\t" + hashSetTimes[1] + "\t\t" + hashSetTimes[2]);

            col = new TreeSet<>();
            double[] treeSetTimes = checkPerformance(col, DIM);
            System.out.println("TreeSet(" + DIM + ")\t" + treeSetTimes[0] + "\t\t" + treeSetTimes[1] + "\t\t" + treeSetTimes[2]);

            System.out.println();
        }
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double[] times = new double[3];
        double start, stop, delta;

        // Add
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) col.add(i);
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        times[0] = delta;

        // Search
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            col.contains(n);
        }
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        times[1] = delta;

        // Remove
        start = System.nanoTime();
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime();
        delta = (stop - start) / 1e6;
        times[2] = delta;

        return times;
    }
}
