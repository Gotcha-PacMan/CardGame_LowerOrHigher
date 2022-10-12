package com.example.cardgame_wt

class CardList() {
    private val cardList = mutableListOf<Card>()

    init{
        deckOfCards()
    }

    private fun deckOfCards() {

        cardList.add(Card(1, R.drawable.card1))
        cardList.add(Card(2, R.drawable.card2))
        cardList.add(Card(3, R.drawable.card3))
        cardList.add(Card(4, R.drawable.card4))
        cardList.add(Card(5, R.drawable.card5))
        cardList.add(Card(6, R.drawable.card6))
        cardList.add(Card(7, R.drawable.card7))
        cardList.add(Card(8, R.drawable.card8))
        cardList.add(Card(9, R.drawable.card9))
        cardList.add(Card(10, R.drawable.card10))
        cardList.add(Card(11, R.drawable.card11))
        cardList.add(Card(12, R.drawable.card12))
        cardList.add(Card(13, R.drawable.card13))
        cardList.add(Card(14, R.drawable.card14))
        cardList.add(Card(15, R.drawable.card15))
        cardList.add(Card(16, R.drawable.card16))
        cardList.add(Card(17, R.drawable.card17))
        cardList.add(Card(18, R.drawable.card18))
        cardList.add(Card(19, R.drawable.card19))
        cardList.add(Card(20, R.drawable.card20))
        cardList.add(Card(21, R.drawable.card21))
        cardList.add(Card(22, R.drawable.card22))
        cardList.add(Card(23, R.drawable.card23))
        cardList.add(Card(24, R.drawable.card24))
        cardList.add(Card(25, R.drawable.card25))
        cardList.add(Card(26, R.drawable.card26))
        cardList.add(Card(27, R.drawable.card27))
        cardList.add(Card(28, R.drawable.card28))
        cardList.add(Card(29, R.drawable.card29))
        cardList.add(Card(30, R.drawable.card30))
        cardList.add(Card(31, R.drawable.card31))
        cardList.add(Card(32, R.drawable.card32))
        cardList.add(Card(33, R.drawable.card33))
        cardList.add(Card(34, R.drawable.card34))
        cardList.add(Card(35, R.drawable.card35))
        cardList.add(Card(36, R.drawable.card36))
        cardList.add(Card(37, R.drawable.card37))
        cardList.add(Card(38, R.drawable.card38))
        cardList.add(Card(39, R.drawable.card39))
        cardList.add(Card(40, R.drawable.card40))
        cardList.add(Card(41, R.drawable.card41))
        cardList.add(Card(42, R.drawable.card42))
        cardList.add(Card(43, R.drawable.card43))
        cardList.add(Card(44, R.drawable.card44))
        cardList.add(Card(45, R.drawable.card45))
        cardList.add(Card(46, R.drawable.card46))
        cardList.add(Card(47, R.drawable.card47))
        cardList.add(Card(48, R.drawable.card48))
        cardList.add(Card(49, R.drawable.card49))
        cardList.add(Card(50, R.drawable.card50))
        cardList.add(Card(51, R.drawable.card51))
        cardList.add(Card(52, R.drawable.card52))

        shuffle()
    }

    private fun shuffle() {
        cardList.shuffle()
    }

    fun getNewCard(): Card {
        if (cardList.size == 0) {
            deckOfCards()
        }

        return cardList.removeAt(cardList.size - 1)

    }

}