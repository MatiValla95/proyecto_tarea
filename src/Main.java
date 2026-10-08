public class Main {
    static void main() {
        Tarea t1 = new Tarea();
        Tarea t2 = new Tarea();
        Tarea t3 = new Tarea();

        t1.titulo = "Programar";
        t2.titulo = "Optimizar";
        t3.titulo = "Documentar";

        t1.responsable = "Matías Valladares";
        t2.responsable = "Cesar Torres";
        t3.responsable = "Paula Flores";

        t1.horasEstimadas = 36.5;
        t2.horasEstimadas = 12.0;
        t3.horasEstimadas = 5.5;

        t1.completada = false;
        t2.completada = false;
        t3.completada = false;

        t1.completar();
        t1.mostrarInformacion();
        t1.mostrarResponsable();
        t1.mostrarEstado();
        System.out.println(" ");

        t2.mostrarInformacion();
        t2.mostrarResponsable();
        t2.mostrarEstado();
        System.out.println(" ");

        t3.mostrarInformacion();
        t3.mostrarResponsable();
        t3.mostrarEstado();
    }
}