package ByteBank_herdado_contas;

public class SeguroDeVida implements Tributavel{
    @Override
    public double getValorImposto() {
        return 42;
    }
}
