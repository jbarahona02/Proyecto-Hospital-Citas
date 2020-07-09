public class Persona {

    int id;
    String nombre;
    String apellido;
    String telefono;
    String usuario;
    String contrasenia;
    int perfil;
    

        public Persona() {
        }

        public Persona(int id, String nombre, String apellido, String telefono, String usuario, String contrasenia, int perfil) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.telefono = telefono;
            this.usuario = usuario;
            this.contrasenia = contrasenia;
            this.perfil = perfil;
        }

        // Metodos 
        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getApellido() {
            return apellido;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
        }

        public String getContrasenia() {
            return contrasenia;
        }

        public void setPerfil(int perfil) {
            this.perfil = perfil;
        }

        public int getPerfil() {
            return perfil;
        }

}
