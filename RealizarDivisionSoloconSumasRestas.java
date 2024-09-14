
package realizardivisionsoloconsumasrestas;

public class RealizarDivisionSoloconSumasRestas {
    
    public static void main(String[] args) {
     int  numerador = 8;
     int denominador = 3;
     int contador = 0;
     int multi =0;
     for(int i = denominador; i <= numerador; i= i+denominador){
            
            contador = contador+1;
            multi = denominador + multi;
        }
       
        
       
        
        System.out.println(numerador + " dividio por " + denominador + " es igual " + contador + " y el residuo es " + (numerador - multi));
    }
    
}
