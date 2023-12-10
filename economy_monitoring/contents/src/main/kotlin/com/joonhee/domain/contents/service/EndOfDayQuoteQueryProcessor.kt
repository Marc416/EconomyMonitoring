package com.joonhee.domain.contents.service

import com.joonhee.domain.contents.port.out.StockMarketPort
import com.joonhee.domain.contents.usecase.EndOfDayQuote
import com.joonhee.domain.contents.usecase.EndOfDayQuoteQueryUseCase

open class EndOfDayQuoteQueryProcessor(
    val stockMarketPort: StockMarketPort,
):EndOfDayQuoteQueryUseCase{
    override fun finEndOfDayQuote(symbols: List<String>): List<EndOfDayQuote> {
        return stockMarketPort.findEndOfDayQuote(symbols=symbols)
    }
}