public class Persona {
    private String nombre;
    private String apellido;

    Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void mostrarDatos(){
        System.out.println("mostrar nombre:" +nombre);
        System.out.println("mostrar apellido:" + apellido);
    }
}
