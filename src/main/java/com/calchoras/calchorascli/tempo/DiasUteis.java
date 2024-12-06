package com.calchoras.calchorascli.tempo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class DiasUteis {
    int diasUteis;
    
    public DiasUteis(int mes){
        Scanner teclado = new Scanner(System.in);
        Ano ano = new Ano();
        int anoAtual = ano.getAno();
        int diasNoMes;
        int feriados;
        diasUteis = 0;
       
        YearMonth mesAtual = YearMonth.of(anoAtual, mes);
        diasNoMes = mesAtual.lengthOfMonth();
        
        System.out.println("Digite quantos feriados há no mês: ");
        feriados = teclado.nextInt();
        
        for (int dia = 1; dia <= diasNoMes; dia++) {
            LocalDate data = mesAtual.atDay(dia);

            // Verifica se é dia útil (segunda a sexta)
            if (!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) &&
                !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                diasUteis++;
            }
        }
        diasUteis = diasUteis - feriados;
    }
    
    public int getDiasUteis(){
        return diasUteis;
    }
}