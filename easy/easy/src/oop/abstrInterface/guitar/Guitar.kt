package oop.abstrInterface.guitar

import oop.abstrInterface.guitar.Playable

class Guitar: Playable {
    override fun play() {
       println("Играет гитара")
    }
}