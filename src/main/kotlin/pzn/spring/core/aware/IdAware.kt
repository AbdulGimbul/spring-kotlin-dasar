package pzn.spring.core.aware

interface IdAware {

    fun setId(id: String)

    fun getId(): String
}