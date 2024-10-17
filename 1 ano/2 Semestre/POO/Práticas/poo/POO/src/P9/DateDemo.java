package P9;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DateDemo {
    public static void main(String[] args) {
        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(2024, 4, 22)); // Data fictícia para exemplo
        c4.add(new Date(2023, 12, 1));
        c4.add(new Date(2000,8, 30));
        c4.add(new Date(2017, 4, 3));
        c4.add(new Date(2023, 2, 1));

        Iterator<Date> iterator = c4.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

//Date class nao existe pq n cheguei a fzr no guiao 7 
// mas eu testei com uma classe de um colega e tava a funcionar bem