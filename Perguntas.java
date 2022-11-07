package registraTarefa;

import java.util.HashMap;
import java.util.Scanner;

public class Perguntas {

	private static	HashMap<Integer, String> map = new HashMap<>();

	public static void main(String[] args) {

		TarefaBean t = new TarefaBean();
		try (Scanner sc = new Scanner(System.in)) {
			Integer opcaoPrincipal;
			Integer percentual = 0;
			Integer id = 0;
			Integer keyGet;

			do {	
				System.out.println("1 - Adicionar uma tarefa;");
				System.out.println("2 - Informar percentual de uma tarefa;");
				System.out.println("3 - Listar tarefas");
				System.out.println("4 - Encerrar");
				opcaoPrincipal = sc.nextInt();

				if (opcaoPrincipal == 1) { 
					Integer refaz;

					do {
						t = new TarefaBean();

						System.out.println("Digite o nome da tarefa :");	 
						String nome = sc.nextLine();
						nome = sc.nextLine();

						id = id + 1;
						map.put(id, nome);

						System.out.println();
						System.out.println("Adicionar outra tarefa?");
						System.out.println("1 - Sim");
						System.out.println("2 - Nao");
						refaz = sc.nextInt();
					} while(refaz == 1 && refaz != 2); 
				}

				else if (opcaoPrincipal == 2) {
					listar();
					System.out.println("Digite o id da palavra que deseja adicionar uma porcentagem: ");
					keyGet = sc.nextInt();
					System.out.println(keyGet + " é a tarefa: " + map.get(keyGet));

					System.out.println("Digite a porcentagem de conclusao: ");	 
					percentual = sc.nextInt();
					t.setPorcentagem(percentual);
				}

				else if(opcaoPrincipal == 3) {
					listar();
				}

			}while (opcaoPrincipal != 4 && opcaoPrincipal <= 3);
		} 
	}

	public static void listar() {
		System.out.println("=============");
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key +" = "+ value);
		} System.out.println("=============");
	}
}