
package MODEL.BEAM;


public class P_ConcederDesconto extends Papel {

   private static final String descricao = "Conceder descontos";

   public P_ConcederDesconto() {
   }

   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }

}
