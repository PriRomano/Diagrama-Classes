import DiagramaClasses.aluno;

public class app {
    public static void main(String[] args) {
        
        aluno a = new aluno();
        Endereco e = new endereco ();
        contato c = new contato ();
        Collection<contato> contato = new contato();

        a.setEndereco(e);
        a.setContato(contato);

    }

}
