package ex03

class Hyundai(marca: String, ano : Int, valor: Double, cor: String, portas: Int, velocidade: Double): Carro(marca, ano, valor, cor, portas, velocidade) {
    override fun ligarCarro() {
        println("Quando ele inicia a partida do carro, ele mostra a mensagem: Iniciando o motor... minha velocidade está em $velocidade e a velocidade é igual a 5km/h.")
    }

    override fun frearCarro() {
        println("Quando ele freia, ele mostra a mensagem: Freando... minha velocidade está em $velocidade e a velocidade perde + 2km/h a cada chamada do freio, ou seja, a cada chamada do método frear.")
    }

    override fun acelerarCarro() {
        println("acelerando")
    }

}
//Quando ele inicia a partida do carro, ele mostra a mensagem:
//“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
//e a velocidade é igual a 5km/h.
//- Quando ele freia, ele mostra a mensagem: "Freando... minha
//velocidade está em [VELOCIDADE]" e a velocidade perde
//2km/h a cada chamada do freio, ou seja, a cada chamada do
//método frear.
//- Quando ele acelera, ele mostra a mensagem: “Acelerando...
//minha velocidade está em [VELOCIDADE]”, a velocidade
//aumenta em 15km/h a cada pisada no acelerador, ou seja, a
//cada chamada do método acelerar.