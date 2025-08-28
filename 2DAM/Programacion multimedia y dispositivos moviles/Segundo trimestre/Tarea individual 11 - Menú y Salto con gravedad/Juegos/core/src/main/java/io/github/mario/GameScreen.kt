package io.github.mario

import MainGame
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.g2d.*
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.Array
import io.github.mario.characters.Enemy

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.Texture

import java.util.*
import kotlin.math.max
import kotlin.math.min

class GameScreen(private val game: Main) : Screen {
    private lateinit var batch: SpriteBatch
    private lateinit var textureAtlas: TextureAtlas
    private lateinit var idleAnimation: Animation<TextureRegion>
    private lateinit var leftAnimation: Animation<TextureRegion>
    private lateinit var rightAnimation: Animation<TextureRegion>
    private lateinit var upAnimation: Animation<TextureRegion>
    private lateinit var downAnimation: Animation<TextureRegion>
    private var currentAnimation: Animation<TextureRegion>? = null
    private var stateTime = 0f
    private var x = 0f
    private var y = 0f
    private val speed = 100f
    private var backgroundX = 0f

    private lateinit var hud: HUD
    private var EnemySpawnerTime: Float = 0f
    val Enemies = mutableListOf<Enemy>()

    private var isJumping: Boolean = false
    private val gravity: Float = -500f
    private var velocityY: Float = 0f
    private val JUMP_VELOCITY: Float = 400f
    private val GROUND_Y: Float = 0f

    private lateinit var camera: OrthographicCamera
    private lateinit var background: Texture

    // Nueva variable para definir el límite del mapa
    private val mapLimit: Float = 2200f // Ajusta este valor según el tamaño de tu mapa
    private val mapStart: Float = 0f // Límite izquierdo del mapa

    override fun show() {
        batch = SpriteBatch()
        textureAtlas = TextureAtlas(Gdx.files.internal("Mario_and_Enemies.pack"))
        loadAnimations()
        currentAnimation = idleAnimation

        camera = OrthographicCamera()
        camera.setToOrtho(false, Gdx.graphics.width.toFloat(), Gdx.graphics.height.toFloat())

        background = Texture("background6.png")
        background.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.Repeat)

        hud = HUD(batch, textureAtlas) // Inicializa HUD aquí
    }

    private fun loadAnimations() {
        val region = textureAtlas.findRegion("big_mario")

        val totalFrames = 20
        val frameWidth = region.regionWidth / totalFrames
        val frameHeight = region.regionHeight

        val idleFrame = TextureRegion(region, 0, 0, frameWidth, frameHeight)
        idleAnimation = Animation(0.1f, idleFrame)

        val downFrame = TextureRegion(region, 96, 0, frameWidth, frameHeight)
        downAnimation = Animation(0.1f, downFrame)

        val upFrame = TextureRegion(region, 80, 0, frameWidth, frameHeight)
        upAnimation = Animation(0.1f, upFrame)

        leftAnimation = createAnimation("big_mario", totalFrames, 3, 0.1f)
        rightAnimation = createAnimation("big_mario", totalFrames, 3, 0.1f)

        currentAnimation = idleAnimation
    }

    private fun createAnimation(regionName: String, totalFrames: Int, numFrames: Int, frameDuration: Float): Animation<TextureRegion> {
        val frames = Array<TextureRegion>()
        val region = textureAtlas.findRegion(regionName)
        val frameWidth = region.regionWidth / totalFrames
        val frameHeight = region.regionHeight

        for (i in 0 until numFrames) {
            frames.add(TextureRegion(region, i * frameWidth, 0, frameWidth, frameHeight))
        }

        return Animation(frameDuration, frames, Animation.PlayMode.LOOP)
    }

    override fun render(delta: Float) {
        stateTime += Gdx.graphics.deltaTime
        handleInput(Gdx.graphics.deltaTime)
        applyGravity(Gdx.graphics.deltaTime)

        camera.position.set(x + Gdx.graphics.width / 2, Gdx.graphics.height / 2f, 0f)
        camera.update()


        backgroundX = camera.position.x - Gdx.graphics.width / 2f
        EnemySpawnerTime += Gdx.graphics.deltaTime

        if (EnemySpawnerTime > 5) {
            spawnEnemyFromRight()
            EnemySpawnerTime = 0f
        }

        val iterator = Enemies.iterator()
        while (iterator.hasNext()) {
            val enemy = iterator.next()
            enemy.update(Gdx.graphics.deltaTime)

            val marioBounds = Rectangle(x, y, 16f * 8, 16f * 8) // Ajustar tamaño mario

            if (enemy.checkisColisioned(marioBounds)) {
                if (velocityY < 0 && y > enemy.y) {
                    iterator.remove()
                    hud.increaseScore()
                }
            }

            if (enemy.x < camera.position.x - Gdx.graphics.width / 2) {
                iterator.remove()
            }
        }

        ScreenUtils.clear(0f, 0f, 0f, 1f)

        currentAnimation = when {
            Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A) -> leftAnimation
            Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D) -> rightAnimation
            Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S) -> downAnimation
            Gdx.input.isKeyPressed(Input.Keys.SPACE) || Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.UP) -> upAnimation
            else -> idleAnimation
        }

        val currentFrame = currentAnimation!!.getKeyFrame(stateTime, true)

        batch.projectionMatrix = camera.combined

        val backgroundScrollSpeed = 0f // Ajusta este valor para cambiar la velocidad de desplazamiento del fondo
        val backgroundX = camera.position.x * backgroundScrollSpeed

        batch.begin()

        batch.draw(
            background,
            backgroundX, 0f,
            0f, 0f,
            Gdx.graphics.width.toFloat() * 2, Gdx.graphics.height.toFloat(),
            1f, 1f,
            0f,
            (backgroundX % background.width).toInt(), 0,
            background.width, background.height,
            false, false
        )

        val scale = 8f
        batch.draw(
            currentFrame,
            x, y,
            currentFrame.regionWidth * scale,
            currentFrame.regionHeight * scale
        )

        for (enemy in Enemies) {
            enemy.render(batch)
        }

        batch.end()
    }

    private fun spawnEnemyFromRight() {
        val enemyY = 80f // Puedes ajustar la altura
        val enemyX = camera.position.x + Gdx.graphics.width / 2 + 100f // Spawnea fuera de la pantalla a la derecha
        val enemySpeed = -100f // Velocidad negativa para que se mueva a la izquierda
        Enemies.add(Enemy(enemyX, enemyY, enemySpeed, textureAtlas))
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun hide() {
    }

    private fun handleInput(delta: Float) {
        Gdx.input.setOnscreenKeyboardVisible(false) // Para que no abra el teclado al pulsar teclas

        val movementSpeed = speed * delta * 4

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= movementSpeed
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += movementSpeed
        }
        if ((Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) && !isJumping) {
            isJumping = true
            velocityY = JUMP_VELOCITY
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= movementSpeed
        }

        if (Gdx.input.isKeyPressed(Input.Keys.M)) {
            game.screen = MainGame(game)
        }

        // Restringe el movimiento del jugador dentro de los límites del mapa
        x = max(mapStart, min(x, mapLimit)) // Asegura que x esté entre mapStart y mapLimit
    }

    override fun dispose() {
        batch.dispose()
        textureAtlas.dispose()
        background.dispose()
    }

    private fun applyGravity(delta: Float) {
        if (isJumping) {
            velocityY += gravity * delta
        }

        y += velocityY * delta

        if (y <= GROUND_Y) {
            y = GROUND_Y
            velocityY = 0f
            isJumping = false
        }
    }
}
