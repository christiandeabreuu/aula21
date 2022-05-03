package ex03

import ex02.Animal
import ex02.Cachorro

fun main() {
    var fiat1: Fiat = Fiat("Fiat", 2000, 15.50, "vermelho", 4, 100.0)
    fiat1.ligarCarro()
    fiat1.acelerarCarro()
    fiat1.frearCarro()
    println("---------")
    var fiat2: Carro = Fiat("Fiat", 1998, 13.30, "verde, 4", 4,100.0)
    fiat2.ligarCarro()
    fiat2.acelerarCarro()
    fiat2.frearCarro()
    println("---------")
    var hyundai1: Hyundai = Hyundai("Tucson", 2010, 30.0, "preto", 4, 200.0)
    hyundai1.ligarCarro()
    hyundai1.acelerarCarro()
    hyundai1.frearCarro()
    println("---------")
    var hyundai2: Carro = Hyundai("I30", 2022, 40.0, "preto", 4, 220.0)
    hyundai2.ligarCarro()
    hyundai2.acelerarCarro()
    hyundai2.frearCarro()
    println("---------")
    var renault1: Renault = Renault("Clio", 2005, 11.0, "cinza", 4, 180.0)
    renault1.ligarCarro()
    renault1.acelerarCarro()
    renault1.frearCarro()
    println("---------")
    var renault2: Carro = Renault("Sandero", 2012, 41.0, "chumbo", 4, 200.0)
    renault2.ligarCarro()
    renault2.acelerarCarro()
    renault2.frearCarro()
    println("---------")


}
