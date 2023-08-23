package pzn.spring.core.data

import lombok.Getter
import org.springframework.beans.factory.ObjectProvider
import org.springframework.stereotype.Component
import java.util.stream.Collectors

@Component
class MultiFoo(private val objectProvider: ObjectProvider<Foo>) {

    val foos: List<Foo> = objectProvider.stream().collect(Collectors.toList())
}