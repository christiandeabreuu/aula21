class SistemaBibliotecaa {
    private var livros: ArrayList<Livros> = ArrayList()


    fun mostrarLivros(){
        livros.forEach{
            it.mostrarLivros()
        }
    }

    fun registrarLivros() {
        var opc = 0
        while (true) {
            println("Digite uma opção:")
            println("0: Sair")
            println("1: Registrar livro com Isbn,")
            println("2: Registrar livro com Isbn, e nome do livro")
            println("3: Registrar livro com Isbn, nome do livro e gênero")
            println("4: Registrar livro com Isbn, nome do livro, gênero e autor")
            println("")

            opc = readln().toInt()
            registrarLivrosOpcao(opc)
            if (opc == 0) {
                break
            }
        }
    }
    private fun registrarLivrosOpcao(opc: Int) {
        var livro: Livros = Livros()
        when (opc) {

            0-> println("Saindo!!!")
            1 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                livro.registrarLivros(isbn)
                livros.add(livro)
            }
            2 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do livro")
                val nomeLivro = readln()
                livro.registrarLivros(isbn, nomeLivro)
                livros.add(livro)
            }
            3 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do livro")
                val nomeLivro = readln()
                println("Digite o gênero do livro")
                val genero = readln()
                livro.registrarLivros(isbn, nomeLivro, genero)
                livros.add(livro)
            }
            4 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do livro")
                val nomeLivro = readln()
                println("Digite o gênero do livro")
                val genero = readln()
                println("Digite o autor do livro")
                val autor = readln()
                livro.registrarLivros(isbn, nomeLivro, genero, autor)
                livros.add(livro)
            }

            else -> println("Opção inválida")
        }
    }
}
