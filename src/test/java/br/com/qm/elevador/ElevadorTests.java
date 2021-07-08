package br.com.qm.elevador;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;


@RunWith(BlockJUnit4ClassRunner.class)
public class ElevadorTests {

	   @Test
	    public void deveSubirUmAndarComSucesso() {
		   
		   Elevador elevador = new Elevador(5, 5);
		   
		   elevador.sobe();
		   
		   Assert.assertEquals(1, elevador.getAndarAtual());
	    }

	    @Test
	    public void naoDeveSubirQuandoEstiverNoUltimoAndar() {

	    	Elevador elevador = new Elevador(2, 2);
	    	
	    	elevador.sobe();
	    	elevador.sobe(); // FAZ COM QUE O ELEVADOR ESTEJA NO ÚLTIMO ANDAR
	    	
	    	elevador.sobe(); // Não deve conseguir subir uma vez que já está no último andar.
	    	
	    	Assert.assertEquals(2, elevador.getAndarAtual());
	    }

	    @Test
	    public void deveDescerUmAndar() {
	    	Elevador elevador = new Elevador(4, 5);
	    	
	    	elevador.sobe();
	    	elevador.desce();

	    	Assert.assertEquals(0, elevador.getAndarAtual());
	    }

	    @Test
	    public void naoDeveDescerQuandoEstiverNoPrimeiroAndar() {
	    
	    	Elevador elevador = new Elevador(4, 4);
	    	
	    	elevador.desce();
	    
	    	Assert.assertEquals(0, elevador.getAndarAtual());
	    }

	    @Test
	    public void deveEntrarComSucesso() {
	    }

	    @Test
	    public void naoDeveEntrarComACapacidadeMaxima() {
	    }

	    @Test
	    public void deveSairComSucesso() {
	    
	    }

	    @Test
	    public void naoDeveSairCasoNaoHajaNinguem() {
	    
	    }
	
}
