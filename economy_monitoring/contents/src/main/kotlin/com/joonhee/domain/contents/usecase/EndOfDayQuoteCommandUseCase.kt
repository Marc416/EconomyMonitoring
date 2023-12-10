package com.joonhee.domain.contents.usecase

interface EndOfDayQuoteCommandUseCase {
    fun saveEndOfDayQuote(endOfDayQuotes: List<EndOfDayQuote>)
}