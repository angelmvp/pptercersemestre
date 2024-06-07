/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llamadas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhona
 */
public class Llamadas {

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
            return Llamadas.preciodia(x);
            }

                @Override
                public double opera2(String x) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
        };
            Funcionllamada hora = new Funcionllamada() {
            @Override
            public String opera(String x) {
            return Llamadas.preciohora(x);
            }

                @Override
                public double opera2(String x) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
        };
             Funcionllamada minutos = new Funcionllamada() {
            @Override
            public double opera2(String x) {
            return Llamadas.preciofinal(x);
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
            }

            @Override
            public String opera(String x) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
            
    
            
        public static double llamadaspolimorfas(String info ){

        FuncionllamadaPolimorfa<String, String> polimorfodia = new FuncionllamadaPolimorfa<String, String>() {
            @Override
            public String opera(String x) {
                return Llamadas.preciodia(x);
            }
        };
        FuncionllamadaPolimorfa<String, String> polimorfahoras = new FuncionllamadaPolimorfa<String, String>() {
            @Override
            public String opera(String x) {
                return Llamadas.preciohora(x);
                }
            
        };
        FuncionllamadaPolimorfa<Double, String> polimorfaminutos = new FuncionllamadaPolimorfa<Double, String>(){
            @Override
            public Double opera(String x) {
                return Llamadas.preciofinal(x);
            }
        };
        return componerPolimorfico(polimorfaminutos,polimorfahoras,polimorfodia).opera(info);
    }


    public static FuncionllamadaPolimorfa <Double, String> componerPolimorfico(
            FuncionllamadaPolimorfa<Double,String> funcionU, FuncionllamadaPolimorfa<String,String> funcionD,
            FuncionllamadaPolimorfa<String,String> funcionT) {
        return new FuncionllamadaPolimorfa<Double, String>() {
            public Double opera(String x) {
                return funcionU.opera(funcionD.opera(funcionT.opera(x)));
            }
        };
    }
    
    

    
    public static void main(String[] args) {
        System.out.println("Este programa calcula el precio a cobrar de las llamadas ");
        int sigo=1;
        String dia="ma";
        String hora="10:00";
        String minutos ="1";
        Scanner teclado = new Scanner(System.in);
        while(sigo==1){
        
            System.out.println("Introduzca el dia que se elaboro la llamada siguiendo el menu "
                    + "\n lunes ='lu , martes= 'ma', miercoles ='mi', jueves='ju', viernes = 'vi,"
                    + "sabado = 'sa', domingo ='do' : ");
            dia=teclado.nextLine();
            System.out.println("Introduzca la hora en la cual se realizo en este formato 'hh:mm' : ");
            hora=teclado.nextLine();
            System.out.println("Introduzca el tiempo en minuto de la llamada : ");
            minutos=teclado.nextLine();
            String info =dia+hora+minutos;    
                double pagar=llamadascompuestas(info);
                System.out.println("Precio calculado con funciones compuestas");
                System.out.println("usted va a pagar por la llamada:  "  +pagar);  
                double pagarpolimorfo=llamadaspolimorfas(info);
                System.out.println("Precio calculado con funciones polimorfas");
                System.out.println("usted va a pagar por la llamada:  "  +pagar);  
            System.out.println("\nQuiere seguir consultando el pago de su llamada )) \n1.-si\n0.-no");
            sigo=teclado.nextInt();
            teclado.nextLine();
        }
        teclado.close();
    }
    
}
