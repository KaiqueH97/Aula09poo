import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco casa = new Endereco ("rua abc", "jardim abc", "ferraz", "sp", "n/d", "08000-500", 20);

        Contato celular = new Contato(987640011, 11, "celular");
        Contato residencial = new Contato(70707070, 11, "residencial");

        List<Contato> contato = new ArrayList<>();
        contato.add(residencial);
        contato.add(celular);

        //Criar aluno
        // Calendar data = Calendar.getInstance();
        // data.set(2001, Calendar.May, 17 );

        Aluno a = new Aluno("12345678", "kaique", "masculino", 292910, LocalDate.of(1997, 12, 12), casa, contato);
        System.out.println(a.getNome());
        System.out.println(a.getEndereco().getRua());
    }
}
