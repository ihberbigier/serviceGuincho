package com.easyguinchoservice.apm.turma;
//package com.procergs.apm.turma;
//
//import static javax.ejb.TransactionAttributeType.SUPPORTS;
//
//import java.util.List;
//
//import javax.ejb.Stateless;
//import javax.ejb.TransactionAttribute;
//import javax.inject.Inject;
//
//import com.procergs.apm.ed.HorarioED;
//import com.procergs.apm.ed.TurmaED;
//import com.procergs.apm.infra.AppInterceptor;
//import com.procergs.apm.infra.AppRN;
//import com.procergs.arqjava4.exception.RNException;
//import com.procergs.arqjava4.security.Permissao;
//
//
//@Stateless
////@Permissao(objeto="TURMA")
//public class TurmaRN extends AppRN<TurmaED, Long> {
//	
//	@Inject
//	HorarioBD horarioBD;
//
//	@Inject
//	public void setBD(TurmaBD bd) {
//		super.setBD(bd);
//	}
//	
//	@Override
//	public TurmaED altera(TurmaED ed) {
//		validaTurma(ed);
//		return super.altera(ed);
//	}
//	
//	@Override
//	@Permissao(desabilitada=true)
//	public int conta(TurmaED ped) {
//		return super.conta(ped);
//	}
//	
//	@Override
//	@Permissao(desabilitada=true)
//	public List<TurmaED> lista(TurmaED ped) {
//		return super.lista(ped);
//	}
//	
//	// Horarios 
//	
//	@Permissao("TURMA-INCLUIRHORARIO")
//	public HorarioED incluiHorario(HorarioED ed) {
//		return horarioBD.inclui(ed);
//	}
//	
//	@Permissao("TURMA-EXCLUIRHORARIO")
//	public void removeHorario(List<HorarioED> eds) {
//		for (HorarioED horarioED : eds) {
//			horarioBD.exclui(horarioED);
//		}
//	}
//
//	@TransactionAttribute(SUPPORTS)
//	public int contaHorario(HorarioED ped) {
//		return horarioBD.conta(ped);
//	}
//	
//	@TransactionAttribute(SUPPORTS)
//	public List<HorarioED> listaHorario(HorarioED ped) {
//		return horarioBD.lista(ped);
//	}
//	
//	// Validações específicas sem Beans-Validations
//	
//	private void validaTurma(TurmaED turma) {
//		if (turma.getQtdVagas() == 21) {
//			throw new RuntimeException("Exception forçada...");
//		}
//		if (turma.getQtdVagas() == 20) {
//			throw new RNException("qtdVagas", "Não pode ser 20!");
//		}
//	}
//
//}
