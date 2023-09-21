package paqueteObiWan;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ObiWan extends Application {

    @Override
    public void start(Stage escenario) {
        // Configura el título de la ventana
        escenario.setTitle("Verificación de Nombre");

        // Crea un campo de texto para ingresar el nombre
        TextField nombre = new TextField();

        // Crea un botón para verificar el nombre
        Button btnVerificacion = new Button("Verificar");

        // Crea una etiqueta para mostrar el resultado
        Label greetingLabel = new Label();

        // Configura una acción cuando se hace clic en el botón "Verificar"
        btnVerificacion.setOnAction(e -> {
            // Obtiene el nombre ingresado y elimina espacios en blanco al inicio y al final
            String nombreIntroducido = nombre.getText().trim();

            // Comprueba si el nombre es igual a "Obi wan" (sin importar mayúsculas o minúsculas)
            if (nombreIntroducido.equalsIgnoreCase("Obi wan")) {
                // Muestra una alerta con el mensaje "¡General Kenobi!"
                mostrarAlerta("¡General Kenobi!");
            } else {
                // Muestra un saludo personalizado en la etiqueta de resultado
                greetingLabel.setText("Hola " + nombreIntroducido);
            }
        });

        // Crea un botón para cerrar la aplicación
        Button btnCerrar = new Button("Cerrar");

        // Configura una acción para cerrar la ventana principal al hacer clic en el botón "Cerrar"
        btnCerrar.setOnAction(e -> escenario.close());

        // Crea un diseño vertical para organizar los elementos en la ventana
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        // Agrega los elementos al diseño vertical
        vbox.getChildren().addAll(nombre, btnVerificacion, greetingLabel, btnCerrar);

        // Crea una escena con el diseño vertical y un tamaño de 300x200
        Scene escena = new Scene(vbox, 300, 200);

        // Establece la escena en el escenario (ventana principal)
        escenario.setScene(escena);

        // Muestra la ventana principal
        escenario.show();
    }

    // Método para mostrar una alerta con un mensaje
    private void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Mensaje");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}
