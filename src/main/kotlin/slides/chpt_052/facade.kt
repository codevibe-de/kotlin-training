package slides.chpt_052

data class User(val username: String)

interface UserRepository {
    fun save(u: User)
    fun findByUsername(id: String)
}

class JpaUserRepository : UserRepository {

    override fun save(u: User) {
        // complex implementation
    }

    override fun findByUsername(username: String) {
        // complex implementation
    }
}