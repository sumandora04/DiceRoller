package com.notepoint4ugmail.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // For late initialisation
    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_dice_btn)
        diceImage = findViewById(R.id.dice_image)

        rollButton.text ="Let's Roll"

        // Button click
        rollButton.setOnClickListener {
           rollDice()
        }
    }

    private fun rollDice() {
        //Getting random value between 1 and 6.
        val randomValue = Random.nextInt(6)+1

        // When expression to show dice image for different random value.
        val drawableResource = when(randomValue){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }

        //Setting the dice image.
        diceImage.setImageResource(drawableResource)
    }
}
