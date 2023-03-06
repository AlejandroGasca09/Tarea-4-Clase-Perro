import java.awt.*;

public class perroDueño {
    public static void main(String[] args) {
        perro perro1 = new perro("Salchicha", 3, "pequeño", "firulais", Color.cyan);
        perro perro2 = new perro("Salchicha",3,"pequeño","firulais",Color.cyan);
        System.out.println(perro1.toString());
        System.out.println(perro2.toString());

    }
}
