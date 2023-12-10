package com.joonhee.domain.contents.port.out

interface NasdaqPort {
    fun findTopCompanySymbol(): List<String>
}