public class Aluno {
    String nome;
    double nota1;

    double nota2;

    double nota3;
    double media;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    public double getMedia() {
        return (media = nota1 + nota2 + nota3) / 3;



    }

    }




