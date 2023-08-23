package pzn.spring.core.scope

import org.springframework.beans.factory.ObjectFactory
import org.springframework.beans.factory.config.Scope

class DoubletonScope : Scope {
    private val objects = ArrayList<Any>(2)
    private var counter = -1L

    override fun get(name: String, objectFactory: ObjectFactory<*>): Any {
        counter++

        return if (objects.size == 2){
            val index = (counter % 2).toInt()
            objects[index]
        } else {
            val objek = objectFactory.`object`
            objects.add(objek)
            objek
        }
    }

    override fun remove(name: String): Any? {
        return if (objects.isNotEmpty()){
            objects.remove(0)
        } else {
            null
        }
    }

    override fun registerDestructionCallback(name: String, callback: Runnable) {}

    override fun resolveContextualObject(key: String): Any? {
        return null
    }

    override fun getConversationId(): String? {
        return null
    }
}