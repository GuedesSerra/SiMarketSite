
package MODEL.BEAM;


//Classe criada para personalizar confirmações de processos para o usuário
public class SucessoException extends RuntimeException {

    private String url1;
    private String texto1;
   
   public SucessoException(String url1, String texto1, String mensagem) {
      super(mensagem);
      this.url1 = url1;
      this.texto1 = texto1;
   }

   public String getUrl1() {
      return url1;
   }

   public String getTexto1() {
      return texto1;
   }

}
