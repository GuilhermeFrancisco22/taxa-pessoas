package taxas;

public class PessoasFisica extends Pessoas {

    private double gastoComSaude;

    public double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    public PessoasFisica() {
    }

    public PessoasFisica(String nome, double rendaAnual, double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public String imposto() {
        double valorTaxa = 0;
        double valorParaTaxa = 200000.00;
        double porcentTaxaMin = .15;
        double porcentTaxaMax = .25;
        double porcentTaxaSaude = .50;
        if (getGastoComSaude() > 0 && getRendaAnual() <= valorParaTaxa) {
            valorTaxa = (getRendaAnual() * porcentTaxaMin) - (getGastoComSaude() * porcentTaxaSaude);
        } else if (getGastoComSaude() > 0 && getRendaAnual() > valorParaTaxa) {
            valorTaxa = (getRendaAnual() * porcentTaxaMax) - (getGastoComSaude() * porcentTaxaSaude);
        } else if (getRendaAnual() <= valorParaTaxa) {
            valorTaxa = getRendaAnual() * porcentTaxaMin;
        } else {
            valorTaxa = getRendaAnual() * porcentTaxaMax;
        }
        return getNome() + ": " + valorTaxa;
    }
}
