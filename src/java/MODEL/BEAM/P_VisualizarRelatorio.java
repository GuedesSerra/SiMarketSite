
package MODEL.BEAM;

public class P_VisualizarRelatorio extends Papel {

   private static final String descricao = "Visualizar relatórios";
   
   public P_VisualizarRelatorio() {
   }
   
   public String getPapel() {
      return descricao + ", " + this.getCamada().getPapel();
   }
   
}
