package org.gaborbalazs.smartplatform.lotteryservice.client.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.DrawType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JsonDeserialize(builder = DrawnNumbers.Builder.class)
public final class DrawnNumbers {

    private final DrawType drawType;
    private final List<Integer> numbers;

    private DrawnNumbers(Builder builder) {
        this.drawType = builder.drawType;
        this.numbers = builder.numbers;
    }

    public DrawType getDrawType() {
        return drawType;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public static Builder newDrawnNumbers() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private DrawType drawType;
        private List<Integer> numbers;

        private Builder() {
        }

        public DrawnNumbers build() {
            return new DrawnNumbers(this);
        }

        public Builder drawType(DrawType drawType) {
            this.drawType = drawType;
            return this;
        }

        public Builder numbers(List<Integer> numbers) {
            this.numbers = new ArrayList<>(numbers);
            return this;
        }
    }
}
