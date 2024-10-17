package P11;

import java.util.*;
import java.io.*;

public class Gradebook {

    List <Student> students;

    public Gradebook () {
        students = new ArrayList <Student> ();
    }

    public void load(String ficheiroNome) {
        File ficheiro = new File (ficheiroNome);
        try {
            Scanner sc = new Scanner(ficheiro);
            while (sc.hasNextLine()) {
                String frase = sc.nextLine();
                int a = 0;
                String nome = "";
                ArrayList <Double> notas;
                for (int i = 0 ; i < frase.length() ; i++) {
                    if (frase.charAt(i) == '|') {
                        a = i;
                        if (a > i) {
                            notas = new ArrayList <Double> ();
                            notas.add(sc.nextDouble());
                        } else {
                            nome = frase.substring(0, i);
                        }
                    }
                }
                students.add(new Student(nome, notas));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + ficheiroNome);
        }
        
    }

    public void addStudent(Student estudante) {
        students.add(estudante);
    }

    public void removeStudent(String nome) {
        for (Student estudante : students) {
            if (estudante.getName().equals(nome)) {
                students.remove(estudante);
                return;
            }
        }
    }

    public Student getStudent(String nome) {
        for (Student estudante : students) {
            if (estudante.getName().equals(nome)) {
                return estudante;
            }
        }
        return null;
    }

    public double calculateAverageGrade(String nome) {
        for (Student estudante : students) {
            if (estudante.getName().equals(nome)) {
                SimpleGradeCalculator calc = new SimpleGradeCalculator();
                return calc.calculate(estudante.getGrades());
            }
        }
        return 0.0;
    }

    public void printAllStudents() {
        for (Student estudante : students) {
            System.out.println(estudante);
        }
    }
}
