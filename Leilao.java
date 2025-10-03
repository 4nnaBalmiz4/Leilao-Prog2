/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abalm
 */
public class Leilao implements ILeilao {   
    private List<Cliente> clientes; 
    private String produto; 
    
    public Leilao(){
        clientes = new ArrayList(); 
        produto = "sem produtos hoje"; 
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public void adicionarCLiente(Cliente ic) {
        clientes.add(ic);
    }

    @Override
    public void removerCLiente(Cliente ic) {
        clientes.remove(ic);
    }

    @Override
    public void notificarCLiente() {
        Integer maiorLance=0;
        String c="";
        for (Cliente i : clientes){
            Integer lancem=i.atualizar(50000);
            if(maiorLance<lancem){
                maiorLance=lancem;
                c=i.getNome();
            }
        }
        System.out.printf("O cliente: "+c+" deu o lance"+maiorLance);
    }

    void adicionarCliente(Cliente cliente1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void notificarClientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}