public class Proyectil {
    private double velocidadInicial;
    private double angulo; // en grados

    public Proyectil(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
    }
    public double calcularAlcance() {
        double anguloEnRadianes = Math.toRadians(angulo);
        double gravedad = 9.8; // m/s^2

        // Calcular tiempo total de vuelo
        double tiempoVuelo = (2 * velocidadInicial * Math.sin(anguloEnRadianes)) / gravedad;

        // Calcular componente horizontal de la velocidad
        double velocidadHorizontal = velocidadInicial * Math.cos(anguloEnRadianes);

        // Calcular alcance
        return velocidadHorizontal * tiempoVuelo;
    }

    public String toString() {
        return "Proyectil [velocidadInicial=" + velocidadInicial + " m/s, angulo=" + angulo + "°]";
    }
    public double calcularTiempoVuelo(){
        double anguloEnRadianes=Math.toRadians(angulo);
        double gravedad =9.8;
        return (2*velocidadInicial *Math.sin(anguloEnRadianes))/gravedad;
    }



}


