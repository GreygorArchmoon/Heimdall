
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno
 */
public abstract class PessoaHeimdall implements Serializable{
    private String name; //nome, cpf, dia mês e ano de nascimento
    private int cpf; 
    private int day;
    private int month;
    private int year;

    public PessoaHeimdall(String name, int cpf, int day, int month, int year) {
        this.name = name;
        this.cpf = cpf;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public abstract String getInfo(); //método abstrato pra retornar informações da classe, implementado em filhos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
