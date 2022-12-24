import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horario, minutos, horarioConvertido;

        while (true) {
            System.out.print("Digite o horario (Formato 24): ");
            horario = sc.nextInt();
            System.out.print("Digite os minutos: ");
            minutos = sc.nextInt();

            horarioConvertido = converteHoras(horario);
            saidaHorario(horario, horarioConvertido, minutos);

            System.out.println("Deseja digitar um novo horario ? [Sim/Nao]");
            String resp = sc.next();

            if (resp.equalsIgnoreCase("Nao")) {
                break;
            }

        }
        sc.close();

    }

    public static int converteHoras(int horario) {
        if (horario > 12) {
            horario -= 12;
        } else {
            return horario;
        }
        return horario;
    }

    public static void saidaHorario(int horario, int horarioConvertido, int minutos) {
        String P = "P.M";
        String A = "A.M";

        if (horario > 12) {
            System.out.println("As horas convertidas foi: " + horarioConvertido + ":" + minutos + " " + P);
        } else {
            System.out.println("As horas convertidas foi: " + horarioConvertido + ":" + minutos + " " + A);
        }
    }
}
