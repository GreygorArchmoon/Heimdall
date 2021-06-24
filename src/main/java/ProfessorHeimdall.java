/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno
 */
public class ProfessorHeimdall extends PessoaHeimdall {
    
    private String disciplinas; 
    private float salario;

    public ProfessorHeimdall(String disciplinas, float salario, String name, int cpf, int day, int month, int year) {
        super(name, cpf, day, month, year);
        this.disciplinas = disciplinas;
        this.salario = salario;
    }
    
    public String getInfo( ){ //retorna informações
    return ("-Nome: "+getName()+"\n-Cpf: "+ getCpf()+"\n-Data de Nascimento: "+getDay()+"/"+getMonth()+"/"+getYear()+"\n-Salario: "+getSalario()+"\n-Disciplinas:\n "+getDisciplinas());
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
