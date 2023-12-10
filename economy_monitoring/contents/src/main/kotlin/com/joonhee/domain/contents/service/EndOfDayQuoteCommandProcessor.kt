package com.joonhee.domain.contents.service

import com.joonhee.domain.contents.repository.EndOfDayQuoteRepository
import com.joonhee.domain.contents.usecase.EndOfDayQuote
import com.joonhee.domain.contents.usecase.EndOfDayQuoteCommandUseCase

class EndOfDayQuoteCommandProcessor(
    val endOfDayQuoteRepository: EndOfDayQuoteRepository
) : EndOfDayQuoteCommandUseCase {
    override fun saveEndOfDayQuote(endOfDayQuotes: List<EndOfDayQuote>) {
        endOfDayQuoteRepository.saveAll(endOfDayQuotes)
    }
}