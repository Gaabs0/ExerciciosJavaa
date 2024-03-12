import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2= new Scanner(System.in);
    Funcionario f = new Funcionario();


        System.out.println("--Dados dos Funcionarios--") ;


        System.out.println("Digite sua matricula:");
        f.setMatricula(sc.nextDouble());
        System.out.println("Digite seu nome:");
        f.setNome(sc2.nextLine());
        System.out.println("Digite seu salario:");
        f.setSalario_bruto(sc.nextDouble());
        System.out.println("Desconto INSS: ");
        System.out.println(f.descontoINSS + f.getDescontoINSS());
        System.out.println("Salário liquido:  ");
        System.out.println(f.salarioliquido + f.getSalarioliquido());






    }


}