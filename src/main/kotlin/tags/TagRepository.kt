package tags

class TagRepository {
    val tagsData = hashMapOf(
            0 to Tag(0, "kotlin"),
            1 to Tag(1, "java"),
            2 to Tag(2, "nodejs"),
            3 to Tag(3, "python")
    )

    fun getAllTags(): List<Tag> {
        return tagsData.values.toList()
    }

}
