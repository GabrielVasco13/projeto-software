package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Titulo da tela
			primaryStage.setTitle("Tela cadastro");
			
			// Tela - informa se a tela pode mudar de tamanho
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			// Carregar as informações da tela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/telaCadastro.fxml"));
			
			Parent arquivoFXML = loader.load();
			
			// abrir a tela
			
			Scene home = new Scene(arquivoFXML);
			primaryStage.setScene(home);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
