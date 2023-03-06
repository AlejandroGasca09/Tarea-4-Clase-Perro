import java.awt.*;

public class perro {
    private String especie;
    private byte edad;
    private String tamaño;
    private String nombre;
    private Color color;

    //constructores

    public perro(String salchicha, int edad, String pequeño, String firulais, Color cyan) {

    }

    public perro(String especie, byte edad, String tamaño, String nombre, Color color) {
        this.especie = especie;
        this.edad = edad;
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.color = color;
    }

    //metodos de acceso
    public String getEspecie() {
        return especie;
    }

    public void setEspecie() {
        this.especie = especie;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad() {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño() {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Especie='" + especie + '\'' +
                ", Edad='" + edad +
                ", Tamaño=" + tamaño +
                ", Nombre=" + nombre + '\'' +
                ", color=" + color +
                '}';
    }
    // metodos de uso
    public boolean peso(){
        System.out.println("Cual es el peso del perro : " + tamaño);
        return true;
    }
    public boolean juega(){
        System.out.println(nombre + "juega");
        return true;
    }
   public boolean comida(){
       System.out.println( " respecto a su tamaño " + tamaño + " come " );
       return true;
   }

}
