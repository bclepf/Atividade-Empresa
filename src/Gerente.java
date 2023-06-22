/**
 * Feito por: Bernardo, Gabriel Braga, Gustavo Bueno e Jhonatan Oliveira
 * 
 */
import java.util.List;

class Gerente extends Funcionario {
    private String departamento;
    private Empresa empresa;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}






