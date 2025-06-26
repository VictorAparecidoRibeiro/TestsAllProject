package br.ce.victor.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.victor.servicos.CalculadoraTest;
import br.ce.victor.servicos.CalculoValorLocacaoTest;
import br.ce.victor.servicos.LocacaoServiceTest;

//@RunWith(Suite.class)
@SuiteClasses({
//	CalculadoraTest.class,
	CalculoValorLocacaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {
	//Remova se puder!
}
