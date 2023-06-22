/**
 * Feito por: Bernardo, Gabriel Braga, Gustavo Bueno e Jhonatan Oliveira
 * 
 */
class Funcionario extends Pessoa implements Salario{
    private double salario;

    public Funcionario( String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario(){
        return salario;
    }
    
}




