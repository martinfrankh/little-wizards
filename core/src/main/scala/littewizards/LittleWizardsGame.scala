package littewizards

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.{GL20, OrthographicCamera, Texture}
import com.badlogic.gdx.{ApplicationAdapter, Gdx}

class LittleWizardsGame extends ApplicationAdapter {
  private var batch: SpriteBatch = _
  private var wizardTexture: Texture = _
  private var camera: OrthographicCamera = _

  private var wizardX = 100f
  private var wizardY = 100f

  override def create(): Unit = {
    batch = new SpriteBatch()
    wizardTexture = new Texture("Soldier.png")
    camera = new OrthographicCamera()
    camera.setToOrtho(false, 800, 600)
  }

  override def render(): Unit = {
    Gdx.gl.glClearColor(0.2f, 0.3f, 0.5f, 1)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    camera.update()
    batch.setProjectionMatrix(camera.combined)

    batch.begin()
    batch.draw(wizardTexture, wizardX, wizardY)
    batch.end()

    handleInput()
  }

  private def handleInput(): Unit = {
    if (Gdx.input.isTouched) {
      wizardX += 1f
    }
  }

  override def dispose(): Unit = {
    batch.dispose()
    wizardTexture.dispose()
  }
}
