package lista06.exercicio01;

public enum NivelAcesso {
    ADMIN("Administrador pode acessar todos recursos"),
    MODERADOR("Pode acessar alguns recursos de administradores"),
    USUARIO("Vende sua alma");

    public final String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }
}
