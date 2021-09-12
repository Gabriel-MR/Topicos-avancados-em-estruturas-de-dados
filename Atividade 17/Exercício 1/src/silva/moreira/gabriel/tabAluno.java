package silva.moreira.gabriel;

class tabAluno {
    private final Integer codAluno;
    private final String nome;

    public tabAluno(Integer codAluno, String nome) {
        this.codAluno = codAluno;
        this.nome = nome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public String getNome() {
        return nome;
    }

}

