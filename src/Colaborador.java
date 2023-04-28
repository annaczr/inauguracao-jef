import java.util.Date;

public class Colaborador {
    private String nome;
    private String cpf;
    private String nascimento;
    private String agendamento;
    private String periodo;

    Colaborador(String nome, String cpf, String nascimento, String agendamento, String periodo){
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.agendamento = agendamento;
        this.periodo = periodo;
    }
}
