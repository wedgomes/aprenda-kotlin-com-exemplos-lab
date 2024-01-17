enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, var formacao: Formacao)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
	
    var conteudos1 = mutableListOf<ConteudoEducacional>()
    conteudos1.add(ConteudoEducacional("POO", 180))
    conteudos1.add(ConteudoEducacional("AED", 90))
    
    
    var conteudos2 = mutableListOf<ConteudoEducacional>()
    conteudos2.add(ConteudoEducacional("Desenvolvimento com Python", 360))
    
    
    
    var formacao1 = Formacao("SI", Nivel.INTERMEDIARIO, conteudos1)
    var usuario1 = Usuario("João", formacao1)
    
    
    var formacao2 = Formacao("Engenharia da Computação", Nivel.DIFICIL, conteudos2)
    var usuario2 = Usuario("Wanderley", formacao2)
    
    formacao1.matricular(usuario1)
    formacao2.matricular(usuario2)
    
    println("Matriculados: SI "+formacao1.inscritos)
    println("Matriculados: ENG COMP. "+formacao2.inscritos)
    
    println("Nome: "+usuario1.nome)
    println("Formação: "+usuario1.formacao.nome)
    println("Nivel: "+usuario1.formacao.nivel)
	
}