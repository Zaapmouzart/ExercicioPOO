import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente1= new Cliente(); // Aqui eu auto declaro as variáveis, como aprendi na aula.
        cliente1.nome = "Leonardo Mouzart";
        cliente1.cpf = "444.555.888-10";
        cliente1.endereco = "Rua Dev, nº325, Bairro: Cidade Luz";

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Larissa Nathalia";
        cliente2.cpf = "777.888.222-21";
        cliente2.endereco = "Rua dos Abandonados, nº 485, Bairro: Onde Judas Perdeu as Botas";


        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Doug";
        cachorro1.raca = "Salsicha";
        cachorro1.sexo ="Macho";
        cachorro1.idade = 1.2;
        cachorro1.dono = cliente1;


        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Luna";
        cachorro2.raca= "Poodle";
        cachorro2.sexo = "Fêmea";
        cachorro2.idade = 0.4;
        cachorro2.dono = cliente2;

        Cliente cliente3 = new Cliente(); /*
        A partir daqui eu usei os conhecimentos de entrada de dados
         para atribuir valores ás classes por meio da classe Scanner.
        */

        System.out.print("Digite o nome do cliente: ");
        cliente3.nome = entrada.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cliente3.cpf = entrada.nextLine();
        System.out.print("Digite o endereço: ");
        cliente3.endereco = entrada.nextLine();

        Cachorro cachorro3 = new Cachorro(); // Por enquanto testado todos os campos foram atribuidos dessa forma


        System.out.print("Digite o nome do cachorro: ");
        cachorro3.nome = entrada.nextLine();
        System.out.print("Digite a raça do cachorro: ");
        cachorro3.raca = entrada.nextLine();
        System.out.print("Digite o sexo do cachorro: ");
        cachorro3.sexo = entrada.nextLine();
        System.out.print("Digite a idade do cachorro: ");
        cachorro3.idade = entrada.nextFloat();

        cachorro3.dono  = cliente3;

        System.out.println("--------------------------------------");
        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça:  %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %s%n", cachorro1.idade);
        System.out.printf("Dono: %s%n",cachorro1.dono.nome);


        System.out.println("--------------------------------------");

        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %s%n", cachorro2.idade);
        System.out.printf("Dono: %s%n", cachorro2.dono.nome);

        System.out.println("--------------------------------------");

        System.out.printf("Nome: %s%n", cachorro3.nome);
        System.out.printf("Raça: %s%n", cachorro3.raca);
        System.out.printf("Sexo: %s%n", cachorro3.sexo);
        System.out.printf("Idade: %.2f%n", cachorro3.idade);
        System.out.printf("Dono: %s%n", cachorro3.dono.nome);

    }
}