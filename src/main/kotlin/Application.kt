import io.javalin.Javalin
import tags.TagController

fun main(args: Array<String>) {
    val tagController = TagController()

    val app = Javalin.create()
            .exception(Exception::class.java) { e, ctx -> e.printStackTrace() }
            .error(404) { ctx -> ctx.json("not found") }
            .port(7000)
            .start()

    app.get("/tags") { tagController.list(it)}
    
}
