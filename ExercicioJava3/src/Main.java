import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();


        System.out.println("Digite um numero:");
        c.setN1(sc.nextInt());

        System.out.println("Digite um numero:");
        c.setN2(sc.nextInt());

        System.out.println("Qual opção vc quer? ");
        c.setOpcao(sc.nextInt());

        int x = c.opcao;
        switch (x){
            case 0:
                break;
            case 1:
                System.out.println("Opção Soma escolhida. ");
                System.out.println("soma:" + c.getSoma());

                break;
            case 2:
                System.out.println("Opção Subtração escolhida");
                System.out.println("Subtração:" + c.getSubtracao());
                break;
            case 3:
                System.out.println("Opção Divisão escolhida.");
                System.out.println("Divisão:" + c.getDivisao());
                break;
            case 4:
                System.out.println("Opção Multiplicação escolhida.");
                System.out.println("Multiplicação:" + c.getMultiplicacao());
                break;

                default:
                System.out.println("Opção inválida");









    }





}}