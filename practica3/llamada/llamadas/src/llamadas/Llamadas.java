/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

/**
 *
 * @author jhona
 */
public class Llamadas {

    /**
     * @param args the command line arguments
     */
    
    public static double preciodia(String dia){
         dia = dia.toLowerCase();
        if(dia.equals("lu") || dia.equals("ma") || dia.equals("mi") ||
                dia.equals("vi") || dia.equals("ju")){
            return .4;
    }
        return .15;
    }
    public static double preciohora(String horainicio){
        int horas;
        horas=(int)((horainicio.charAt(0) - '0') * 10) + (horainicio.charAt(1) - '0');
        if (horas<8||horas>17){
            return .625;
        }else{
            return 1;
        }
    }
    public static double preciofinal(double preciodia,double preciohora,int minutos){
        if(preciodia==.15){
            return preciodia*minutos;
        }
        return (preciohora*preciodia*minutos);
        }
    public static double precio(String dia,String hora,int minutos){
        
        double pdia=preciodia(dia);
        double phora=preciohora(hora);
        double pfinal =preciofinal(pdia,phora,minutos);      
        return pfinal;
    };
    
    public static void main(String[] args) {
        String dia="do";
        String hora="12:30";
        int minutos =10;
        double pagar=precio(dia,hora,minutos);
        System.out.println(pagar);
              
    }
    
}
