package tags

import io.javalin.Context

class TagController {
    private val repository = TagRepository()

    fun list(ctx: Context): Context {
        return ctx.json(repository.getAllTags())
    }
}
