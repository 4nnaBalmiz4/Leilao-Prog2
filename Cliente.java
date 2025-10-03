
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abalm
 */
public class Cliente implements ICliente{
        
    private String nome;
    
    public Cliente(){
        nome = "sem nome";
    }
    
    public Cliente ( String nome){
        this.nome = nome;
    }
    
    @Override
    public Integer atualizar(Integer lanceMin){
        Random r = new Random();
        lanceMin = r.nextInt(100);
        System.out.println("Cliente: " + nome + " recebeu a mensagem: "+ lanceMin);
        return lanceMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    
}