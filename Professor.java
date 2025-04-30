package Modelo;

import javax.swing.JOptionPane;

public abstract class Professor extends Pessoa {
    private double salario;
    private String titulo;
    private static final String TITULO_PADRAO = "Doutor";
    
    public Professor() {
        super();
    }
    
    public Professor(String nome, int idade, double salario, String titulo) {
        super(nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public void lerDados() {
        super.lerDados();
        titulo = TITULO_PADRAO;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
    }
    
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        JOptionPane.showMessageDialog(null, "Título: " + titulo + "\nSalário: " + salario);
    }
    
    @Override
    public String getNomeFormatado() {
        return titulo + " " + nome;
    }  
}
