package com.easyguinchoservice.apm.ed;
//package com.procergs.apm.ed;
//
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//
//
//public class TurmaED  {
//
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@Column(name = "NRO_INT_TUR")
//	@SequenceGenerator(name = "Turma_SEQ", sequenceName = "ID_TURMA_SEQ", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Turma_SEQ") 
//	private Long nroIntTur;
//
//	@Column(name = "TXT_DESC_TUR", length = 4000)
//	private String txtDescTur;
//
//	@Column(name = "DT_CANCELAMENTO")
//	@Temporal(TemporalType.DATE)
//	private Calendar dtCancelamento;
//
//	@Column(name = "DT_ABERTURA")
//	@Temporal(TemporalType.DATE)
//	private Calendar dtAbertura;
//
//	@Column(name = "QTD_VAGAS")
//	@NotNull 
//	@Min(value=5) @Max(value=30)
//	private Integer qtdVagas;
//	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "NRO_INT_INST")
//	@NotNull
//	private InstrutorED instrutor;
//
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "NRO_INT_CUR")
//	@NotNull
//	private CursoED curso;
//	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "turma")
//	private List<HorarioED> horarios;
//
//	public Long getNroIntTur() {
//		return this.nroIntTur;
//	}
//
//	public void setNroIntTur(Long nroIntTur) {
//		this.nroIntTur = nroIntTur;
//	}
//
//	public String getTxtDescTur() {
//		return this.txtDescTur;
//	}
//
//	public void setTxtDescTur(String txtDescTur) {
//		this.txtDescTur = txtDescTur;
//	}
//
//	public Calendar getDtCancelamento() {
//		return this.dtCancelamento;
//	}
//
//	public void setDtCancelamento(Calendar dtCancelamento) {
//		this.dtCancelamento = dtCancelamento;
//	}
//
//	public void setDtAbertura(Calendar dtAbertura) {
//		this.dtAbertura = dtAbertura;
//	}
//
//	public Date getDtAberturaDate() {
//		if (dtAbertura == null) {
//			return null;
//		}
//		return this.dtAbertura.getTime();
//	}
//
//	public void setDtAberturaDate(Date dtAbertura) {
//		this.dtAbertura = Calendar.getInstance();
//		this.dtAbertura.setTime(dtAbertura);
//	}
//	
//	public Integer getQtdVagas() {
//		return this.qtdVagas;
//	}
//
//	public void setQtdVagas(Integer qtdVagas) {
//		this.qtdVagas = qtdVagas;
//	}
//
//	public InstrutorED getInstrutor() {
//		return instrutor;
//	}
//
//	public void setInstrutor(InstrutorED instrutor) {
//		this.instrutor = instrutor;
//	}
//
//	public CursoED getCurso() {
//		return curso;
//	}
//
//	public void setCurso(CursoED curso) {
//		this.curso = curso;
//	}
//
//	@Override
//	public Long getId() {
//		return this.nroIntTur;
//	}
//	
//	public List<HorarioED> getHorarios() {
//		return horarios;
//	}
//
//	public void setHorarios(List<HorarioED> horarios) {
//		this.horarios = horarios;
//	}
//
//}
