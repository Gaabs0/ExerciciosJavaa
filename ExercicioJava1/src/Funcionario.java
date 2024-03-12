public class Funcionario {
    double  Matricula;
    String  nome;
    double salario_bruto;

    double descontoINSS;

    double salarioliquido;

    public void setMatricula(double matricula) {
    this.Matricula = Matricula;
    }

    public void setNome(String Nome) {
    this.nome = nome ;

    }
    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;

    }

    public double getDescontoINSS() {
        return descontoINSS = salario_bruto * 0.15;
    }

    public double getSalarioliquido() {
        return salarioliquido = salario_bruto - descontoINSS  ;
    }
}



