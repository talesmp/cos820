package org.agilekip.tutorials.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A SelecaoPesc.
 */
@Entity
@Table(name = "selecao_pesc")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SelecaoPesc implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    @Column(name = "email_principal")
    private String emailPrincipal;

    @Column(name = "estrangeiro_sim_nao")
    private String estrangeiroSimNao;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "documento_cpf_passaporte")
    private String documentoCpfPassaporte;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cidade_nascimento")
    private String cidadeNascimento;

    @Column(name = "formacao_instituicao_nome")
    private String formacaoInstituicaoNome;

    @Column(name = "formacao_curso_superior")
    private String formacaoCursoSuperior;

    @Column(name = "empresa_nome")
    private String empresaNome;

    @Column(name = "empresa_url_site")
    private String empresaUrlSite;

    @Column(name = "docencia_instituicao_nome")
    private String docenciaInstituicaoNome;

    @Column(name = "docencia_instituicao_pais")
    private String docenciaInstituicaoPais;

    @Column(name = "proficiencia_ingles_tipo_teste")
    private String proficienciaInglesTipoTeste;

    @Column(name = "proficiencia_ingles_nota")
    private String proficienciaInglesNota;

    @Column(name = "mestrado_doutorado")
    private String mestradoDoutorado;

    @Column(name = "linha_area_interesse")
    private String linhaAreaInteresse;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SelecaoPesc id(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public SelecaoPesc nomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        return this;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmailPrincipal() {
        return this.emailPrincipal;
    }

    public SelecaoPesc emailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
        return this;
    }

    public void setEmailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
    }

    public String getEstrangeiroSimNao() {
        return this.estrangeiroSimNao;
    }

    public SelecaoPesc estrangeiroSimNao(String estrangeiroSimNao) {
        this.estrangeiroSimNao = estrangeiroSimNao;
        return this;
    }

    public void setEstrangeiroSimNao(String estrangeiroSimNao) {
        this.estrangeiroSimNao = estrangeiroSimNao;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public SelecaoPesc nacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getDocumentoCpfPassaporte() {
        return this.documentoCpfPassaporte;
    }

    public SelecaoPesc documentoCpfPassaporte(String documentoCpfPassaporte) {
        this.documentoCpfPassaporte = documentoCpfPassaporte;
        return this;
    }

    public void setDocumentoCpfPassaporte(String documentoCpfPassaporte) {
        this.documentoCpfPassaporte = documentoCpfPassaporte;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public SelecaoPesc dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidadeNascimento() {
        return this.cidadeNascimento;
    }

    public SelecaoPesc cidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
        return this;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getFormacaoInstituicaoNome() {
        return this.formacaoInstituicaoNome;
    }

    public SelecaoPesc formacaoInstituicaoNome(String formacaoInstituicaoNome) {
        this.formacaoInstituicaoNome = formacaoInstituicaoNome;
        return this;
    }

    public void setFormacaoInstituicaoNome(String formacaoInstituicaoNome) {
        this.formacaoInstituicaoNome = formacaoInstituicaoNome;
    }

    public String getFormacaoCursoSuperior() {
        return this.formacaoCursoSuperior;
    }

    public SelecaoPesc formacaoCursoSuperior(String formacaoCursoSuperior) {
        this.formacaoCursoSuperior = formacaoCursoSuperior;
        return this;
    }

    public void setFormacaoCursoSuperior(String formacaoCursoSuperior) {
        this.formacaoCursoSuperior = formacaoCursoSuperior;
    }

    public String getEmpresaNome() {
        return this.empresaNome;
    }

    public SelecaoPesc empresaNome(String empresaNome) {
        this.empresaNome = empresaNome;
        return this;
    }

    public void setEmpresaNome(String empresaNome) {
        this.empresaNome = empresaNome;
    }

    public String getEmpresaUrlSite() {
        return this.empresaUrlSite;
    }

    public SelecaoPesc empresaUrlSite(String empresaUrlSite) {
        this.empresaUrlSite = empresaUrlSite;
        return this;
    }

    public void setEmpresaUrlSite(String empresaUrlSite) {
        this.empresaUrlSite = empresaUrlSite;
    }

    public String getDocenciaInstituicaoNome() {
        return this.docenciaInstituicaoNome;
    }

    public SelecaoPesc docenciaInstituicaoNome(String docenciaInstituicaoNome) {
        this.docenciaInstituicaoNome = docenciaInstituicaoNome;
        return this;
    }

    public void setDocenciaInstituicaoNome(String docenciaInstituicaoNome) {
        this.docenciaInstituicaoNome = docenciaInstituicaoNome;
    }

    public String getDocenciaInstituicaoPais() {
        return this.docenciaInstituicaoPais;
    }

    public SelecaoPesc docenciaInstituicaoPais(String docenciaInstituicaoPais) {
        this.docenciaInstituicaoPais = docenciaInstituicaoPais;
        return this;
    }

    public void setDocenciaInstituicaoPais(String docenciaInstituicaoPais) {
        this.docenciaInstituicaoPais = docenciaInstituicaoPais;
    }

    public String getProficienciaInglesTipoTeste() {
        return this.proficienciaInglesTipoTeste;
    }

    public SelecaoPesc proficienciaInglesTipoTeste(String proficienciaInglesTipoTeste) {
        this.proficienciaInglesTipoTeste = proficienciaInglesTipoTeste;
        return this;
    }

    public void setProficienciaInglesTipoTeste(String proficienciaInglesTipoTeste) {
        this.proficienciaInglesTipoTeste = proficienciaInglesTipoTeste;
    }

    public String getProficienciaInglesNota() {
        return this.proficienciaInglesNota;
    }

    public SelecaoPesc proficienciaInglesNota(String proficienciaInglesNota) {
        this.proficienciaInglesNota = proficienciaInglesNota;
        return this;
    }

    public void setProficienciaInglesNota(String proficienciaInglesNota) {
        this.proficienciaInglesNota = proficienciaInglesNota;
    }

    public String getMestradoDoutorado() {
        return this.mestradoDoutorado;
    }

    public SelecaoPesc mestradoDoutorado(String mestradoDoutorado) {
        this.mestradoDoutorado = mestradoDoutorado;
        return this;
    }

    public void setMestradoDoutorado(String mestradoDoutorado) {
        this.mestradoDoutorado = mestradoDoutorado;
    }

    public String getLinhaAreaInteresse() {
        return this.linhaAreaInteresse;
    }

    public SelecaoPesc linhaAreaInteresse(String linhaAreaInteresse) {
        this.linhaAreaInteresse = linhaAreaInteresse;
        return this;
    }

    public void setLinhaAreaInteresse(String linhaAreaInteresse) {
        this.linhaAreaInteresse = linhaAreaInteresse;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SelecaoPesc)) {
            return false;
        }
        return id != null && id.equals(((SelecaoPesc) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SelecaoPesc{" +
            "id=" + getId() +
            ", nomeCompleto='" + getNomeCompleto() + "'" +
            ", emailPrincipal='" + getEmailPrincipal() + "'" +
            ", estrangeiroSimNao='" + getEstrangeiroSimNao() + "'" +
            ", nacionalidade='" + getNacionalidade() + "'" +
            ", documentoCpfPassaporte='" + getDocumentoCpfPassaporte() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", cidadeNascimento='" + getCidadeNascimento() + "'" +
            ", formacaoInstituicaoNome='" + getFormacaoInstituicaoNome() + "'" +
            ", formacaoCursoSuperior='" + getFormacaoCursoSuperior() + "'" +
            ", empresaNome='" + getEmpresaNome() + "'" +
            ", empresaUrlSite='" + getEmpresaUrlSite() + "'" +
            ", docenciaInstituicaoNome='" + getDocenciaInstituicaoNome() + "'" +
            ", docenciaInstituicaoPais='" + getDocenciaInstituicaoPais() + "'" +
            ", proficienciaInglesTipoTeste='" + getProficienciaInglesTipoTeste() + "'" +
            ", proficienciaInglesNota='" + getProficienciaInglesNota() + "'" +
            ", mestradoDoutorado='" + getMestradoDoutorado() + "'" +
            ", linhaAreaInteresse='" + getLinhaAreaInteresse() + "'" +
            "}";
    }
}
