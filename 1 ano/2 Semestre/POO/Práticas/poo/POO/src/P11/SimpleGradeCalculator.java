package P11;
import java.util.*;

public class SimpleGradeCalculator implements IGradeCalculator {

    @Override
    public double calculate(List<Double> notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
