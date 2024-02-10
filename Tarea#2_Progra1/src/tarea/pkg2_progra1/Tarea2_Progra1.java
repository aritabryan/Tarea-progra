/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2_progra1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Tarea2_Progra1 {

    /**
     * @param args the command line arguments
     */
    static Scanner duki = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***Menu***\n1.Replace\n 2.Factorial\n3. Mensajes\n4. Promedios\n5. Aprobado o reprobado\n6. Contains\n");
        System.out.println("Elije una opcion: ");
        int opc = duki.nextInt();
        char resp = 's';

        while (resp == 's' || resp == 'S') {
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese una cadena:");
                    mensaje(duki.nextLine());
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Ingrese la nota del alumno: ");
                    boolean aprob = aprobo(duki.nextInt());
                    if(aprob){
                        System.out.println("El alumno aprobo.");
                    }else{
                        System.out.println("El alumno no aprobo.");
                    }
                    break;
                case 6:
                    break;
                            
            }
            System.out.println("Quieres seguir en el menu? S/N");
            resp = duki.next().charAt(0);
            if (resp == 's' || resp == 'S') {

                System.out.println("***Menu***\n1. Replace\n 2. Factorial\n3. Mensajes\n4. Promedios\n5. Aprobado o reprobado\n6. Contains\n");
                System.out.println("Selecione una opcion: ");
                opc = duki.nextInt();
            }
        }
    }
    public  static void mensaje(String msj){
        System.out.println(msj);
    }
    public static boolean aprobo(int nota){
        if(nota>=60){
            return true;
        }else{
            return false;
        }
    }
}
