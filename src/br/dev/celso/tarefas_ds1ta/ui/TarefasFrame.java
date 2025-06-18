package br.dev.celso.tarefas_ds1ta.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.time.LocalDate;

import br.dev.celso.tarefas_ds1ta.dao.FuncionarioDAO;
import br.dev.celso.tarefas_ds1ta.dao.TarefasDao;
import br.dev.celso.tarefas_ds1ta.model.Funcionario;
import br.dev.celso.tarefas_ds1ta.model.Tarefa;



public class TarefasFrame {
	

	public TarefasFrame(JFrame tela) {
		criarTela(tela);
	}
	
	private void criarTela(JFrame parent) {
		
		JDialog tela = new JDialog(parent, true);
		tela.setSize(400, 400);
		tela.setTitle("Codigo:");
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		JLabel labelNome = new JLabel("Titulo:");
		labelNome.setBounds(10, 10, 150, 30);
		JTextField txtNome = new JTextField();
		txtNome.setBounds(10, 40, 200, 30);
		
		JLabel labeldescricao = new JLabel("descricao:");
		labeldescricao.setBounds(10, 75, 150, 30);
		JTextField txtdescricao = new JTextField();
		txtdescricao.setBounds(10, 105, 150, 30);
		
		JLabel labelData = new JLabel("Data: " + "dataInformada");
		labelData.setBounds(10, 75, 150, 30);
		JTextField txt = new JTextField();
		txtdescricao.setBounds(10, 105, 150, 30);
		
		JLabel labelprazo = new JLabel("Prazo:");
		labeldescricao.setBounds(10, 75, 150, 30);
		JTextField txtprazo = new JTextField();
		txtdescricao.setBounds(10, 105, 150, 30);
		
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 250, 150, 40);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(170, 250, 100, 40);
		
		
		
		Container painel = tela.getContentPane();
		painel.add(labelNome);
		painel.add(txtNome);
		painel.add(labeldescricao);
		painel.add(txtdescricao);
		painel.add(btnSalvar);
		painel.add(btnSair);
		painel.add(labelData);
		painel.add(painel);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tarefa T = new Tarefa();
				T.setNome(txtNome.getText());
				
				
				
				TarefasDao dao = new TarefasDao();
				dao.salvar();
				
				JOptionPane.showMessageDialog(tela, T.getNome() + " gravado com sucesso!");
				
				txtNome.setText(null);
				
				txtNome.requestFocus();
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(tela, "Sair do sistema?");
				if (resposta == 0) {
					tela.dispose();
				}
			}
		});
		
		tela.setVisible(true);
		
	}

}

