package pzn.spring.core

class Database {

    companion object {
        private var database: Database? = null
        val instance: Database?
            get() {
                if (database == null) {
                    database = Database()
                }
                return database
            }
    }
}