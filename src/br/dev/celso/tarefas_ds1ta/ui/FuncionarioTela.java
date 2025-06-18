package br.dev.celso.tarefas_ds1ta.ui;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class FuncionarioTela {

	private JTable tabelaTarefas;
	private JScrollPane scroll;
	private JLabel labelTitulo;
	private JButton btnNova;
	private JButton btnSair;
	private DefaultTableModel modelTarefa;

	private String[] colunas = { "CÓDIGO", "NOME", "RESPONSAVEL" };

	
	

	public FuncionarioTela(JFrame tela) {
		// TODO Auto-generated constructor stub
	}

	private void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle("Lista de tarefas");
		tela.setSize(600, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);

		modelTarefa = new DefaultTableModel(colunas, 3);

		tabelaTarefas = new JTable(modelTarefa);
		scroll = new JScrollPane(tabelaTarefas);
		scroll.setBounds(10, 60, 580, 340);

		JButton btnNova = new JButton();
		btnNova = new JButton("Nova Tarefa");
		btnNova.setBounds(20, 40, 20, 40);

		JButton btnSair = new JButton();
		btnSair = new JButton("Sair");
		btnSair.setBounds(30, 40, 30, 40);
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GerenciadorTarefas();
				carregarDados();
			}

			private void carregarDados() {
			
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TarefasFrame(tela);
				carregarDados();
				
			}

			private void carregarDados() {
				
				
			}
		});
		
		Container painel = tela.getContentPane();
		painel.add(labelTitulo);
		painel.add(scroll);
		painel.add(btnNova);
		
		tela.setVisible(true);

	}
	
}
