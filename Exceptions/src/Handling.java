public class Handling {
  public static void main(String[] args) {
    // Optional handling
    try {
      throwError1();
    } catch (Exception err) {
      System.out.println(err.getMessage());
    }

    // Required handling
    try {
      throwError2();
    } catch (Exception err) {
      System.out.println(err.getMessage());
    }

    System.out.println("The end...");
  }

  // Not checked or not verified
  public static void throwError1() {
    throw new RuntimeException("Ocorreu um erro: #1");
  }

  // Checked or verified
  public static void throwError2() throws Exception {
    throw new Exception("Ocorreu um erro: #2");
  }
}
