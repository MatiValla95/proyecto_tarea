public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("El título de la tarea es: " + titulo + ", con una duración aproximada de " + horasEstimadas + " horas");
    }

    public void completar() {
        completada = true;
    }

    void mostrarResponsable() {
        System.out.println("El responsable de la tarea es: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("El estado de la tarea es: " + completada);
    }
}