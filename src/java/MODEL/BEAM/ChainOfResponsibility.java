
package MODEL.BEAM;

import java.math.BigDecimal;


public abstract class ChainOfResponsibility {

   //Sucessores e antecessores, padrão Cadeia de responsabilidade
   //Esta implementação permite seguir duas direções na cadeia
   private ChainOfResponsibility sucessor, antecessor;

   public ChainOfResponsibility getSucessor() {
      return sucessor;
   }

   public void setSucessor(ChainOfResponsibility sucessor) {
      this.sucessor = sucessor;
   }

   public ChainOfResponsibility getAntecessor() {
      return antecessor;
   }

   public void setAntecessor(ChainOfResponsibility antecessor) {
      this.antecessor = antecessor;
   }

   abstract public int[] dicaTroco(BigDecimal valor);

}
