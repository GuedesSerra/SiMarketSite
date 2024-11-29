
package MODEL.BEAM;

public class P_GerenciarProduto extends Papel {

   private static final String descricao = "Gerenciar produtos";
   
   public P_GerenciarProduto() {
   }

   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }
   
}
