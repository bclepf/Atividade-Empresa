/**
 * Feito por: Bernardo, Gabriel Braga, Gustavo Bueno e Jhonatan Oliveira
 * 
 */
import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
   
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
}