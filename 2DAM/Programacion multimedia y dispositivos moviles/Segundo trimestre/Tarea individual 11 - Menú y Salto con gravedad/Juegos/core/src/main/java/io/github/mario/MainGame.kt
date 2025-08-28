import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import io.github.mario.GameScreen
import io.github.mario.Main
import io.github.mario.MenuButton


class MainGame(private val game: Main) : Screen {

    private lateinit var batch: SpriteBatch
    private lateinit var stage: Stage
    private lateinit var menuTexture: Texture
    private lateinit var btnTexture: Texture

    override fun show() {
        batch = SpriteBatch()
        menuTexture = Texture(Gdx.files.internal("menu.png"))
        btnTexture = Texture(Gdx.files.internal("btnStartGame.png"))

        stage = Stage(ScreenViewport())
        Gdx.input.inputProcessor = stage

        val buttonWidth = 200f
        val buttonHeight = 80f
        val buttonX = (Gdx.graphics.width - buttonWidth) -200f / 2f
        val buttonY = (Gdx.graphics.height - buttonHeight) - 200f / 2f

        val button = MenuButton(buttonX, buttonY, buttonWidth, buttonHeight, btnTexture) {
            game.screen = GameScreen(game) // Pasa la instancia de 'Main'
        }

        stage.addActor(button)
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        batch.begin()
        batch.draw(menuTexture,
            0f, 0f,
            Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat(),
            0, 0,
            menuTexture.width, menuTexture.height,
            false, false)
        batch.end()

        stage.act(delta)
        stage.draw()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun pause() {}
    override fun resume() {}
    override fun hide() {}

    override fun dispose() {
        batch.dispose()
        menuTexture.dispose()
        btnTexture.dispose()
        stage.dispose()
    }
}
