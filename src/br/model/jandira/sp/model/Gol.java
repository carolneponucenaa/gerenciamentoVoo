package br.model.jandira.sp.model;

public class Gol extends Companhias{

    public Gol(String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo) {
        super("Porto Seguro - BA","Gol", "Guarulhos - SP", "2:00", "19/12/2023", "14:00","16:00", 100, 456);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}
