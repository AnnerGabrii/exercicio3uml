package domain;

import java.util.ArrayList;
import java.util.List;

public class Passagem {
    private String codigoReserva;
    private double valor;
    private Cliente cliente;
    private Voo voo;
    private List<Escala> escalas = new ArrayList<>();

    public Passagem(String codigoReserva, double valor, Cliente cliente, Voo voo) {
        this.codigoReserva = codigoReserva;
        this.valor = valor;
        this.cliente = cliente;
        this.voo = voo;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void addEscala(Escala escala) {
        escalas.add(escala);
    }

    @Override
    public String toString() {
        return "Passagem [codigoReserva=" + codigoReserva + ", valor=" + valor + "]";
    }
}

