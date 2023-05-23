import java.util.Scanner;
public class menuPrincipal {
    public static void main(String[] args) {
        Genero rock = new Genero("rock",
                "120bpm",
                "EU",
                "Chuck Berry",
                "Festival de California",
                1950);

        Genero electronioca = new Genero("electronica",
                "190bpm",
                "EU",
                "Avicii",
                "Tomorrowland",
                2015);
        Genero regueton = new Genero("regueton",
                "dem bow",
                "Puerto Rico",
                "Sasha xd",
                "Coca-Cola Flow Fest",
                1990);
        Genero generof=new Genero("pasillo",
                "123bpm",
                "Ecuador",
                "Julio Jaramillo",
                "Pasillo Ecuatoriano",
                1986);

        /*System.out.println(rock.getAnio());
        System.out.println(electronioca.getAnio());
        System.out.println(regueton.getAnio());
        System.out.println(generof.getAnio());

        System.out.println(rock.getAnio()+ electronioca.getAnio()+ regueton.getAnio()+generof.getAnio());
        System.out.println();

        rock.setAnio(1980);
        electronioca.setAnio(2013);
        regueton.setAnio(2001);
        generof.setAnio(1999);

        System.out.println(rock.getAnio());
        System.out.println(electronioca.getAnio());
        System.out.println(regueton.getAnio());
        System.out.println(generof.getAnio());*/

        /*System.out.println("El año del objeto rok es "+rock.getAnio());
        int nuevoAnio;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Setear el año del objeto rock: ");
        nuevoAnio = ingreso.nextInt();
        rock.setAnio(nuevoAnio);
        System.out.println("El nuevo año del objeto rock es de: "+rock.getAnio());

        ingreso.nextLine();
        System.out.println("El año del objeto electronica es "+electronioca.getAnio());
        System.out.print("Setear el año del objeto electronica: ");
        nuevoAnio = ingreso.nextInt();
        electronioca.setAnio(nuevoAnio);
        System.out.println("El nuevo año del objeto electronica es de: "+electronioca.getAnio());*/

        // Hola a todos
        rock.imprimirDatos();
        electronioca.imprimirDatos();
        regueton.imprimirDatos();
    }
}
