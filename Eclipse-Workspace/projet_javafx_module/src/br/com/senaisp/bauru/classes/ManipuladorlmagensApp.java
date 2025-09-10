package br.com.senaisp.bauru.classes;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ManipuladorlmagensApp extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group noRoot = new Group();
		criarComponentes(noRoot);
		Scene scena = new Scene(noRoot,800,600,Color.BEIGE);
		primaryStage.setTitle("Manipulando Mídias");
		primaryStage.setScene(scena);
	primaryStage.show();
	}
	
	private void criarComponentes(Group noRoot) {
		Media video = new Media(getClass().getResource("Videos/video.mp4").toString());
		MediaPlayer mp = new MediaPlayer(video);
		MediaView mvw = new MediaView(mp);
		//dimensionando o media view
		mvw.setFitWidth(600);
		mvw.setFitHeight(400);
		//preserva a proporção do video
		mvw.setPreserveRatio(true);
		//posicionando na tela
		mvw.setX(100);
		mvw.setY(100);
		//criando os botões para tocar o video
		Button btnPlay = new Button("Play");
		Button btnPause = new Button("Pause");
		Button btnStop = new Button("Stop");
		//posicionando os botoes
		btnPlay.setLayoutX(100);
		btnPause.setLayoutX(200);
		btnStop.setLayoutX(300);
		
		btnPlay.setLayoutY(450);
		btnPause.setLayoutY(450);
		btnStop.setLayoutY(450);
		//criando as açoes dos botoes
		btnPlay.setOnAction((ev)-> { mp.play();});
		btnPlay.setOnAction((ev)-> { mp.pause();});
		btnPlay.setOnAction((ev)-> { mp.stop();});
		//adicionando no no root
		//criando o Duke
		Duke duk = new Duke();
		duk.setLayoutX(20);
		duk.setLayoutY(20);
		noRoot.getChildren().addAll(mvw, btnPlay, btnPause, btnStop, duk);
		
	}

}
