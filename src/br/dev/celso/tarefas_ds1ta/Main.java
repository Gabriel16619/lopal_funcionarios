package br.dev.celso.tarefas_ds1ta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

import br.dev.celso.tarefas_ds1ta.dao.FuncionarioDAO;
import br.dev.celso.tarefas_ds1ta.dao.TarefasDao;
import br.dev.celso.tarefas_ds1ta.model.Funcionario;
import br.dev.celso.tarefas_ds1ta.model.Tarefa;
import br.dev.celso.tarefas_ds1ta.ui.FuncionarioFrame;
import br.dev.celso.tarefas_ds1ta.ui.FuncionarioTela;
import br.dev.celso.tarefas_ds1ta.ui.FuncionariosListaFrame;
import br.dev.celso.tarefas_ds1ta.ui.GerenciadorTarefas;
import br.dev.celso.tarefas_ds1ta.ui.TarefasFrame;


public class Main {
	
	static String caminho = "/Users/25132825/tarefasDS1TA/tarefas.csv";
	
	public static void main(String[] args) {
		
	FuncionarioDAO dao = new FuncionarioDAO(null);
		dao.getFuncionarios();
		
		
		GerenciadorTarefas tela = new GerenciadorTarefas();
		tela.setVisible(true);
		
		Tarefa T = new Tarefa();
		TarefasDao dao1 = new TarefasDao();
		dao1.salvar();
		
		
		
		    
		
	UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		
		String escola = "Senai Jandira";
		String cidade = escola.substring(6, 13);
		System.out.println(cidade);
		
		String uuid8 = uuid.toString().substring(0, 8);
		System.out.println(uuid8);
		
		Funcionario f = new Funcionario("Pedro", "Programador");
		f.setSetor("TI");
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Carlos Augusto");
		f2.setCargo("Analista de Sistemas");
		f2.setSetor("TI");
		
		//FuncionarioDAO dao = new FuncionarioDAO(f2);
		dao1.salvar();
		
	}
	
	private static void escreverArquivo() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);
			
			// adicionando conteúdo ao arquivo
//			bw.append("Senai Jandira");
//			bw.append("Celso");
			bw.append("XPTO\n");
			bw.append("Senai Jandira\n");
			bw.append("Programação de computadores\n");
			
			// Mandando escrever no arquivo
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void lerArquivo() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			
			String retorno = br.readLine();
			
			while (retorno != null) {
				System.out.println(retorno);
				System.out.println(br.readLine());
			}
			
		} catch (FileNotFoundException erro) {
			System.out.println("O arquivo não foi encontrado!");
		} catch (Exception erro) {
			System.out.println("Ocorreu um erro!");
		}
		
		System.out.println("fim");
	}

}
