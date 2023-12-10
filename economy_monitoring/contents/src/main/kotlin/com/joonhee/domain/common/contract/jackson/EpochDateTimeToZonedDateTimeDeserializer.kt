package com.joonhee.domain.common.contract.jackson

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import java.time.Instant
import java.time.ZoneOffset
import java.time.ZonedDateTime


class EpochDateTimeToZonedDateTimeDeserializer : JsonDeserializer<ZonedDateTime>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): ZonedDateTime? {
        val epochTime = p.valueAsLong
        return Instant.ofEpochSecond(epochTime).atZone(ZoneOffset.UTC)
    }
}