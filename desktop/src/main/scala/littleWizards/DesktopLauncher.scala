package littlewizards

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import littewizards.LittleWizardsGame

object DesktopLauncher {

  def main(args: Array[String]): Unit = {
    val config = new LwjglApplicationConfiguration
    config.title = "Little Wizards"
    config.width = 800
    config.height = 600
    new LwjglApplication(new LittleWizardsGame(), config)
  }
}
