package galeria;

import java.util.Scanner;

public class MainGaleria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar uma obra");
            System.out.println("2. Listar obras");
            System.out.println("3. Vender uma obra");
            System.out.println("4. Calcular o lucro total");
            System.out.println("5. Sair");
            System.out.print("Opçao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n Adicionar uma obra do tipo");
                    System.out.println("1. Quadro");
                    System.out.println("2. Escultura");
                    System.out.println("3. Obra Digital (NFT)");
                    System.out.print("Tipo de produto: ");
                    int opcaoProduto = sc.nextInt();
                    sc.nextLine();
                    switch (opcaoProduto) {
                        case 1:
                            System.out.print("Nome do Quadro: ");
                            String nome = sc.nextLine();
                            System.out.print("Autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Preço Base (Use virgulas para casas decimais!): ");
                            double precoBase = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Tipo de tinta (óleo, guache, aguarela): ");
                            String tipoTinta = sc.nextLine();
                            System.out.print("Tamanho da tela (S, M, L, XL): ");
                            String tamanhoTela = sc.nextLine();
                            System.out.print("Está emoldurada? (S/N): ");
                            Boolean seEmoldurada;
                            if (sc.nextLine() == "S") {
                                seEmoldurada = true;
                            } else {
                                seEmoldurada = false;
                            }
                            galeria.adicionarObra(new Quadro(nome, autor, precoBase, tipoTinta, seEmoldurada, tamanhoTela));
                            break;

                        case 2:
                            System.out.print("Nome da Escultura: ");
                            nome = sc.nextLine();
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Preço Base: ");
                            precoBase = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Material (Madeira, Cerâmica, Metal): ");
                            String material = sc.nextLine();
                            System.out.print("É peça única? (S/N): ");
                            Boolean peçaUnica;
                            if (sc.nextLine() == "S") {
                                peçaUnica = true;
                            } else {
                                peçaUnica = false;
                            }
                            int quantidade;
                            if (peçaUnica == true) {
                                quantidade = 0;
                            } else {
                                System.out.print("Quantidade: ");
                                quantidade = sc.nextInt();
                            }
                            galeria.adicionarObra(new Escultura(nome, autor, precoBase, material, peçaUnica, quantidade));
                            break;

                        case 3:
                            System.out.print("Nome da Obra Digital: ");
                            nome = sc.nextLine();
                            System.out.print("Autor: ");
                            autor = sc.nextLine();
                            System.out.print("Preço Base: ");
                            precoBase = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("BlockChain (Etherum, Polygon, Solana, etc): ");
                            String blockChain = sc.nextLine();
                            System.out.print("Endereço do contrato (Em Hexadecimal [Ex: 0x1234567890]): ");
                            String enderecoContrato = sc.nextLine();
                            galeria.adicionarObra(new ObraDigital(nome, autor, precoBase, blockChain, enderecoContrato));
                            break;
                    }
                    break;
                case 2:
                    galeria.listarObras();
                    break;
                case 3:
                    galeria.listarObras();
                    System.out.print("Digite o ID da obra que deseja vender: ");
                    int id = sc.nextInt();
                    System.out.print("Digite o preço da obra pelo o qual a pretende vender! : ");
                    double preco = sc.nextDouble();
                    galeria.venderObra(id, preco);
                    break;
                case 4:
                    System.out.println("Lucro total: " + galeria.calcularLucroTotal());
                    break;
                case 5:
                    System.out.println("5. Sair");
                    sc.close();
                    break;
            }
        } while (opcao != 5);
    }
}