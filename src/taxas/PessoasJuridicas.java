package taxas;

public class PessoasJuridicas extends Pessoas {

    private int numDeFuncionarios;

    public int getNumDeFuncionarios() {
        return numDeFuncionarios;
    }

    public void setNumDeFuncionarios(int numDeFuncionarios) {
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public PessoasJuridicas() {
    }

    public PessoasJuridicas(String nome, double rendaAnual, int numDeFuncionarios) {
        super(nome, rendaAnual);
        this.numDeFuncionarios = numDeFuncionarios;
    }

    @Override
    public String imposto() {
        int minFuncionarioTaxa = 10;
        double valorTaxa = 0;
        double porcentTaxaMin = .14;
        double porcentTaxaMax = .16;
        if (getNumDeFuncionarios() >= minFuncionarioTaxa) {
            valorTaxa = getRendaAnual() * porcentTaxaMin;
        } else {
            valorTaxa = getRendaAnual() * porcentTaxaMax;
        }
        return getNome() + ": " + valorTaxa;
    }
}
