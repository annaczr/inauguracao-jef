import java.util.Date;

public class Colaborador {
    String nome;
    String cpf;
    String nascimento;
    String agendamento;
    String periodo;

    Colaborador(String nome, String cpf, String nascimento, String agendamento, String periodo){
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.agendamento = agendamento;
        this.periodo = periodo;
    }
}
