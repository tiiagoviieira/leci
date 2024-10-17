package P4;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;



public class P4Ex1 {

    private final static List<Circulo> osCirculos = new ArrayList<>();
    private final static List<Retangulo> osRetangulos = new ArrayList<>();
    private final static List<Triangulo> osTriangulos = new ArrayList<>();
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choise;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar círculo");
            System.out.println("2. Criar triângulo");
            System.out.println("3. Criar retângulo");
            System.out.println("4. Listar figuras");
            System.out.println("5. Comparar figuras");
            System.out.println("0. Sair");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    makeCirculo();
                    break;
                case 2:
                    makeTriangulo();
                    break;
                case 3:
                    makeRetangulo();
                    break;
                case 4:
                    printAll();
                    break;
                case 5:
                    makeComparations();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (choise != 0);

        input.close();

    }

        public static void makeComparations() {
            Scanner input = new Scanner(System.in);
            System.out.println("Qual figura você deseja comparar?\n1. Círculo\n2. Retângulo\n3. Triângulo\n");
            int escolha = input.nextInt();
            if (escolha == 1) {

                for (int i = 1; i <= osCirculos.size(); i++) {
                    System.out.println(i + "º - Circulo");
                }

                System.out.println("Qual círculo você deseja comparar?");
                int comp1 = input.nextInt();
                System.out.println("Qual outra circulo você deseja comparar o anterior?");
                int comp2 = input.nextInt();
                System.out.println(osCirculos.get(comp1 - 1).equals(osCirculos.get(comp2 - 1)));

            }   else if (escolha == 2) {

                for (int i = 1; i <= osRetangulos.size(); i++) {
                    System.out.println(i + "º - Retangulo");
                }

                System.out.println("Qual retangulo você deseja comparar?");
                int comp1 = input.nextInt();
                System.out.println("Qual outra retangulo você deseja comparar o anterior?");
                int comp2 = input.nextInt();
                System.out.println(osRetangulos.get(comp1 - 1).equals(osRetangulos.get(comp2 - 1)));

            }   else if (escolha == 3) {

                for (int i = 1; i <= osTriangulos.size(); i++) {
                    System.out.println(i + "º - Triângulo");
                }

                System.out.println("Qual triangulo você deseja comparar?");
                int comp1 = input.nextInt();
                System.out.println("Qual outra triangulo você deseja comparar o anterior?");
                int comp2 = input.nextInt();
                System.out.println(osTriangulos.get(comp1 - 1).equals(osTriangulos.get(comp2 - 1)));

            }   else {
                System.out.println("Opção inválida!");
            }
        }

        public static void printAll() {
            for (Circulo c : osCirculos) {
                System.out.println(c.toString());
            }
            for (Retangulo r : osRetangulos) {
                System.out.println(r.toString());
            }
            for (Triangulo t : osTriangulos) {
                System.out.println(t.toString());
            }
    }   


        public static void makeCirculo() {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do círculo:");
        double raio = input.nextDouble();
        final Circulo circulo = new Circulo(raio);
        System.out.println("Círculo criado: " + circulo);
        osCirculos.add(circulo);
        }

        private static void makeRetangulo() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento do retângulo:");
        double comprimento = input.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = input.nextDouble();
        final Retangulo rectangulo = new Retangulo(comprimento, altura);
        System.out.println("Retângulo criado: " + rectangulo);
        osRetangulos.add(rectangulo);
    }

        private static void makeTriangulo() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o lado 1 do triângulo:");
        double lado1 = input.nextDouble();
        System.out.println("Digite o lado 2 do triângulo:");
        double lado2 = input.nextDouble();
        System.out.println("Digite o lado 3 do triângulo:");
        double lado3 = input.nextDouble();
        final Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        System.out.println("Triângulo criado: " + triangulo);
        osTriangulos.add(triangulo);
    }

}

class Circulo {

    double raio;

    public Circulo (double raio) {
        if (raio <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido\n");
        } else {    this.raio = raio;   }
    }

    public double getRaio () {
        return raio;
    }

    public void setRaio (double raio) {
        if (raio <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido\n");
        } else {    this.raio = raio;   }
    }
    
    public double getArea () {
        return ( Math.PI * Math.pow(raio, 2));
    }

    public double getPerimetro () {
        return ( Math.PI * 2 * raio);
    }

    public String toString() {
        return "Circulo [ raio : " + raio + " ]";
    }

    public String equals(Circulo comparador) {
        if (this.raio == comparador.getRaio()) {
            return "São iguais";
        } else {
            return "São diferentes";
        }
    }
}

class Retangulo {

    double comprimento;
    double altura;

    public Retangulo (double comprimento, double altura) {
        if (comprimento <= 0 || altura <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    
            this.comprimento = comprimento;   
            this.altura = altura;
        }
    }

    public double getAltura () {
        return altura;
    }

    public double getComprimento () {
        return comprimento;
    }

    public void setComprimento (double comprimento) {
        if (comprimento <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    this.comprimento = comprimento;   }
    }

    public void setAltura (double altura) {
        if (altura <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    this.altura = altura;   }
    }
    
    public double getArea () {
        return ( comprimento * altura);
    }

    public double getPerimetro () {
        return ( (2 * comprimento) + (2 * altura) );
    }

    public String toString() {
        return "Retangulo [ altura : " + altura + " comprimento : " + comprimento + " ]";
    }

    public String equals(Retangulo comparador) {
        if (this.altura == comparador.getAltura() && this.comprimento == comparador.getComprimento()) {
            return "São iguais";
        } else {
            return "São diferentes";
        }
    }
}

class Triangulo {

    double lado1;
    double lado2;
    double lado3;

    public Triangulo (double lado1, double lado2, double lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } 
        else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Os lados do triângulo não satisfazem a desigualdade triangular");
        } else {    
            this.lado1 = lado1;   
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
    }

    public double getLado1 () {
        return lado1;
    }

    public double getLado2 () {
        return lado2;
    }

    public double getLado3 () {
        return lado3;
    }

    public void setLado1 (double lado1) {
        if (lado1 <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    this.lado1 = lado1;   }
    }

    public void setLado2 (double lado2) {
        if (lado2 <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    this.lado2 = lado2;   }
    }

    public void setLado3 (double lado3) {
        if (lado3 <= 0) {
            throw new ArithmeticException("Valor Inserido Inválido");
        } else {    this.lado3 = lado3;   }
    }
    
    public double getArea (double p) {
        p = getPerimetro() / 2;
        return ( Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3)));
    }

    public double getPerimetro () {
        return ( lado1 + lado2 + lado3 );
    }

    public String toString() {
        return "Retangulo [ lado1 : " + lado1 + " lado2 : " + lado2 + " lado3 : " + lado3 + " ]";
    }

    public String equals(Triangulo comparador) {
        if (this.lado1 == comparador.getLado1() && this.lado2 == comparador.getLado2() && this.lado3 == comparador.getLado3()) {
            return "São iguais";
        } else {
            return "São diferentes";
        }
    }
    
}