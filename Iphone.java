package Projeto;

public class Iphone implements ReprodutorMusical,AparelhoTelefônico,NavegadorNaInternet{

	public void exibirPagina() {
		System.out.println("EXibindo paginar no Navegador");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba no Navegador");
	}

	public void AtualizarPagina() {
		System.out.println("Atualizando Pagina no Navegador");
	}

	public void ligar() {
		System.out.println("Fazendo uma ligação");
	}

	public void atender() {
		System.out.println("Atendendo uma ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciar mensagem de voz");
	}

	public void tocar() {
		System.out.println("Tocar Musica");
	}

	public void pausar() {
		System.out.println("Pausar musica");
	}

	public void selecionarMusica() {
		System.out.println("Escolhendo uma musica");
	}
	
}
