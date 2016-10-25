package com.sfwltd.cards

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DeckController {

    @RequestMapping("/clean-deck")
    fun cleanDeck(): Deck {
        return Deck()
    }

    @RequestMapping("/shuffled-deck")
    fun shuffledDeck(): Deck {
        var myDeck = Deck()
        myDeck.shuffle()
        return myDeck
    }
}

