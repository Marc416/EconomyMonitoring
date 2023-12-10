package com.joonhee.domain.contents.service

import com.joonhee.domain.contents.port.out.StockMarketBatchPort
import com.joonhee.domain.contents.usecase.EndOfDayQuote
import com.joonhee.domain.contents.usecase.EndOfDayQuoteQueryUseCase

open class EndOfDayQuoteQueryProcessor(
    val stockMarketBatchPort: StockMarketBatchPort,
):EndOfDayQuoteQueryUseCase{
    override fun finEndOfDayQuote(symbols: List<String>): List<EndOfDayQuote> {
        return stockMarketBatchPort.findEndOfDayQuote(symbols=symbols)
    }
}