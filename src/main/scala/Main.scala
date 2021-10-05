import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.text.Text
import scalafx.scene.text.Font
import scalafx.scene.effect.DropShadow
import scalafx.scene.paint.Color
import scalafx.scene.shape.Rectangle

object Main extends JFXApp{
    stage = new PrimaryStage() {    //window
        title = "my first scala"
        alwaysOnTop = true
        height = 400
        width = 400
        scene = new Scene(){        //
            content = List(
                new Text(10,50,"Hello World"){
                font = new Font("BroadWay", 40.0)
                effect = new DropShadow(radius = 3.0, offsetX=3.0, offsetY=3.0, color=Color.Green)
            },
                new Text(10,150,"Hello World"){
                    font = new Font("BroadWay", 40.0)
                    effect = new DropShadow(radius = 3.0, offsetX=3.0, offsetY=3.0, color=Color.Green)
                },
                new Rectangle() {
                    x = 100
                    y = 500
                    fill = Color.Red
                    width = 400
                    height = 400
                }
            )
        }
    }
}