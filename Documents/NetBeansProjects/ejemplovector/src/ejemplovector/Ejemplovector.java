
package ejemplovector;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**Nombre de la clase:Ejemplovector
 * Fecha:18/04/2018
 *Cpyrigth:ITCA
 * Version:1.0
 * @author Lopez
 */
public class Ejemplovector {

    
    public static void main(String[] args) {
        //declaramos los vectores
        String nombre[]=new String[999];
        int    fecha[]=new int[999];
        double nota1[]=new double[999];
        double nota2[]=new double[999];
        double nota3[]=new double[999];
        DecimalFormat df = new DecimalFormat("##.##");
        
        //declaracion de contadores y acumuladores
        int opcion=0;
        int numero=0;
        String datos="";
        
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENU\n[1]=INGRESAR\n[2]=MOSTRAR\n[3]=SALIR"));
            switch(opcion){
                case 1:
                       nombre[numero]=JOptionPane.showInputDialog("Ingrese datos\nnombre");
                       fecha[numero]=Integer.parseInt(JOptionPane.showInputDialog("edad:"));
                       nota1[numero]=Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
                       nota2[numero]=Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
                       nota3[numero]=Double.parseDouble(JOptionPane.showInputDialog("Nota 3:"));
                       //obteniendo edad
                   
                       datos=datos+"\nalumno #:"+(numero+1)+"\nNombre"+nombre[numero]+
                               "\fecha:"+fecha[numero]+"\nNota1:"+nota1[numero]+"\nNota2"+nota2[numero]+
                               "\nNota3:"+nota3[numero];
                       numero++;              
               break;
                case 2:
                      JOptionPane.showMessageDialog(null," Mostrando todos los registros","REGISTROS",1);
                         for (int i = 0; i < numero; i++) {
                             
                             double promedio=nota1[i]+nota2[i]+nota3[i]/3;
                             JOptionPane.showMessageDialog(null,"ALUMNO #:"+(i+1)+
                                     "\nnombre:"+nombre[i]+"\nedad"+(2018-fecha[i])+"\nNota1 "+nota1[i]+"\nNota2:"+nota2[i]+
                                     "\nNota3"+nota3[i]+"promedio"+df.format(promedio),"DATOS",1);
                        
                    }
                    
                      break;
                               
            }
                 
        }while(opcion!=3);
        
    }
    
}
