package br.com.caelum.erp.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.erp.Gasto;
import br.com.caelum.model.rh.Funcionario;

public class TestaGasto {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
        GregorianCalendar nascimento = new GregorianCalendar(1989, 3, 14);
        Funcionario funcionario = new Funcionario("Vinícius", 9, nascimento);

        Gasto gasto = new Gasto(40.0, "taxi", funcionario, hoje);
        Gasto gasto1 = new Gasto(40.0, "taxi", funcionario, hoje);
        Gasto gasto2 = new Gasto(40.0, "taxi", funcionario, hoje);

        System.out.println(gasto); 
        System.out.println(gasto1); 
        System.out.println(gasto2); 
        
	}
	
}
