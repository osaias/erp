package br.com.caelum.erp.teste;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Collection;

import br.com.caelum.erp.Gasto;
import br.com.caelum.erp.ImportadorDeGastos;

public class TesteImportador {

	public static void main(String[] args) throws UnsupportedEncodingException,
			ParseException {
		String conteudo = 
				"CARTAO01012011000010000123Jose da Silva                 22071983\r\n" +
				"CARTAO01012011000010000123Jose da Silva                 22071983\r\n" +
				"CARTAO01012011000010000123Jose da Silva                 22071983\r\n";

		ImportadorDeGastos importador = new ImportadorDeGastos();

		Collection<Gasto> list = importador.importa(new ByteArrayInputStream(
				conteudo.getBytes("UTF-8")));

		for (Gasto gasto : list) {
            System.out.println(gasto);
        }
	}
}
