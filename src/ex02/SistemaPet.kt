package ex02

fun main() {
    var cachorro: Animal = Cachorro("Dani", "vira-lata", "rua")
    cachorro.comer()
    cachorro.movimentar()
    cachorro.dormir()
    println("----------------")
    var cachorro1: Animal = Cachorro("Victor", "fox paulistinha", "Vizinhanca")
    cachorro1.comer()
    cachorro1.movimentar()
    cachorro1.dormir()
    println("----------------")

    var gata: Gato = Gato("peludinho", "Siamês", "Chrystal")
    gata.comer()
    gata.movimentar()
    gata.dormir()
    println("----------------")

    var passarinho: Passarinho = Passarinho("Henzo","Calopsita", "Paloma")
    passarinho.comer()
    passarinho.movimentar()
    passarinho.dormir()
    println("-----------------")
}