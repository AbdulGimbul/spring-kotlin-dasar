package pzn.spring.core.cyclic

import lombok.Data

@Data
class CyclicB(private val cyclicC: CyclicC)