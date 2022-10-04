import java.util.Date;

import javax.xml.crypto.Data;

public class TestaViagens {
    
    public static void main(String[] args) throws Exception {
        Date date=new Date();

        Viagem[] viagens = new Viagem[3];
        viagens[0] = new ViagensAereas("guilherme"," Ribeirao Preto", "Sao Paulo","Trabalho", date, 60f);
        //Teriamos tbm ViagensMaritimas, ViagensTerrestres

        for(int i=0; i<viagens.length; i++){
            viagens[i].retornaDados();
        }
    }
}
