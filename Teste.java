
public class Teste{

    public static void main(String[] args) {

        Taes t1 = new Taes("Myke", "mykejrjr@silva.com", "33984412647", "Rua Jose Camilo Dutra", "Doutorado", 5);
        Taes t2 = new Taes("Isaac", "isaacbarber@shop", "3384565132", "Rua da quadra", "Bacharelado", 2);
        Professores prof = new Professores("Leo", "Leoif@sudeste", "339456575", "realeza", "Ensino medio");

        Cadastro cad = new Cadastro();
        cad.cadastrarTaes(t1);
        cad.cadastrarTaes(t2);
        prof.setNotasDidaticas(15.3, 10.5, 18.7);
        cad.cadastrarProfessores(prof);
        
        cad.listarCandidatos();
        
        System.out.println("Media das notas: "+prof.mediaNotas(prof.getNotaDidatica1(), prof.getNotaDidatica2(), prof.getNotaDidatica3()));

    }
}
