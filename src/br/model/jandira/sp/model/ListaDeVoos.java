package br.model.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeVoos {
        private List<Companhias> listaDeVoos;

        public ListaDeVoos() {
            listaDeVoos = new ArrayList<Companhias>();
        }

        public void adicionarVoo(Companhias voo) {
            listaDeVoos.add(voo);
        }

        public void removerVoo(Companhias voo) {
            listaDeVoos.remove(voo);
        }

        public void consultarVoos() {
            for (Companhias voo : listaDeVoos) {
                voo.Exibirinformacoes();
            }

        }
    }

