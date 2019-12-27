package univercidad;

public class Curso {

    private String nombre;
    private String curso;
    private String docente;

    public Curso(String nombre, String curso, String docente) {
        this.nombre = nombre;
        this.curso = curso;
        this.docente = docente;
    }

    public Curso() {
        this.nombre = "";
        this.curso = "";
        this.docente = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public String getDocente() {
        return docente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

}
