package abstracao.horario;

public class Main {

	public static void main(String[] args) {
		
		Horario h1 = new Horario();
        Horario h2 = new Horario(10, 30, 45);

        System.out.println("H1:");
        h1.exibirHorario();
        System.out.println("Segundos: " + h1.calcularSegundos());

        System.out.println("\nH2:");
        h2.exibirHorario();
        System.out.println("Segundos: " + h2.calcularSegundos());

        try {
            new Horario(25, 0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro ao criar horário: " + e.getMessage());
        }

        h1.setHora(22);
        h1.setMinuto(59);
        h1.setSegundo(59);
        System.out.println("\nH1 Modificado:");
        h1.exibirHorario();
        System.out.println("Segundos: " + h1.calcularSegundos());

	}

}
