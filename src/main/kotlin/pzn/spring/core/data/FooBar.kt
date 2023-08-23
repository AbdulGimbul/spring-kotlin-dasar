package pzn.spring.core.data

import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@AllArgsConstructor
@Data
class FooBar(var foo: Foo, var bar: Bar)