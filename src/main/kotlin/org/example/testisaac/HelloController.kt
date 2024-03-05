package org.example.testisaac

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label

class HelloController {
    @FXML
    private lateinit var btnQ1: Button
    @FXML
    private lateinit var btnQ2: Button
    @FXML
    private lateinit var btnQ3: Button
    @FXML
    private lateinit var btnQ4: Button
    @FXML
    private lateinit var btnQ5: Button
    @FXML
    private lateinit var btnQ6: Button
    @FXML
    private lateinit var labelID:Label

    @FXML
    private fun funcionPregunta1() {
       labelID.text = "Este es el boton de pregunta 1"
    }@FXML
    private fun funcionPregunta2() {
       labelID.text = "Este es el boton de pregunta 2"
    }@FXML
    private fun funcionPregunta3() {
       labelID.text = "Este es el boton de pregunta 3"
    }@FXML
    private fun funcionPregunta4() {
       labelID.text = "Este es el boton de pregunta 4"
    }@FXML
    private fun funcionPregunta5() {
       labelID.text = "Este es el boton de pregunta 5"
    }@FXML
    private fun funcionPregunta6() {
       labelID.text = "Este es el boton de pregunta 6"
    }
}