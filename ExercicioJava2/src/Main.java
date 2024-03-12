import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {;



        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite seu nome:");
        a.setNome(sc.nextLine());

        System.out.println("digite sua primeira nota:");
        a.setNota1(sc2.nextDouble());
        System.out.println("digite sua segunda nota:");
        a.setNota2(sc2.nextDouble());
        System.out.println("digite sua terceira nota:");
        a.setNota3(sc2.nextDouble());


        System.out.println("Media:");
        System.out.println(a.getMedia());


        System.out.println("Situação: ");

        if(a.getMedia() >= 7.0) {
               System.out.println("Aprovado!!");
           }

            else if(4.0 <= a.getMedia()) {
               System.out.println("Reprovado!!");


            }
            else {
               System.out.println("Está na final!!");

           }



        }

    }






