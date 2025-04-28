package Modelo;

import javax.swing.JOptionPane;

public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    
    public Pessoa(){}
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void lerDados(){
        nome = JOptionPane.showInputDialog("Digite o nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
    }
    
    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade" + idade);
    }
    
    public abstract String getNomeFormatado();
}
