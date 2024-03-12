public class Calculadora {

    int n1;
    int n2;
    int soma;
    int subtracao;
    int divisao;
    int multiplicacao;
    int opcao;


    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public int getSoma() {
        return soma = (n1 + n2);
    }

    public int getSubtracao() {
        return subtracao = (n1 - n2);
    }

    public int getDivisao() {
        return divisao = (n1 / n2);
    }

    public int getMultiplicacao() {
        return multiplicacao = (n1 * n2);
    }
}



