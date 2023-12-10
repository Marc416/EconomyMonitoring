package com.joonhee.domain.contents.service

import com.joonhee.domain.contents.port.out.NasdaqPort
import com.joonhee.domain.contents.usecase.FindTopCompanySymbolQueryUseCase

class FindTopCompanySymbolQueryProcessor(
    private val nasdaqPort: NasdaqPort
): FindTopCompanySymbolQueryUseCase {
    override fun findTopCompanySymbol(): List<String> {
        val nasdaqSymbols = nasdaqPort.findTopNasdaqCompanySymbol()
        val nyseSymbols = nasdaqPort.findTopNyseCompanySymbol()
        return nasdaqSymbols + nyseSymbols
    }
}