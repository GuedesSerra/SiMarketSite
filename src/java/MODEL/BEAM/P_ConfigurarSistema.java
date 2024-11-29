
package MODEL.BEAM;


public class P_ConfigurarSistema extends Papel {

   private static final String descricao = "Configurar sistema";

   public P_ConfigurarSistema() {
   }

   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }

}
