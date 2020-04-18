
class Singleton private constructor() {
    companion object {
        val instance by lazy {
            Singleton()
        }
    }
}