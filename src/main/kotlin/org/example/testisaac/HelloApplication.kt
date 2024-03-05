package org.example.testisaac

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.stage.Stage

class HelloApplication : Application() {


    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("preguntas.fxml"))
        val scene = Scene(fxmlLoader.load(), 700.0, 700.0)

        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}


fun main() {
    Application.launch(HelloApplication::class.java)
}