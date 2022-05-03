package ex03

class Fiat (marca: String, ano : Int, valor: Double, cor: String, portas: Int, velocidade: Double): Carro(marca, ano, valor, cor, portas, velocidade){
    override fun ligarCarro() {
        println("Iniciando o motor... minha velocidade está em $velocidade km/h e a velocidade é igual a 3 km/h.")
    }

    override fun frearCarro() {
        println("Freando... minha velocidade está em $velocidade km/h e a velocidade perde 6km/h a cada chamada do freio.")
    }

    override fun acelerarCarro() {
        println("Acelerando... minha velocidade está em $velocidade, a velocidade aumenta em 12km/h a cada pisada no acelerador")
    }

}

//Quando ele inicia a partida do carro, ele mostra a mensagem:
//“Iniciando o motor... minha velocidade está em [VELOCIDADE]”
//e a velocidade é igual a 3 km/h.
//- Quando ele freia, ele mostra a mensagem: "Freando... minha
//velocidade está em [VELOCIDADE]" e a velocidade perde
//6km/h a cada chamada do freio, ou seja, a cada chamada do
//método frear.
//- Quando ele acelera, ele mostra a mensagem: “Acelerando...
//minha velocidade está em [VELOCIDADE]”, a velocidade
//aumenta em 12km/h a cada pisada no acelerador, ou seja, a
//cada chamada do método acelerar.
