package io.github.mario.characters

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Rectangle

class Enemy (startX: Float, startY: Float, startSpeed: Float, atlas: TextureAtlas) {

    var x:Float = 0f
    var y:Float = 0f
    var speed:Float = 100f
    var enemyTexture: TextureRegion?=null
    var enemyArea: Rectangle?=null


    init {
        this.x = startX
        this.y = startY
        this.speed = startSpeed

        val enemyAtlas: TextureAtlas.AtlasRegion = atlas.findRegion("goomba")
        this.enemyTexture = TextureRegion(enemyAtlas.getTexture(), 227, 11, 16, 16)
        this.enemyArea = Rectangle(x, y, 16f, 16f)

    }

        fun update(delta: Float) {

            x += speed * delta
            enemyArea?.setPosition(x, y)


        }

        fun render(batch: SpriteBatch) {
            val scale = 5f  // Ajusta este valor según el tamaño deseado
            batch.draw(
                enemyTexture,
                x, y,
                enemyTexture!!.regionWidth * scale,
                enemyTexture!!.regionHeight * scale
            )
        }

        fun checkisColisioned(player: Rectangle): Boolean {

            if (enemyArea!!.overlaps(player)) {
                return true
            } else {
                return false
            }
        }



        fun sety(yPos: Float) {
            y = yPos
        }



}

/*
* goomba
  rotate: false
  xy: 227, 11
  size: 48, 16
  orig: 48, 16
  offset: 0, 0
  index: -1
*
*
* */
