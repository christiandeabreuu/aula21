package ex02

class Gato (nome: String, raca: String, responsavel: String): Animal(nome, raca, responsavel){
    override fun comer() {
        println("Comendo um bife")
    }

    override fun movimentar() {
       println("Andando de 4 patas")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}