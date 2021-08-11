public class NegativeException extends RuntimeException {
  public NegativeException() {
    super();
  }

  @Override
  public String getMessage() {
    return "Erro: valor negativo";
  }
}
