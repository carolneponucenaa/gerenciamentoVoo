package br.model.jandira.sp.model;

public class Latam extends Companhias{
    public Latam (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo){
        super(destino, companhia,lugarOrigem,duracaoVoo,partidaDate,idaVoo,saidaVoo,passageiros,numeroVoo);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}
