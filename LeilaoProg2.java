/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author abalm
 */
public class LeilaoProg2 {

    public static void main(String[] args) {
        System.out.println("Demonstração do padrão observer");
        Cliente cliente1 = new Cliente("Petrus");
        Cliente cliente2 = new Cliente("Julius");
        Cliente cliente3 = new Cliente("Aloki");
        Cliente cliente4 = new Cliente("Totus");
        
        Leilao vendedor = new Leilao();
        vendedor.adicionarCliente(cliente1);
        vendedor.adicionarCliente(cliente2);
        vendedor.adicionarCliente(cliente3);
        vendedor.adicionarCliente(cliente4);
        
        vendedor.setProduto("Monalisa");
        vendedor.notificarClientes();
    }
}
