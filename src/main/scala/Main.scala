import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.text.Text

object Main extends JFXApp{
    stage = new PrimaryStage() {
        title = "my first scala"
        alwaysOnTop = true
        height = 400
        width = 400
        scene = new Scene(){
            content = new Text(10,10,"Hello World")
        }
    }
}