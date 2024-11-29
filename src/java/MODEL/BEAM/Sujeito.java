
package MODEL.BEAM;

public interface Sujeito {

   public void registrarObservador(Observador o);

   public void removerObservador(Observador o);

   public void notificarObservadores();

}
