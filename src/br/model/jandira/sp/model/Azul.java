package br.model.jandira.sp.model;

public class Azul extends Companhias{
    public Azul (String destino, String companhia, String lugarOrigem, String duracaoVoo, String partidaDate, String idaVoo, String saidaVoo, Integer passageiros, Integer numeroVoo){
        super("Gramado - RS", "Azul","Guarulhos - SP","2 horas","10/02/2023","15:45","17:45",70,432);
    }

    @Override
    public void Exibirinformacoes() {
        super.Exibirinformacoes();
    }
}
