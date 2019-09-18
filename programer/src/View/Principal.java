/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GerarAluguel;
import Model.AluguelDeAutomóvel;
import Model.Automóvel;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String args[]){
    ArrayList <Pessoa> Funcionario= new ArrayList<Pessoa>();
    ArrayList <Pessoa> Cliente= new ArrayList<Pessoa>();
    ArrayList <Automóvel> automoveis= new ArrayList<Automóvel>();
    ArrayList <AluguelDeAutomóvel> alugueis= new ArrayList<AluguelDeAutomóvel>();
    int txt = 0;
   do{ 
    txt = Integer.parseInt(JOptionPane.showInputDialog(null,"1.cadastrar Funcionario\n2.cadastrar cliente\n3.cadastrar automovel\n4.criar aluguel\n5. sair"));
    if (txt == 1 || txt == 2) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
        String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa: ");
        Pessoa pessoa = new GerarAluguel().criaPessoa(txt);
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        
        if(txt == 1)
            Funcionario.add(pessoa);
        else 
            Cliente.add(pessoa);
    }
    
    if (txt == 3) {
        String automovel = JOptionPane.showInputDialog("1. Cadastrar Caminhão\n2. Cadastrar Carro");
    }
   } 
   while(txt != 5);
    }
    
    
}
