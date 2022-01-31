public class Usuario {

    private String nomeCompleto;
    private String login;
    private String senha;
    private String email;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String nomeCompleto, String login, String senha, String email) {
        this.nomeCompleto = nomeCompleto;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    protected void login() {

    }

    protected void logout() {

    }

}
