package com.calchoras.calchorascli;

import com.calchoras.calchorascli.tempo.*;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class CalchorasCLI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DiasUteis diasUteis;
        
        int dias;
        int cargaHoraria;
        
        System.out.println("Calchoras - Cálculo de Horas Extras\n\n");

        System.out.println("""
                           1-Janeiro  2-Fevereiro  3-Mar\u00e7o  4-Abril  5-Maio  6-Junho
                           7-Julho  8-Agosto  9-Setembro  10-Outubro  11-Novembro  12-Dezembro """);
        System.out.println("Digite o mês atual: ");

        diasUteis = new DiasUteis(teclado.nextInt());
        dias = diasUteis.getDiasUteis();
        
        System.out.println("Digite a carga horária diária do funcionário:  ");
        cargaHoraria = dias * teclado.nextInt();
        
        System.out.println(dias);
        System.out.println(cargaHoraria);
        
    }
}
