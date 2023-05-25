public class EjemploString {
    public static void main(String[] args){
        String curso = "Programación Java";
        
        curso = curso.transform(c -> {
            return c + " con ";
        });
        System.out.println("curso = " + curso);
    }
}
