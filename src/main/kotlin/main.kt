import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
   println("Empezamos aqui")

    for(i in 0..10) {
        GlobalScope.launch {
            println("Soy una corrutina $i estoy ejecutandome en segundo plano")
            delay(2000)
            println("Soy una corrutina $i y he terminado mi trabajo")
        }
    }

    println("Esperamos un rato")
    Thread.sleep(2000)
    println("Terminamos aqui")
}