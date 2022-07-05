import java.util.Scanner.ArrayList;
public class clinicaMedica {
    private ArrayList<Medico> listaDeMedicos;
    private ArrayList<Paciente> listaDePacientes;
    private ArrayList<Consulta> listaDeConsultas;

    public clinicaMedica() {
        listaDeMedicos = new ArrayList<Medico>();
        listaDePacientes = new ArrayList<Paciente>();
        listaDeConsultas = new ArrayList<Consulta>();
    }

    public ArrayList<Medico> getListaDeMedicos() {
        return listaDeMedicos;
    }

    public ArrayList<Paciente> getListaDePacientes() {
        return listaDePacientes;
    }

    public ArrayList<Consulta> getListaDeConsultas() {
        return listaDeConsultas;
    }

    public void marcarConsulta(Consulta c) {
        listaDeConsultas.add(c);
    }

    public void cadastrarMedico(Medico m) {
        listaDeMedicos.add(m);
    }

    public void cadastrarPaciente(Paciente p) {
        listaDePacientes.add(p);
    }

    public double calcularTotalEmCaixa(Data data) {
        double total=0;
        for (int aux=0 ; aux<listaDeConsultas.size() ; aux=aux+1) {
            if (listaDeConsultas.get(aux).getData() == (data)) {
                total = total + 
                listaDeConsultas.get(aux).getMedico().getEspecialidade().getValorConsulta();
            }
        }
        return total;
    }

    public Medico buscarMedico (String med) {
        Medico m = null;
        for (int aux=0 ; aux<listaDeMedicos.size() && m==null ; aux=aux+1) {
            if(listaDeMedicos.get(aux).getNome().equalsIgnoreCase(med)) {
                m = listaDeMedicos.get(aux);
            }
        }
        return m;
    }

    public Paciente buscarPacienteRg (String pacRg) {
        Paciente p = null;
        for (int aux=0 ; aux<listaDePacientes.size() && p==null ; aux=aux+1) {
            if(listaDePacientes.get(aux).getRg().equalsIgnoreCase(pacRg)) {
                p = listaDePacientes.get(aux);
            }
        }
        return p;
    }

    public Consulta buscarConsultaData (byte dia, byte mes , byte ano) {
        Consulta c = null;
        for (int aux=0 ; aux<listaDeConsultas.size() && c==null ; aux=aux+1) {
            if(listaDeConsultas.get(aux).getData().getDia()==dia && 
            listaDeConsultas.get(aux).getData().getMes()==mes && 
            listaDeConsultas.get(aux).getData().getAno()==ano){
                c = listaDeConsultas.get(aux);
            }
        }
        return c;
    }

    public Consulta buscarConsultaHora (String cHora) {
        Consulta ch = null;
        for (int aux=0 ; aux<listaDeConsultas.size() && ch==null ; aux=aux+1) {
            if(listaDeConsultas.get(aux).getHora().equalsIgnoreCase(cHora)) {
                ch = listaDeConsultas.get(aux);
            }
        }
        return ch;
    }
}
public class Imprimir{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Força Pessoal");
    }
}
public class Calculo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2,rt;
        System.out.println("N1");
        n1 = sc.nextInt();
        System.out.println("N2");
        n2 = sc.nextInt();
        rt = n1+n2;
        System.out.println("O resultado é:" +rt);
    }
}
public class Data {
    private byte dia;
    private byte mes;
    private int ano;

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public byte getDia() {
        return dia;
    }

    public byte getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String toString() {
        return "Data:" + dia + "/" + mes + "/" + ano;
    }
}
public class Medico {
    private String nome;
    private Especialidade especialidade;

    public Medico() {
        especialidade = new Especialidade();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public String toString() {
        return "Nome: " + nome + "Especialidade: " + especialidade;
    }
}
import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        clinicaMedica cm = new clinicaMedica();
        int opcao;

