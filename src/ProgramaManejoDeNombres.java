import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aImprimir = "";
        String[] nombres = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un nombre");
            nombres[i] = sc.nextLine();
            String finNombre = nombres[i].substring(nombres[i].length()-2);
            nombres[i] = Character.toString(nombres[i].charAt(1));
            nombres[i] = (nombres[i].toUpperCase()) + ".";
            nombres[i] += finNombre;

            aImprimir += nombres[i];
            if(i<2){
                aImprimir += "_";
            }
        }
        System.out.println(aImprimir);
    }
}
