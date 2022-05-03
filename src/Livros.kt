class Livros {
    var genero: String = ""
    var nomeLivro: String = ""
    var isbn: Int = 0
    var autor: String = ""

    fun registrarLivros(isbn: Int) {
        this.isbn = isbn
        println(" O livro foi registrado com o ISBN ${this.isbn}")

    }

    fun registrarLivros(isbn: Int, nomeLivro: String) {
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        println(" O livro foi registrado com o ISBN ${this.isbn} e nome ${this.nomeLivro}")
    }

    fun registrarLivros(isbn: Int, nomeLivro: String, genero: String) {
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        this.genero = genero
        println(" O livro foi registrado com o ISBN ${this.isbn}, nome ${this.nomeLivro}, genero ${this.genero}")
    }

    fun registrarLivros(isbn: Int, nomeLivro: String, genero: String, autor: String) {
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        this.genero = genero
        this.autor = autor
        println(" O livro foi registrado com o ISBN ${this.isbn}, nome ${this.nomeLivro}, genero ${this.genero} e autor ${this.autor}")
    }
    fun mostrarLivros(){
        println("""Livros 
            |Nome do Livro: $nomeLivro
            |Isbn: $isbn
            |Gênero: $genero
            |Autor: $autor
            | """".trimMargin())
    }

}