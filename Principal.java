package Principal;

import Modelo.Aluno;
import Modelo.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.lerDados();
        aluno.imprimirDados();
        System.out.println("Nome formatado (Aluno):" + aluno.getNomeFormatado());
        
        Professor professor = new Professor() {};
        professor.lerDados();
        professor.imprimirDados();
        System.out.println("Nome formatado (Professor): " + professor.getNomeFormatado());
    }
}
