package com.joonhee.domain.contents.facade

import com.joonhee.domain.contents.usecase.EndOfDayQuoteCommandUseCase
import com.joonhee.domain.contents.usecase.EndOfDayQuoteQueryUseCase
import com.joonhee.domain.contents.usecase.FindTopCompanySymbolQueryUseCase

class EndOfDayBatchScheduleFacade(
    private val findTopCompanySymbolQueryUseCase: FindTopCompanySymbolQueryUseCase,
    private val endOfDayQuoteQueryUseCase: EndOfDayQuoteQueryUseCase,
    private val endOfDayQuoteCommandUseCase: EndOfDayQuoteCommandUseCase
) {
    fun saveAllEndOfDayQuote() {
        val topCompanySymbol = findTopCompanySymbolQueryUseCase.findTopCompanySymbol()
        val endOfDayQuotes = endOfDayQuoteQueryUseCase.finEndOfDayQuote(topCompanySymbol)
        endOfDayQuoteCommandUseCase.saveEndOfDayQuote(endOfDayQuotes)
    }

}