package br.com.caelum.erp;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Test;

public class ImportadorDeGastosTest {

	@Test
	public void deveRetornarUmaListaVazia() {

		ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
		ImportadorDeGastos importador = new ImportadorDeGastos();

		try {
			Collection<Gasto> importa = importador.importa(input);
			assertTrue("Lista vazia", importa.isEmpty());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		

	@Test
	public void deveRetornarUmaListaComElementos() {

		String conteudo = "Cartao10052018545454545454Ambrosio                      12122018\r\n";
		ByteArrayInputStream input = new ByteArrayInputStream(conteudo.getBytes());
		ImportadorDeGastos importador = new ImportadorDeGastos();

		try {
			Collection<Gasto> importa = importador.importa(input);
			assertEquals("Lista com 1 elemento", 1, importa.size());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
