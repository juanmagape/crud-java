public class Tarea {
        String nombre;
        String estado;

        public Tarea(String nombre, String estado) {
            this.nombre = nombre;
            this.estado = estado;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }



        @Override
        public String toString() {
            return nombre + " " + estado;
        }

        public String getNombre() { return nombre; }
        public String getEstado() { return estado; }
}

