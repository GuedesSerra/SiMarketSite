
package MODEL.BEAM;


public class P_GerenciarUsuario extends Papel {
   
   private static final String descricao = "Gerenciar usuários";

   public P_GerenciarUsuario() {
   }

   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }
   
   public static String getDescricao(){
      return descricao;
   }

}
