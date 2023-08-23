package pzn.spring.core.cyclic

import lombok.Data

@Data
class CyclicA(private val cyclicB: CyclicB)