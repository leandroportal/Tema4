public class SwitchCase {
    public static void main(String[] args) {
      /*  var estacion = "verano";
        switch (estacion){
            case "verano": System.out.println("es verano"); break;
            case "invierno": System.out.println("es invierno"); break;
            default: System.out.println(estacion);
            } */

        var hoy_es = "lunes";
        switch (hoy_es){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            System.out.println("hoy es laborable");
            break;
            case "sabado":
            case "domingo":
            System.out.println("No es laborable");
            break;
        }
    }
}
