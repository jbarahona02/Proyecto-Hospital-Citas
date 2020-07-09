public class Cita {

    String nombrepa;
    String apellidopa;
    String idpaciente;
    int iddoctor;
    String fecha, hora;
    int numcli;

    public Cita() {
    }

    public Cita(String nombrepa, String apellidopa, String idpaciente, int iddoctor, String fecha, String hora, int numcli) {
        this.nombrepa = nombrepa;
        this.apellidopa = apellidopa;
        this.idpaciente = idpaciente;
        this.iddoctor = iddoctor;
        this.fecha = fecha;
        this.hora = hora;
        this.numcli = numcli;
    }

    public void setNombrePa(String nombrepa) {
        this.nombrepa = nombrepa;
    }

    public String getNombrePa() {
        return nombrepa;
    }

    public void setApellidoPa() {
        this.apellidopa = apellidopa;
    }

    public String getApellidoPa() {
        return apellidopa;
    }

    public void setIdPaciente(String idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getIdPaciente() {
        return idpaciente;
    }

    public void setIdDoctor(int iddoctor) {
        this.iddoctor = iddoctor;
    }

    public int getIdDoctor() {
        return iddoctor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setnumCli(int numcli) {
        this.numcli = numcli;
    }

    public int getnumCli() {
        return numcli;
    }

}
