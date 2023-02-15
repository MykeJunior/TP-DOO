
public class Professores extends Candidatos implements SistemaDeNotas{

    public Professores(String nome,String email,String telefone, String endereco,String formacao) {
        super(nome, email, telefone, endereco, formacao);//chamada do contrutor da super classe
    
    }
    private int anoDeExperienciaEmdocencia;
    private double notaDidatica1;
    private double notaDidatica2;
    private double notaDidatica3;

 
    public int getAnoDeExperienciaEmdocencia() {
        return anoDeExperienciaEmdocencia;
    }

    public void setAnoDeExperienciaEmdocencia(int anoDeExperienciaEmdocencia) {
        this.anoDeExperienciaEmdocencia = anoDeExperienciaEmdocencia;
    }

    public double getNotaDidatica1() {
        return notaDidatica1;
    }

    public void setNotasDidaticas(double notaDidatica1, double notaDidatica2,double notaDidatica3) {
        this.notaDidatica1 = notaDidatica1;
        this.notaDidatica2 = notaDidatica2;
        this.notaDidatica3 = notaDidatica3;
    }


    public double getNotaDidatica2() {
        return notaDidatica2;
    }

 
    /*public void setNotaDidatica2(double notaDidatica2) {
        this.notaDidatica2 = notaDidatica2;
    }*/

 
    public double getNotaDidatica3() {
        return notaDidatica3;
    }
    
    /*public void setNotaDidatica3(double notaDidatica3) {
        this.notaDidatica3 = notaDidatica3;
    }*/

    @Override
    public double mediaNotas(double n1, double n2, double n3) {
        double media;
        media = (n1+n2+n3)/3;
        return media;
    }

   

    
    
}
