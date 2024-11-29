
package MODEL.BEAM;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RelatorioUsuarios extends Relatorio {

   public RelatorioUsuarios(String nome, ArrayList<Usuario> lista) {
      this.setNome(nome);
      this.setDatahora(LocalDateTime.now());
      String conteudo = "Relatório: " + this.getNome() + "\n"
              + "Data de Emissão: " + this.getDatahoraFormatada() + "\n\n";

      if(lista.isEmpty())
         conteudo += "Nenhum dado para exibir.";
      else
      {
         conteudo += "ID     USUARIO                 NOME\n       PERMISSÕES\n\n";

         for(Usuario u : lista)
         {
            conteudo += ("0000" + u.getId()).substring(("" + u.getId()).length(), ("" + u.getId()).length() + 4) + "   "
                    + (u.getUsuario().toUpperCase() + "                    ").substring(0, 20) + "    "
                    + (u.getNome().toUpperCase() + "                                                           ").substring(0, 59) + "\n"
                    + "       " + (u.getPapel().toUpperCase() + "                                                                                   ").substring(0, 83) + "\n";
            if(u.getPapel().length() > 83)
               conteudo += "       " + (u.getPapel().toUpperCase() + "                                                                                   ").substring(83, 166) + "\n";
         }
      }
      this.setConteudo(conteudo);
   }

}
