package ex02

class Cachorro(nome: String , raca: String, responsavel: String): Animal(nome, raca,responsavel) {
    override fun comer() {
        println("Andando de 4 patas")
    }

    override fun movimentar() {
        println("Andando e saltando de 4 patas!")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica")
    }
}