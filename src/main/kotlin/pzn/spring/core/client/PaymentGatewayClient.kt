package pzn.spring.core.client

import lombok.Data

data class PaymentGatewayClient(
    val endpoint: String,
    val privateKey: String,
    val publicKey: String
)