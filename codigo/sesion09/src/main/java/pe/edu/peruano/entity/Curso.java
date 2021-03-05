package pe.edu.peruano.entity;


public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;


    public Curso(String codigo) {
        this.codigo = codigo;
    }

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Curso() {
    }

    //nivel de alcance | tipo de retorno | nombre del metodo | parametros
    public void insertarDatos(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void insertarDatos(String codigo){
        this.codigo = codigo;
    }

    public void insertarDatos(int creditos){
        this.creditos = creditos;
        //return this.creditos;
    }

    public int insertarDatos(String codigo, String nombre, int creditos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        return this.creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }
}
