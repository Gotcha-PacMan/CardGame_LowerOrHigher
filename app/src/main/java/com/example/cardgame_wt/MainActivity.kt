package com.example.cardgame_wt


import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var cardBackImageView: ImageView

    lateinit var scoreTextView: TextView

    lateinit var turnButton: Button
    lateinit var lowerButton: Button
    lateinit var higherButton: Button

    var score = 0
    private val cardList = CardList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

            val oldCard = cardList.getNewCard()
            cardBackImageView.setImageResource(oldCard.image)

            val card = cardList.getNewCard()

            // compare the old card with the new one, for correct answer get 1 point.
            if (card.value < oldCard.value){
                score++
                scoreTextView.text = "Score: $score"
                cardList.getNewCard()
            }
            // if the answer is wrong print score and GameOver!
            else {
                scoreTextView.text = "Score:" + score + "GameOver!!"
                turnButton.visibility = View.VISIBLE
                lowerButton.visibility = View.INVISIBLE
                higherButton.visibility = View.INVISIBLE
            }

        }

            higherButton = findViewById(R.id.higherButton)
            higherButton.setOnClickListener() {

                val oldCard = cardList.getNewCard()
                cardBackImageView.setImageResource(oldCard.image)

                val card = cardList.getNewCard()

                if (card.value > oldCard.value){
                    score++
                    scoreTextView.text = "Score: $score"
                    cardList.getNewCard()
                }
                // if the answer is wrong print score and GameOver!
                else {
                    scoreTextView.text = "Score:" + score + "GameOver!!"
                    turnButton.visibility = View.VISIBLE
                    lowerButton.visibility = View.INVISIBLE
                    higherButton.visibility = View.INVISIBLE
                }


               /* // compare the old card with the new one, for correct answer get 1 point.
                if (card.value > number){
                     score++
                     scoreTextView.text = "Score: $score"
                     var card = cardList.getNewCard()
                 }
                 // if the answer is wrong print score and GameOver!
                 else {
                     scoreTextView.text = "Score:" + score + "GameOver!"
                     turnButton.visibility = View.VISIBLE
                     lowerButton.visibility = View.INVISIBLE
                     higherButton.visibility = View.INVISIBLE
                 }
                */


            }

            turnButton.visibility = View.VISIBLE
            lowerButton.visibility = View.INVISIBLE
            higherButton.visibility = View.INVISIBLE


        }

}









