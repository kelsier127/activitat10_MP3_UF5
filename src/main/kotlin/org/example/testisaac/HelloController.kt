package org.example.testisaac

import javafx.fxml.FXML
import javafx.scene.control.*

class HelloController {

    //TODO
    // - Guardar la respuesta de cada pregunta
    // - Condicionales para escoger el personaje a partir de las respuestas
    // - Enseñar el personaje
    // - Cambio de escenas?


    //Variables del xml
    lateinit var btnAnswer: Button
    lateinit var btnQ1: Button
    lateinit var btnQ2: Button
    lateinit var btnQ3: Button
    lateinit var btnQ4: Button
    lateinit var btnQ5: Button
    lateinit var btnQ6: Button
    lateinit var keeperRadioButton: RadioButton
    lateinit var judasRadioButton: RadioButton
    lateinit var isaacRadioButton: RadioButton
    lateinit var lostRadioButton: RadioButton


    @FXML
    private lateinit var labelID:Label


    // Variables respuesta final
    private var lost:Int = 0
    private var isaac:Int = 0
    private var judas:Int = 0
    private var keeper:Int = 0

    // Grupo para escoger solamente una opcion
    private val toggleGroup = ToggleGroup()



    @FXML
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 1
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    private fun funcionPregunta1() {
        val answerList = listOf("1respuesta1","1respuesta2","1respuesta3","1respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true //cambio de todos los radioButton a visible
            list[i].toggleGroup = toggleGroup //agrupacion de todos los radioButton para escoger solamente 1
            list[i].text = answerList[i] //cambio de la pregunta de cada radioButton
        }

        labelID.text = "Con quien vives?"

    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 2
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta2() {
        val answerList = listOf("2respuesta1","2respuesta2","2respuesta3","2respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "Pregunta2"
    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 3
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta3() {
        val answerList = listOf("3respuesta1","3respuesta2","3respuesta3","3respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "Pregunta3"
    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 4
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta4() {
        val answerList = listOf("4respuesta1","4respuesta2","4respuesta3","4respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "Pregunta4"
    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 5
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta5() {
        val answerList = listOf("5respuesta1","5respuesta2","5respuesta3","5respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "Pregunta5"
    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 6
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta6() {
        val answerList = listOf("6respuesta1","6respuesta2","6respuesta3","6respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
            list[i].isSelected = false
        }
        labelID.text = "Pregunta6"
    }
    @FXML
    private fun guardarResposta() {
        val answerList = listOf("6respuesta1","6respuesta2","6respuesta3","6respuesta4")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
            list[i].isSelected = false
        }
        labelID.text = "Pregunta6"
    }
}