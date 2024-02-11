
package tarea.pkg2_progra1;
//Gabriel Mejia y Bryan Arita
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
        System.out.println("***Menu***\n1.Replace\n2.Factorial\n3. Mensajes\n4. Promedios\n5. Aprobado o reprobado\n6. Contains\n");
        System.out.println("Elije una opcion: ");
        int opc = duki.nextInt();
        char resp = 's';

        while (resp == 's' || resp == 'S') {
            switch (opc) {
                case 1:
                    System.out.print("Ingrese su cadena: ");
                    String cadena = duki.next();
                    System.out.print("Ingrese el caracter que desea remplazar: ");
                    char remp2 = duki.next().charAt(0);
                    System.out.print("Ingrese su nuevo caracter a remplazar: ");
                    char nuevo = duki.next().charAt(0);

                    String imprimirRep = Replace(cadena, nuevo, remp2);
                    System.out.println(imprimirRep);
                    break;
                case 2:
                   System.out.print("Ingrese el numero que desea saber el factorial: ");
                    int num = duki.nextInt();
                    String fact = factorial(num);
                    System.out.println(fact);
                    break;
                case 3:
                    System.out.println("Ingrese una cadena:");
                    mensaje(duki.nextLine());
                    break;
                case 4:
                    promedio();
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
                    
                    System.out.println("Ingrese una cadena: ");
                    duki.nextLine();
                    String main = duki.nextLine();
                    System.out.println("Ingrese otra cadena: ");
                    String sub = duki.nextLine();
                    if(contains(main, sub)){
                        System.out.println("El string principal contiene el string secundario.");
                    }else{
                        System.out.println("El string principal no contiene el string secundario");
                    }
                    break;
                            
            }
            System.out.println("Quieres seguir en el menu? S/N");
            resp = duki.next().charAt(0);
            if (resp == 's' || resp == 'S') {

                System.out.println("***Menu***\n1. Replace\n2. Factorial\n3. Mensajes\n4. Promedios\n5. Aprobado o reprobado\n6. Contains\n");
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
       public static boolean contains(String main, String sub) {
        for (int i = 0; i <= main.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (main.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                return true;
            }
        }
        return false;
    }
    
     public static void promedio() {
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.print("Ingrese nota 1: ");
            int nota1 = duki.nextInt();
            System.out.print("Ingrese nota 2: ");
            int nota2 = duki.nextInt();
            System.out.print("Ingrese nota 3: ");
            int nota3 = duki.nextInt();
            System.out.print("Ingrese nota 4: ");
            int nota4 = duki.nextInt();
            int promedio = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Promedio de las notas: " + promedio);
            System.out.print("Desea continuar?[S/N]: ");
            resp = duki.next().charAt(0);
        }
    }

    public static String factorial(int n) {
        boolean coma = true;
        String acumfactorial = "";
        int cont = 1;
        for (int i = 1; i < n + 1; i++) {
            cont *= i;
            if (!coma) {
                acumfactorial += "x";
            }
            coma = false;
            acumfactorial += i;
            if (i == n) {
                acumfactorial += "=";
                acumfactorial += cont;
            }
        }
        return acumfactorial;
    }

    public static String Replace(String cadena, char nuevo, char viejo) {
        String rep = "";
        String nuevacadena=cadena.replace(viejo, nuevo);
        rep += nuevacadena;
        return rep;
    }
    
}
