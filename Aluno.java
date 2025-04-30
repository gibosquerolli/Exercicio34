package Modelo;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    private String curso;
    public static final String CURSO_PADRAO = "Sistema de informação";
    
    public Aluno(){
        super();
    }
    
    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso; 
    }
    
    @Override
    public void lerDados (){
        super.lerDados();
        curso = CURSO_PADRAO;
    }

    @Override
    public void imprimirDados (){
        super.imprimirDados();
        JOptionPane.showMessageDialog(null, "Curso:" + curso);   
    }
    
    @Override
    public String getNomeFormatado() {
        return nome.toUpperCase();
    }
}
