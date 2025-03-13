package io.github.mario

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.InputListener

class MenuButton(x: Float, y: Float, width: Float, height: Float, texture: Texture, val onClick: () -> Unit) : Actor() {

    init {
        setBounds(x, y, width, height)
        addListener(object : InputListener() {
            override fun touchDown(event: InputEvent?, x: Float, y: Float, pointer: Int, button: Int): Boolean {
                try {
                    onClick()
                } catch (e: Exception) {
                    Gdx.app.error("MenuButton", "Error al hacer clic en el botón", e)
                }
                return true
            }
        })
    }

    private val buttonTexture = texture
    override fun draw(batch: Batch, parentAlpha: Float) {
        batch.draw(buttonTexture, x, y, width, height)
    }
}
