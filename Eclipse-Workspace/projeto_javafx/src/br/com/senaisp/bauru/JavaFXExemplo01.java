package br.com.senaisp.bauru;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXExemplo01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn01 = new Button("Botão 1");
		Button btn02 = new Button("Botão 2");
		// posicionando botões
		btn01.setLayoutY(150);
		btn02.setLayoutY(10);
		// eixo y
		btn01.setLayoutX(150);
		btn02.setLayoutX(10);
		// criando o container
		// StackPane root = new StackPane();
		// TilePane root = new TilePane();
		// VBox root = new VBox();
		Group root = new Group();

		// adcionando botões no painel
		root.getChildren().addAll(btn02, btn01);
		// criando a scene
		Scene cena = new Scene(root, 600, 800,Color.AQUA);
		// amarrando a cena na tela
		primaryStage.setTitle("Titulo da janela");
		primaryStage.setScene(cena);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
