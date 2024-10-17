package P10;

import java.util.*;

public class findCaracters {

    String word;
    Map<Character, ArrayList<Integer> > positions;

    public findCaracters() {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        this.word = sc.nextLine();
        sc.close();
    }

    public void getResults () {
        this.positions = new HashMap<>();
        for (int i = 0; i < this.word.length(); i++) {
            char c = this.word.charAt(i);
            if (this.positions.containsKey(c)) {
                this.positions.get(c).add(i);
            } else {
                this.positions.put(c, new ArrayList<Integer>());
                this.positions.get(c).add(i);
            }
        }
    }

    public void printResults () {
        for (Character c : this.positions.keySet()) {
            System.out.println(c + " " + this.positions.get(c));
        }
    }

    public static void main(String[] args) {
        findCaracters fc = new findCaracters();
        fc.getResults();
        fc.printResults();
    }

}
