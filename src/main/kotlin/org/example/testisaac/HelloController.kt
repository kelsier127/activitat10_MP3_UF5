package org.example.testisaac

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.control.*

class HelloController {


    private var preguntaActual: Int = -1  // Añade esta variable para llevar el control de la pregunta actual

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

    // Añadir un sistema para rastrear las preguntas respondidas
    // 6 preguntas en total, inicialmente todas en 'false'
    private val preguntasRespondidas = BooleanArray(6) { false }

    @FXML
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 1
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    private fun funcionPregunta1() {
        val answerList = listOf("Me han abandonado",
            "Con mama o papa, se divorciaron por mi culpa.",
            "Solo, sin confianza no hay traición.",
            "Con quien se deje.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true //cambio de todos los radioButton a visible
            list[i].toggleGroup = toggleGroup //agrupacion de todos los radioButton para escoger solamente 1
            list[i].text = answerList[i] //cambio de la pregunta de cada radioButton
        }

        labelID.text = "¿Con quien vives?"
        preguntaActual = 0


    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 2
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta2() {
        val answerList = listOf("Yo solo quiero que me quieran.",
            "Que a mi madre se le rompa el cinturón de los castigos.",
            "Conseguiré lo que sea como sea.",
            "Quiero lo tuyo y quiero lo mio.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "¿Qué es lo que más quieres en el mundo?"
        preguntaActual = 1

    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 3
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta3() {
        val answerList = listOf("Estoy más solo que un pingüino en el desierto",
            "Los golpes de mi mamá cuentan?",
            "Lo estoy intentando con varias, a ver qué consigo.",
            "Solo quiero quedarme con todo lo de alguien.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "¿Cómo es tu vida morosa?"
        preguntaActual = 2

    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 4
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta4() {
        val answerList = listOf("Encontrar a alguien que me quiera.",
            "Que la gente de mi alrededor me trate bien.",
            "La traición",
            "El poder del capitalismo.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "¿Qué te motiva?"
        preguntaActual = 3

    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 5
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta5() {
        val answerList = listOf("A nadie le importa si fallo.",
            "Mi madre me hace lidiar con el.",
            "Hago fracasar a los demás.",
            "Yo no fracaso.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
        }
        labelID.text = "¿Cómo lidias con el fracaso?"
        preguntaActual = 4

    }
    /**
     * Funcion que se ejecuta al presionar le boton de Pregunta 6
     * Con el for se consigue que todas las respuestas se aparezcan en pantalla al usuario y se cambien las respuestas.
     * El cambio en el label.text hace que cambie la pregunta tambien.
     */
    @FXML
    private fun funcionPregunta6() {
        val answerList = listOf("No quiero molestar, no le diré nada a nadie.",
            "Avisaria a la persona y se lo daría.",
            "No creo que lo necesite.",
            "Lo que es tuyo es mio y lo que es mio también.")
        val list = listOf(lostRadioButton,isaacRadioButton,judasRadioButton,keeperRadioButton)
        for (i in list.indices) {
            list[i].isVisible = true
            list[i].toggleGroup = toggleGroup
            list[i].text = answerList[i]
            list[i].isSelected = false
        }
        labelID.text = "¿Qué harias si a alguien se le cae un billete y no se da cuenta?"
        preguntaActual = 5

    }

    //Cuando pulsas el boton para guardar respuesta, esta es la funcion que se ejecuta
    @FXML
    private fun guardarResposta() {

        // Obtener el RadioButton seleccionado
        val selectedRadioButton = toggleGroup.selectedToggle as? RadioButton

        // Incrementar la variable correspondiente basándose en el índice del RadioButton seleccionado
        when (toggleGroup.toggles.indexOf(selectedRadioButton)) {
            0 -> lost++
            1 -> isaac++
            2 -> judas++
            3 -> keeper++
        }

        // Determinar cuál pregunta fue respondida basándose en el botón de pregunta activo
        val preguntaRespondidaIndex = when {
            btnQ1.isFocused -> 0
            btnQ2.isFocused -> 1
            btnQ3.isFocused -> 2
            btnQ4.isFocused -> 3
            btnQ5.isFocused -> 4
            btnQ6.isFocused -> 5
            else -> null
        }
        // Marcar la pregunta actual como respondida
        /*if (preguntaRespondidaIndex != null) {
            preguntasRespondidas[preguntaRespondidaIndex] = true
        }*/
        if (preguntaActual in preguntasRespondidas.indices) {
            preguntasRespondidas[preguntaActual] = true
        }

        // Verificar si todas las preguntas han sido respondidas
        val todasRespondidas = preguntasRespondidas.all { it }

        if (todasRespondidas) {
            // Si todas las preguntas han sido respondidas, determinar el personaje con la mayor puntuación
            val maxPuntuacion = maxOf(lost, isaac, judas, keeper)
            val mensajePersonaje = when (maxPuntuacion) {
                lost -> "Eres Lost"
                isaac -> "Eres Isaac"
                judas -> "Eres Judas"
                keeper -> "Eres Keeper"
                else -> "Error" // Se agrega un mensaje de error por defecto
            }

            // Mostrar el mensaje final
            labelID.text = "$mensajePersonaje. Test finalizado. Gracias por participar."

            // Mostrar el mensaje final
            labelID.text = "$mensajePersonaje. Test finalizado. Gracias por participar."

            // Cambiar texto del botón a "Salir" y actualizar la acción para cerrar la aplicación
            btnAnswer.text = "Salir"
            btnAnswer.setOnAction { salirDeLaAplicacion() }

        } else {
            // Pasar a la siguiente pregunta no respondida
            if (preguntaActual + 1 in preguntasRespondidas.indices) {
                preguntaActual += 1
                mostrarPregunta(preguntaActual)
            }
        }

        // Reiniciar la selección para la siguiente pregunta
        toggleGroup.selectedToggle?.isSelected = false


    }

    private fun mostrarPregunta(index: Int) {
        // Lógica para mostrar la pregunta basada en el índice
        when (index) {
            0 -> funcionPregunta1()
            1 -> funcionPregunta2()
            2 -> funcionPregunta3()
            3 -> funcionPregunta4()
            4 -> funcionPregunta5()
            5 -> funcionPregunta6()
            else -> {}
        }
    }
    // funcion que te saca del programa
    private fun salirDeLaAplicacion() {
        Platform.exit()
    }
}