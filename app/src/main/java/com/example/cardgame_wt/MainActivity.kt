package com.example.cardgame_wt

import android.annotation.SuppressLint
/* import android.content.Intent */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

abstract class MainActivity : AppCompatActivity() {

    private lateinit var cardBackImageView: ImageView

    lateinit var scoreTextView: TextView

    lateinit var turnButton: Button
    lateinit var lowerButton: Button
    lateinit var higherButton: Button

    lateinit var random: Random

   /* val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this CardList)
    val oldCard = sharedPreferences.getString("signature", "")
    */

    var score = 0
    private val cardList = CardList()

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random = Random

        cardBackImageView = findViewById(R.id.cardBackImageView)
        cardBackImageView.setImageResource(R.drawable.card_back)

        scoreTextView = findViewById(R.id.scoreTextView)

        turnButton = findViewById(R.id.turnButton)
        turnButton.setOnClickListener() {

            val oldCard = cardList.getNewCard()
            cardBackImageView.setImageResource(oldCard.image)

            score = 0
            scoreTextView.text = "score : $score"

            turnButton.visibility = INVISIBLE
            lowerButton.visibility = VISIBLE
            higherButton.visibility = VISIBLE

        }

        lowerButton = findViewById(R.id.lowerButton)
        lowerButton.setOnClickListener() {

            // generates new card after button have been pressed.
            val card = cardList.getNewCard()
            cardBackImageView.setImageResource(card.image)

            // compare the old card with the new one, for correct answer get 1 point.
          /*  if (card < oldCard){
                score++
                scoreTextView.text = "Score: $score"
                var card = cardList.getNewCard()
            }
            // if the answer is wrong print score and GameOver! but also restart the process.
            else {
                scoreTextView.text = "Score:" + score + "GameOver!"
                turnButton.visibility = View.VISIBLE
                lowerButton.visibility = View.INVISIBLE
                higherButton.visibility = View.INVISIBLE
            }
           */
        }

            higherButton = findViewById(R.id.higherButton)
            higherButton.setOnClickListener() {
                // generates new card after button have been pressed.
                val card = cardList.getNewCard()
                cardBackImageView.setImageResource(card.image)

                // compare the old card with the new one, for correct answer get 1 point.
                /* if (card >){
                     score++
                     scoreTextView.text = "Score: $score"
                     var card = cardList.getNewCard()
                 }
                 // if the answer is wrong print score and GameOver! but also restart the process.
                 else {
                     scoreTextView.text = "Score:" + score + "GameOver!"
                     turnButton.visibility = View.VISIBLE
                     lowerButton.visibility = View.INVISIBLE
                     higherButton.visibility = View.INVISIBLE
                 } */
            }

            turnButton.visibility = View.VISIBLE
            lowerButton.visibility = View.INVISIBLE
            higherButton.visibility = View.INVISIBLE


        }

}









