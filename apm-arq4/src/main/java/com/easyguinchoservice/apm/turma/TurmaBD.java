package com.easyguinchoservice.apm.turma;
//package com.procergs.apm.turma;
//
//import java.util.List;
//
//import org.hibernate.criterion.DetachedCriteria;
//import org.hibernate.criterion.MatchMode;
//import org.hibernate.criterion.Restrictions;
//import org.hibernate.sql.JoinType;
//
//import com.procergs.apm.ed.HorarioED;
//import com.procergs.apm.ed.TurmaED;
//import com.procergs.apm.ed.TurmaPesqED;
//import com.procergs.apm.infra.AppBD;
//
//class TurmaBD extends AppBD<TurmaED, Long> {
//	
//	@Override
//	public TurmaED altera(TurmaED turma) {
//		List<HorarioED> horarios = turma.getHorarios();
//		if (horarios != null) {
//			// remove/altera horarios
//			for (HorarioED horario : horarios) {
//				if (horario.isDelete()) {
//					// Entity tem que estar managed pra fazer o remove
//					getEntityManager().remove(getEntityManager().merge(horario));
//				} else {
//					getEntityManager().merge(horario);
//				}
//			}
//		}
//		turma = getEntityManager().merge(turma);
//		getEntityManager().flush();
//		return turma;
//	}
//
////	public int conta(TurmaPesqED ped) {
////		DetachedCriteria query = montaCriterios(ped);
////        Criteria criteria = query.getExecutableCriteria(getSession());
////        criteria.setProjection(Projections.rowCount());
////        Long result = (Long) criteria.uniqueResult();
////        query.setProjection(null).setResultTransformer(Criteria.ROOT_ENTITY);
////        return result.intValue();
////	}
////	
////	public List<TurmaED> lista(TurmaPesqED ped) {
////		DetachedCriteria query = montaCriterios(ped);
////		Criteria c = query.getExecutableCriteria(getSession());
////		c.setFirstResult(ped.getPropLista().getInicio());
////		c.setMaxResults(ped.getPropLista().getTamanho());
////        return c.list();
////	}
//
//	@Override
//	public DetachedCriteria montaCriterios(TurmaED ed) {
//		DetachedCriteria dc = DetachedCriteria.forClass(TurmaED.class);
//
//		// Joins
//		dc.createAlias("instrutor", "instrutor", JoinType.INNER_JOIN);
//        dc.createAlias("curso", "curso", JoinType.INNER_JOIN);
//        
//        // Filtros
//		TurmaPesqED ped = (TurmaPesqED) ed;
//        if (ped.getTxtDescTur() != null) {
//            dc.add(Restrictions.ilike("txtDescTur", ped.getTxtDescTur(), MatchMode.ANYWHERE));
//        }
//        if (ped.getInstrutor() != null) {
//            dc.add(Restrictions.eq("instrutor", ped.getInstrutor()));
//        }
//        if (ped.getCurso() != null) {
//            dc.add(Restrictions.eq("curso", ped.getCurso()));
//        }
//        if (ped.getQtdVagas() != null) {
//        	dc.add(Restrictions.ge("qtdVagas", ped.getQtdVagas()));
//        }
//        if (ped.getQtdVagasFinal() != null) {
//        	dc.add(Restrictions.le("qtdVagas", ped.getQtdVagasFinal()));
//        }
//        
//		return dc;
//	}
//
//}
