/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jhona
 */
public class llamadas2 {

    /**
     * @param args the command line arguments
     */
    
    public static String preciodia(String info){
        char[] inforespaldo= info.toCharArray();
         String dia = info.substring(0, 2);
         dia = dia.toLowerCase();
        if(dia.equals("lu") || dia.equals("ma") || dia.equals("mi") ||
                dia.equals("vi") || dia.equals("ju")){
            inforespaldo[0]='0';
            return new String (inforespaldo);
    }
            inforespaldo[0]='1';
            return new String (inforespaldo);
    }
    public static String preciohora(String info){
        char[] inforespaldo= info.toCharArray();
        String horainicio = info.substring(2, 7);
        int horas;
        horas=(int)((horainicio.charAt(0) - '0') * 10) + (horainicio.charAt(1) - '0');
        if (horas<8||horas>17){
            inforespaldo[2]='0';
            return new String (inforespaldo);
        }else{
            inforespaldo[2]='1';
            return new String (inforespaldo);
        }
    }
        public static double preciofinal(String info){
            char[] inforespaldo= info.toCharArray();
             String minuto = info.substring(7);
            int minutos = Integer.parseInt(minuto);
           
            if(inforespaldo[0]=='1'){
                return .15*minutos;
            }
            if(inforespaldo[2]=='0'){
                return (.625*.4*minutos);
            }
            return (.4*minutos);
        }
    
    
        
        public static double llamadascompuestas(String info ){
            Funcionllamada dia = new Funcionllamada() {
            @Override
            public String opera(String x) {
            return llamadas2.preciodia(x);
            }

                @Override
                public double opera2(String x) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
        };
            Funcionllamada hora = new Funcionllamada() {
            @Override
            public String opera(String x) {
            return llamadas2.preciohora(x);
            }

                @Override
                public double opera2(String x) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
        };
             Funcionllamada minutos = new Funcionllamada() {
            @Override
            public double opera2(String x) {
            return llamadas2.preciofinal(x);
            }

                @Override
                public String opera(String x) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
        };
             return componer(minutos,hora,dia).opera2(info);
        }

            public static Funcionllamada componer(Funcionllamada funcionUno, Funcionllamada funcionDos, Funcionllamada funcionTres) {
        return new Funcionllamada() {
            public double opera2(String x) {
                return funcionUno.opera2(funcionDos.opera(funcionTres.opera(x)));
                //return funcionUno.opera(x) && funcnDos.opera(x) && funcionTres.opera(x);io
            }

            @Override
            public String opera(String x) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    

    
    public static void main(String[] args) {
        String dia="ma";
        String hora="10:00";
        String minutos ="1";

        String info =dia+hora+minutos;    
        
        String dia2 = info.substring(0, 2);
        String hora2 = info.substring(2, 7);
        String minutos2 = info.substring(7);
        System.out.println(dia2 +"\n");
        System.out.println(hora2 +"\n");
        System.out.println(minutos2 +"\n");
        double pagar=llamadascompuestas(info);
        System.out.println(pagar);     
    }
    
}
