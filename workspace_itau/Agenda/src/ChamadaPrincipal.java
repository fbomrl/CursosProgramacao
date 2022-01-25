
public class ChamadaPrincipal {

	public static void main(String[] args) {
		
		BancoDeDados conectar = new BancoDeDados();
		conectar.executaconexao();

		
		if (conectar.estaConectado()) {
			conectar.listaContatos();
			//conectar.inserirContato("Dragonilda", 45, "drago@gmail");
			//conectar.editarContato ("Petrolina Dragon", 17,".d@gama.com.br", 80);
			//conectar.deletaContato(17);
			System.out.println("Conexão com o banco executada com exito");
			
		}else {
			System.out.println("Não foi possivel conectar");
		}
	}
	
	
	
	
}
