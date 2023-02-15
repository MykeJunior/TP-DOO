
import java.util.ArrayList;

public class Cadastro {

    ArrayList<Taes> tae = new ArrayList<>();
    ArrayList<Professores> professor = new ArrayList<>();

    void cadastrarTaes(Candidatos candidato) {
        if (candidato.getFormacao().equalsIgnoreCase("Doutorado")
                || candidato.getFormacao().equalsIgnoreCase("Mestrado")
                || candidato.getFormacao().equalsIgnoreCase("Especialista(360h)")
                || candidato.getFormacao().equalsIgnoreCase("Especialista(180h)")
                || candidato.getFormacao().equalsIgnoreCase("Superior")
                || candidato.getFormacao().equalsIgnoreCase("Ensino medio") && candidato instanceof Taes) {
            Taes t = (Taes) candidato;
            tae.add(t);
            System.out.println("candidato cadastrado!");
        } else {
            System.err.println("Nao foi possivel cadastrar");
        }
    }

    void cadastrarProfessores(Candidatos candidato) {
        if (candidato.getFormacao().equalsIgnoreCase("Doutorado")
                || candidato.getFormacao().equalsIgnoreCase("Mestrado")
                || candidato.getFormacao().equalsIgnoreCase("Especialista(360h)")
                || candidato.getFormacao().equalsIgnoreCase("Especialista(180h)")
                || candidato.getFormacao().equalsIgnoreCase("Bacharelado")
                || candidato.getFormacao().equalsIgnoreCase("Licenciatura") && candidato instanceof Professores) {
            Professores p = (Professores) candidato;
            professor.add(p);
            System.out.println("candidato cadastrado!");
        } else {
            System.err.println("Nao foi possivel cadastrar");
        }
    }

    void listarCandidatos() {
        //tae.forEach((t)->{System.out.println(t.getNome()+" "+t.getFormacao());});
        tae.forEach((t) -> {
            System.out.println(t.getNome());
        });
        professor.forEach((p) -> {
            System.out.println(p.getNome());
        });
    }

}
