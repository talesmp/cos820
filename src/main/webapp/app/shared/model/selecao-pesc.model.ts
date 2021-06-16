export interface ISelecaoPesc {
  id?: number;
  nomeCompleto?: string | null;
  emailPrincipal?: string | null;
  estrangeiroSimNao?: string | null;
  nacionalidade?: string | null;
  documentoCpfPassaporte?: string | null;
  dataNascimento?: Date | null;
  cidadeNascimento?: string | null;
  formacaoInstituicaoNome?: string | null;
  formacaoCursoSuperior?: string | null;
  empresaNome?: string | null;
  empresaUrlSite?: string | null;
  docenciaInstituicaoNome?: string | null;
  docenciaInstituicaoPais?: string | null;
  proficienciaInglesTipoTeste?: string | null;
  proficienciaInglesNota?: string | null;
  mestradoDoutorado?: string | null;
  linhaAreaInteresse?: string | null;
}

export class SelecaoPesc implements ISelecaoPesc {
  constructor(
    public id?: number,
    public nomeCompleto?: string | null,
    public emailPrincipal?: string | null,
    public estrangeiroSimNao?: string | null,
    public nacionalidade?: string | null,
    public documentoCpfPassaporte?: string | null,
    public dataNascimento?: Date | null,
    public cidadeNascimento?: string | null,
    public formacaoInstituicaoNome?: string | null,
    public formacaoCursoSuperior?: string | null,
    public empresaNome?: string | null,
    public empresaUrlSite?: string | null,
    public docenciaInstituicaoNome?: string | null,
    public docenciaInstituicaoPais?: string | null,
    public proficienciaInglesTipoTeste?: string | null,
    public proficienciaInglesNota?: string | null,
    public mestradoDoutorado?: string | null,
    public linhaAreaInteresse?: string | null
  ) {}
}
