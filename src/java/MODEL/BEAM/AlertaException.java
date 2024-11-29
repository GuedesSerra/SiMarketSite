
package MODEL.BEAM;

//Classe criada para personalizar erros e alertas das regras de negócio
public class AlertaException extends RuntimeException {

   private String url1;
   private String texto1;

   public AlertaException(String url1, String texto1, String mensagem) {
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
