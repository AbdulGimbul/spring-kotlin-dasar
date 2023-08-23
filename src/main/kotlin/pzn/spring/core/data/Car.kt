package pzn.spring.core.data

import lombok.Getter
import org.springframework.stereotype.Component
import pzn.spring.core.aware.IdAware

@Component
class Car : IdAware {

    private var _id: String? = null

    override fun setId(id: String) {
        _id = id
    }

    override fun getId(): String {
        return _id ?: ""
    }
}