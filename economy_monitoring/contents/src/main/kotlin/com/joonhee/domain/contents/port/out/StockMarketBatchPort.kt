package com.joonhee.domain.contents.port.out

import com.joonhee.domain.contents.usecase.EndOfDayQuote

interface StockMarketBatchPort {
    fun findEndOfDayQuote(symbols: List<String>): List<EndOfDayQuote>
}