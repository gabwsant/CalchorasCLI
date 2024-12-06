package com.calchoras.calchorascli.tempo;

import java.util.Calendar;

public class Ano {
    Calendar calendario = Calendar.getInstance();
    int ano;

//Construtor
    public Ano(){
        //define ano atual do sistema
        ano = calendario.get(Calendar.YEAR);
    }
    
//Métodos
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public boolean bissexto() {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }   
}

