package com.joonhee.domain.contents.port.out

interface NasdaqPort {
    fun findTopNasdaqCompanySymbol(): List<String>
    fun findTopNyseCompanySymbol(): List<String>
}