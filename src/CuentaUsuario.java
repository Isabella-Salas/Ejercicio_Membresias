public abstract class CuentaUsuario {

    private String correoElectronico;
    private int mesesActivo;
    private PlanSuscripcion plan;


    public CuentaUsuario(String correoElectronico, int mesesActivo, PlanSuscripcion plan) {
        this.correoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        this.plan = plan;
    }

    public Double obtenerTotalAPagar(){
        return plan.calcularCosto(mesesActivo);
    }
}
