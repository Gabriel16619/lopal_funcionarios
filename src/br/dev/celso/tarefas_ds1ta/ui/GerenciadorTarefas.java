package br.dev.celso.tarefas_ds1ta.ui;

import java.awt.Container;
import java.awt.FlowLayout; // Para organizar os botões um ao lado do outro
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GerenciadorTarefas extends JFrame {

	private JButton btnFuncionarios;
	private JButton btnTarefas;

	public GerenciadorTarefas() {

		this.setTitle("Gerenciador de Tarefas");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Container contentPane = this.getContentPane();

		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		btnFuncionarios = new JButton("Funcionários");

		btnFuncionarios.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão 'Funcionários' clicado!");

			}
		});

		btnTarefas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão 'Tarefas' clicado!");

			}
		});

		contentPane.add(btnFuncionarios);
		contentPane.add(btnTarefas);

		this.setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			new GerenciadorTarefas();
		});
	}
}
