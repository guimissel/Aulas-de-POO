package exercicio3;

import exercicio3.excecoes.CredenciaisErradasException;
import exercicio3.excecoes.SenhaInvalidaException;
import exercicio3.excecoes.UsuarioInvalidoException;

public class Login {
  private String usuario;
  private String senha;

  public Login(String usuario, String senha) {
    if (usuario.trim().isEmpty()) throw new UsuarioInvalidoException("Erro! Nome do usuário vazio!");
    if (senha.trim().isEmpty()) throw new SenhaInvalidaException("Erro! Senha vazia!");

    this.usuario = usuario;
    this.senha = senha;
  }

  public void setSenha(String senha) {
    if (senha.trim().isEmpty()) throw new SenhaInvalidaException("Erro! Senha vazia!");

    this.senha = senha;
  }

  public boolean fazerLogin(String usuario, String senha) {
    try {
      if (usuario.equals(this.usuario) && senha.equals(this.senha)) return true;

      throw new CredenciaisErradasException("Erro! Usuário ou senha incorretos");
    } catch (CredenciaisErradasException e) {
      System.out.println(e.getMessage());
      return false;
    }
  }
}
