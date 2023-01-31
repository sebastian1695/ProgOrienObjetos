public class Persona {
    private String nombre;
    private int edad;
    private int identificacion;

    public Persona(String nombre, int edad, int identificacion){
        this.nombre=nombre;
        this.edad= edad;
        this.identificacion=identificacion;
    }
    public Persona(){

    }
    public boolean EsMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        } else {
            return false;
        }

    }
    public void mostrarinformacion(){
        System.out.println("mi nombre es: "+this.nombre +"  y mi edad es de:  " +this.edad);
    }
    public int getIdentificacion(){
        return this.identificacion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }


}
