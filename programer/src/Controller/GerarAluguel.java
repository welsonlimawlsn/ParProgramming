/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AluguelDeAutomóvel;
import Model.Automóvel;
import Model.Caminhao;
import Model.Cliente;
import Model.Diaria;
import Model.Funcionario;
import Model.Mensal;
import Model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class GerarAluguel {

    Cliente c1;
    Funcionario c2;
    Automóvel c3;
    Diaria p1;
    Mensal p2;

    public void gerarAluguel() {

    }

    public AluguelDeAutomóvel gerarAluguel(Cliente x, Funcionario y, Automóvel z, int tipo) {
        if (tipo == 1) {
            Diaria px = new Diaria();

        }
        if (tipo == 2) {

            Mensal py = new Mensal();

        }

        return null;

    }
    
    public Pessoa criaPessoa(int tipoPessoa) {
        if (tipoPessoa == 2) {
            return new Cliente();
        }
        if (tipoPessoa == 1) {
            Funcionario funcionario = new Funcionario();
            funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: ")));
            funcionario.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcioario: "));
            return funcionario;
        }
        return null;
    } 
    
    public Automóvel criaAutomovel(int tipo) {
        if (tipo == 1) {
        }
        if (tipo == 2) {
            
        }
        return null;
    }

}
