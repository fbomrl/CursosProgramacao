import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BancoDeDados {
	
	// Declara��o das vari�veis do tipo private
		private Connection connection=null;
		private java.sql.Statement statement=null;
		private ResultSet resultset=null;

		public void executaconexao() {
			// Criar as vari�veis para a conex�o do banco de dados 
			String servidor = "jdbc:mysql://localhost/itau";
			// Usu�rio do banco de dados
			String usuario="root";
			//Senha de conex�o do banco de dados
			String senha="@Zyad1989";
			//Vincular o driver de conex�o do banco com o java eclipse
			String driver="com.mysql.cj.jdbc.Driver";
			
			//Criar uma sess�o de conex�o com a passagem dos par�metros 
			try {
				Class.forName(driver);
				this.connection=DriverManager.getConnection(servidor,usuario,senha);
				this.statement=this.connection.createStatement();
				
			}catch (Exception e) {
				System.out.println("Erro:"+e.getMessage());
			}
		}
		//Criar um m�todo para verificar se a conex�o est� ativa
		public boolean estaConectado() {
			if (this.connection != null) {
				return true;
			}else {
				return false;
			}
		}
		
		//criando um m�todo para a consulta de registros
		
		public void listaContatos() {
			try {
				String query = "Select * from gama.contatos";	
				this.resultset=this.statement.executeQuery(query);
				this.statement=this.connection.createStatement();
				//Criando um la�o de repeti��o para retornar os registros do nosso SELECT
				while(this.resultset.next()) {
					String meuID = resultset.getString("id_contatos");
					String meuNome = resultset.getString("nome_contatos");
					String meuIdade = resultset.getString("idade");
					String meuEmail = resultset.getString("email");
					
					System.out.println("id "+meuID);
					System.out.println("Nome "+meuNome);
					System.out.println("Idade "+meuIdade);
					System.out.println("Email "+meuEmail);
				}
			}catch(Exception e ) {
				System.out.println("Erro: "+e.getMessage());
			}
			
		}
		
		
		//criando um m�todo para a inser��o de registros
		
		public void inserirContato(String nome, int idade, String email) {
			try {
				//Linha de execu��o do nosso SQL
				String query="insert into gama.contatos (nome_contatos, idade, email) values('"+nome+"','"+idade+"','"+email+"');";
				//Linha para identificar o que iremos montar como String
				System.out.println(query);
				this.statement.executeUpdate(query);
			}catch(Exception e) {
				System.out.println("Erro: "+e.getLocalizedMessage());
			}
			
		}
		
		//Criando o m�todo para fazer a atualiza��o de registros com Update
		public void editarContato(String nome, int id, String email, int idade) {
			//criar uma linha de exce��o
			try {
				String query="update gama.contatos set nome_contatos='"+nome+"', email='"+email+"', idade="+idade+" where id_contatos="+id+";";
				//Permite analisar como est� sendo montado a sintaxe que ser� utilizado no banco de dados
				System.out.println(query);
				this.statement.executeUpdate(query);
			}catch(Exception e) {
				System.out.println("Erro: "+e.getLocalizedMessage());
			}
		}	
		
		// Criando o m�todo de exclus�o de registro
		public void deletaContato(int id) {
			// Vai verificar se existe uma exce��o
			try {
				String query = "delete from gama.contatos where id_contatos="+id+";";
				System.out.println(query);
				this.statement.executeUpdate(query);
			}catch(Exception e) {
				System.out.println("Erro: "+e.getMessage());
			}
		}
		}

		
		

