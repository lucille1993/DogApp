import com.squareup.moshi.Json


data class DogImage(
    @Json(name = "\"https:\\/\\/images.dog.ceo\\/breeds\\/sheepdog-english\\/n02105641_5776.jpg\"") val imgSrcUrl: String)
