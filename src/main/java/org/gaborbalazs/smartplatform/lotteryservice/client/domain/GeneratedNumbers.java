package org.gaborbalazs.smartplatform.lotteryservice.client.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.GeneratorType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JsonDeserialize(builder = GeneratedNumbers.Builder.class)
public final class GeneratedNumbers {

    private final String lotteryType;
    private final GeneratorType generatorType;
    private final List<Integer> generatedNumbers;

    private GeneratedNumbers(Builder builder) {
        this.lotteryType = builder.lotteryType;
        this.generatorType = builder.generatorType;
        this.generatedNumbers = builder.generatedNumbers;
    }

    public String getLotteryType() {
        return lotteryType;
    }

    public GeneratorType getGeneratorType() {
        return generatorType;
    }

    public List<Integer> getGeneratedNumbers() {
        return Collections.unmodifiableList(generatedNumbers);
    }

    public static Builder newGeneratedNumbers() {
        return new Builder();
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
        private String lotteryType;
        private GeneratorType generatorType;
        private List<Integer> generatedNumbers;

        private Builder() {
        }

        public GeneratedNumbers build() {
            return new GeneratedNumbers(this);
        }

        public Builder lotteryType(String lotteryType) {
            this.lotteryType = lotteryType;
            return this;
        }

        public Builder generatorType(GeneratorType generatorType) {
            this.generatorType = generatorType;
            return this;
        }

        public Builder generatedNumbers(List<Integer> generatedNumbers) {
            this.generatedNumbers = new ArrayList<>(generatedNumbers);
            return this;
        }
    }
}
