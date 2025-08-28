package io.github.mario

import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas

class HUD(private val batch: SpriteBatch, private val atlas: TextureAtlas) { // Constructor modificado

    private var score: Int = 0
    private var gameOver: Boolean = false
    private lateinit var font: BitmapFont

    init {
        font = BitmapFont() // Puedes cargar la fuente aquí o en otro método
    }

    fun increaseScore() {
        score++
    }

    fun setGameOver(GO: Boolean) {
        gameOver = GO
    }

    fun render() {
        font.draw(batch, "Score: $score", 20f, 400f)

        if (gameOver) {
            font.draw(batch, "Game Over", 20f, 400f)
        }
    }

    fun getScore(): Int {
        return score
    }

    fun setScore(sc: Int) {
        score = sc
    }

    fun isGameOver(): Boolean {
        return gameOver
    }
}
