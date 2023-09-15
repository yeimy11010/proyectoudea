public class Empleado {

    //Atributos

    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private boolean esAdministrador;

    //Metodos


    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, boolean esAdministrador) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.esAdministrador = esAdministrador;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }
}
