import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Colaborador> colabs= new ArrayList<Colaborador>();
        String ctrl = "n";

        do {
            String nome;
            String cpf;
            String nascimento;
            String agendamento;
            String periodo;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o nome:");
            nome = entrada.nextLine();

            System.out.println("Digite o cpf:");
            cpf = entrada.nextLine();

            System.out.println("Digite a data de nascimento:");
            nascimento = entrada.nextLine();

            System.out.println("Digite a data de agendamento:");
            agendamento = entrada.nextLine();

            System.out.println("Digite o período:");
            periodo = entrada.nextLine();

            Colaborador colab = new Colaborador(nome,cpf,nascimento,agendamento,periodo);
            colabs.add(colab);

            System.out.println("Gostaria de inserir mais um colaborador? (s ou n)");
            ctrl = entrada.nextLine();

        } while (ctrl.equals("s"));
    }
}
