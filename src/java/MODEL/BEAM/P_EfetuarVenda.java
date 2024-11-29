
package MODEL.BEAM;

public class P_EfetuarVenda extends Papel {

   private static final String descricao = "Efetuar vendas";

   public P_EfetuarVenda() {
   }

   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }
   
}
