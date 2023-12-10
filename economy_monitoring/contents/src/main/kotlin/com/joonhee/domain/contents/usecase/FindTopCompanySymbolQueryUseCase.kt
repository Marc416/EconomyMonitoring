package com.joonhee.domain.contents.usecase

interface FindTopCompanySymbolQueryUseCase {
    // 시총합이 큰순 내림차순으로 1000개의 회사를 탐색
    fun findTopCompanySymbol(): List<String>
}