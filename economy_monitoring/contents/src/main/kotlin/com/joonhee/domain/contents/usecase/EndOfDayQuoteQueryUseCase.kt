package com.joonhee.domain.contents.usecase

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.joonhee.domain.common.contract.jackson.EpochDateTimeToZonedDateTimeDeserializer
import java.time.ZonedDateTime

interface EndOfDayQuoteQueryUseCase {
    fun finEndOfDayQuote(symbols: List<String>): List<EndOfDayQuote>
}

data class EndOfDayQuote(
    val symbol: String,
    val name: String,
    val price: Int,
    val changesPercentage: Double,  //전날 장마감의 가격에 대하여 비교한 현재 가격의 변경율
    val change: Double,             // 전날 장마감의 가격에 대하여 비교한 현재 가격의 변경가
    val eps: Double,
    val dayLow: Double,
    val dayHigh: Double,
    val open: Double,               // 당일 시장 오픈시 가격
    @JsonDeserialize(using = EpochDateTimeToZonedDateTimeDeserializer::class)
    val timestamp: ZonedDateTime

)