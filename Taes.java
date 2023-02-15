
public class Taes extends Candidatos {

    
    public Taes(String nome, String email, String telefone,String endereco,String formacao,int anoDeExperiencia) {
        super(nome, email, telefone, endereco, formacao);
        this.anoDeExperienciaProfissional=anoDeExperiencia;
    }
    
    private int anoDeExperienciaProfissional;

  
    public int getAnoDeExperienciaProfissional() {
        return anoDeExperienciaProfissional;
    }


    public void setAnoDeExperienciaProfissional(int anoDeExperienciaProfissional) {
        this.anoDeExperienciaProfissional = anoDeExperienciaProfissional;
    }

    
}