        do{
            System.out.println("(1) Cadastrar Médico");
            System.out.println("(2) Cadastrar Paciente");
            System.out.println("(3) Marcar consulta");
            System.out.println("(4) Desmarcar consulta");
            System.out.println("(5) Listar consultas por dia");
            System.out.println("(6) Listar consultas por médico");
            System.out.println("(7) Listar consultas por especialidade");
            System.out.println("(8) Listar consultas por paciente");
            System.out.println("(9) Calcular total em caixa do dia");
            System.out.println("(0) Encerrar");

            opcao = ler.nextInt();
            System.out.print("");

            switch(opcao){
                case 1:

                Medico md = new Medico();
                System.out.println("Digite o nome do médico: ");
                md.setNome(ler.next());
                System.out.println("Digite sua especialidade: ");
                md.getEspecialidade().setEspecialidade(ler.next());

                cm.cadastrarMedico(md);
                System.out.println("\fMédico cadastrado com sucesso!!");
                break;

                case 2:

                Paciente pt = new Paciente();
                System.out.println("Digite o nome do paciente: ");
                pt.setNome(ler.next());
                System.out.println("Digite o RG do paciente: ");
                pt.setRg(ler.next());
                System.out.println("Digite a data de nascimento, peso e sexo do paciente: ");
                System.out.println("Digite o dia: ");
                pt.getDataDeNascimento().setDia(ler.nextByte());
                System.out.println("Digite o mês: ");
                pt.getDataDeNascimento().setMes(ler.nextByte());
                System.out.println("Digite o ano: ");
                pt.getDataDeNascimento().setAno(ler.nextInt());
                System.out.println("Digite o peso do paciente: ");
                pt.setPeso(ler.nextDouble());
                System.out.println("Digite o sexo do paciente: ");
                System.out.println("Digite: (1) Masculino \n(2) Feminino");
                pt.setSexo(ler.nextByte());

                cm.cadastrarPaciente(pt);
                System.out.println("\fPaciente cadastrado com sucesso!!");
                break;

                case 3:

                Consulta ct = new Consulta();
                System.out.println("Digite o nome do paciente: ");
                ct.getPaciente().setNome(ler.next());
                System.out.println("Digite o RG do paciente: ");
                ct.getPaciente().setRg(ler.next());

                System.out.println("Digite o nome do médico que fará a consulta: ");
                ct.getMedico().setNome(ler.next());
                System.out.println("Digite a data da consulta: ");
                System.out.println("Digite o dia: ");
                ct.getData().setDia(ler.nextByte());
                System.out.println("Digite o mês: ");
                ct.getData().setMes(ler.nextByte());
                System.out.println("Digite o ano: ");
                ct.getData().setAno(ler.nextInt());

                System.out.println("Digite o horário da consulta: ");
                ct.setHora(ler.next());

                if (cm.buscarMedico(ct.getMedico().getNome()) !=null) {
                    System.out.println("Médico já tem uma consulta marcada neste dia e horário!!");
                }
                else if (cm.buscarPacienteRg(ct.getPaciente().getRg()) !=null) {
                    System.out.println("Paciente já tem uma consulta marcada neste dia e horário!!");
                }
                else {
                    cm.marcarConsulta(ct);
                    System.out.println("Consulta marcada com sucesso!!");
                }
                break;

            }
        }while(opcao!=0);
    }
}
public class Paciente {
    private String nome;
    private String rg;
    private Data dataDeNascimento;
    private double peso;
    private byte sexo;

    public Paciente() {
        dataDeNascimento = new Data();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataDeNascimento(Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public Data getDataDeNascimento() {
        return dataDeNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public byte getSexo() {
        return sexo;
    }

    public boolean validarSexo() {
        if ((sexo==1) || (sexo==2)) {
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return "Nome do paciente: " + nome + "\nRG: " + rg + "\nData de nascimento: "
        + dataDeNascimento + "Peso: " + peso + "Sexo: " + sexo;
    }
}
public class Especialidade {
    private String especialidade;
    private double valorConsulta;

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public String toString() {
        return "Especialidade:" + especialidade + "\nValor da consulta:" + valorConsulta;
    }
}
public class Consulta {
    private Data data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
        data = new Data();
        medico = new Medico();
        paciente = new Paciente();
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Data getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String toString() {
        return "Consulta:" + "Paciente: " + paciente + "Data: " + data + "Hora: " + hora +
        "\nMédico: " + medico;
    }
}