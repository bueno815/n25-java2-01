package br.com.senaisp.bauru.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImage;
	private Image luvaImage;
	private AudioClip som;
	//images views
	private ImageView dukeImgVw;
	private ImageView luvaImgVw;
	//construtor
	public Duke() {
		//carregando as imagens
		dukeImage = new Image (getClass().getResource("Images/Duke.png").toString());
		luvaImage = new Image(getClass().getResource("Images/Glove.png").toString());//criando os imagesviews
		dukeImgVw = new ImageView(dukeImage);
		luvaImgVw = new ImageView(luvaImage);
		//carregando o som 
		som = new AudioClip(getClass().getResource("Audio/Note5.wav").toString());
		//dimencionando e posicionando os itens
		dukeImgVw.setFitWidth(50);
		dukeImgVw.setPreserveRatio(true);//manter prporção da imagem
		dukeImgVw.setY(10);
		//LUVA
		luvaImgVw.setFitWidth(40);
		luvaImgVw.setPreserveRatio(true);//manter prporçao da imagem
		luvaImgVw.setX(17);
		//adicionando os itens no group
		getChildren().addAll(dukeImgVw,luvaImgVw);
		//criando os eventos para o Duke
		criacaoEventos();
	}
	private void criacaoEventos() {
        setOnMouseClicked((me)-> { som.play();} );
        //metodo para arrastar e soltar
        setOnMouseDragged((me)->{
        	double largura = 0;// this.getBoundsInLocal().getWidth()/2;
        	double altura = 0;//this.getBoundsInLocal().getHeight()/2;
        	//posicionando o personagem na scena
        	setLayoutX(me.getSceneX()-largura);
        	setLayoutY(me.getSceneY()-altura);
        	
        });
	}
}

