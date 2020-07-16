package org.gaborbalazs.smartplatform.lotteryservice.client.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.LotteryType;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@JsonDeserialize(builder = Draw.Builder.class)
public final class Draw {

    private final LotteryType lotteryType;
    private final int year;
    private final int week;
    private final LocalDate date;
    private final List<Hit> hits;
    private final List<DrawnNumbers> drawnNumbers;

    private Draw(Builder builder) {
        this.lotteryType = builder.lotteryType;
        this.year = builder.year;
        this.week = builder.week;
        this.date = builder.date;
        this.hits = builder.hits;
        this.drawnNumbers = builder.drawnNumbers;
    }

    public LotteryType getLotteryType() {
        return lotteryType;
    }

    public int getYear() {
        return year;
    }

    public int getWeek() {
        return week;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Hit> getHits() {
        return hits;
    }

    public List<DrawnNumbers> getDrawnNumbers() {
        return Collections.unmodifiableList(drawnNumbers);
    }

    public static Builder newDraw() {
        return new Builder();
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
    public static final class Builder {
        private LotteryType lotteryType;
        private int year;
        private int week;
        @JsonSerialize(using = LocalDateSerializer.class)
        @JsonDeserialize(using = LocalDateDeserializer.class)
        private LocalDate date;
        private List<Hit> hits;
        private List<DrawnNumbers> drawnNumbers;

        private Builder() {
        }

        public Draw build() {
            return new Draw(this);
        }

        public Builder lotteryType(LotteryType lotteryType) {
            this.lotteryType = lotteryType;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder week(int week) {
            this.week = week;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder hits(List<Hit> hits) {
            this.hits = hits;
            return this;
        }

        public Builder drawnNumbers(List<DrawnNumbers> drawnNumbers) {
            this.drawnNumbers = drawnNumbers;
            return this;
        }
    }
}
