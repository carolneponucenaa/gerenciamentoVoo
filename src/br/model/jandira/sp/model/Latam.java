package br.model.jandira.sp.model;

public class Latam extends Companhias{
    public Latam (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo){
        super("Fortaleza - CE", "Latam","Guarulhos - SP","3 horas","10/07/2023","17:45","20:45",70,342);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}
