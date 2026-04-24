package br.com.rpires.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.rpires.domain.Carro;
import br.com.rpires.service.CarroService;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CarroBean implements Serializable {
    private Carro carro = new Carro();
    private CarroService service = new CarroService();
    private String mensagem;

    public void salvar() {
        try {
            service.cadastrar(carro);
            mensagem = "Carro " + carro.getModelo() + " cadastrado com sucesso!";
            carro = new Carro(); // Limpa o formulário
        } catch (Exception e) {
            mensagem = "Erro: " + e.getMessage();
        }
    }

    public Carro getCarro() { return carro; }
    public void setCarro(Carro carro) { this.carro = carro; }
    public String getMensagem() { return mensagem; }
}