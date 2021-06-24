/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno
 */
public class AlunoHeimdall extends PessoaHeimdall{
    private int id;
    private String turma;

    public AlunoHeimdall(int id, String turma, String name, int cpf, int day, int month, int year) {
        super(name, cpf, day, month, year);
        this.id = id;
        this.turma = turma;
    }
    public String getInfo( ){ //retorna informações
    return ("-Nome: "+getName()+"\n-Cpf: "+ getCpf()+"\n-Data de Nascimento: "+getDay()+"/"+getMonth()+"/"+getYear()+"\n-ID: "+getId()+"\n-Turma: "+getTurma());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
