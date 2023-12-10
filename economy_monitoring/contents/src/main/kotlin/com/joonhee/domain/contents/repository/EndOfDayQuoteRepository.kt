package com.joonhee.domain.contents.repository

import com.joonhee.domain.contents.usecase.EndOfDayQuote

interface EndOfDayQuoteRepository {
    fun saveAll(endOfDayQuotes: List<EndOfDayQuote>)
}