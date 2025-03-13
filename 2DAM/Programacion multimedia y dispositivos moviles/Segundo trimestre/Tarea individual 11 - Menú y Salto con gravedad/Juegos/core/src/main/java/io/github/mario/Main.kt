package io.github.mario

import MainGame
import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.g2d.*
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.Array

class Main : Game() {
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

    override fun create() {
        setScreen(MainGame(this))
    }

    override fun render() {
       super.render()
    }

    override fun dispose() {
        screen?.dispose()
    }


}
