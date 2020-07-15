package org.gaborbalazs.smartplatform.lotteryservice.client.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.GeneratorType;

import java.util.Collections;
import java.util.SortedSet;

@JsonDeserialize(builder = GeneratedNumbers.Builder.class)
public final class GeneratedNumbers {

    private final String lotteryType;
    private final GeneratorType generatorType;
    private final SortedSet<Integer> generatedNumbers;

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

    public SortedSet<Integer> getGeneratedNumbers() {
        return Collections.unmodifiableSortedSet(generatedNumbers);
    }

    public static Builder newGeneratedNumbers() {
        return new Builder();
    }

    @JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
    public static final class Builder {
        private String lotteryType;
        private GeneratorType generatorType;
        private SortedSet<Integer> generatedNumbers;

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

        public Builder generatedNumbers(SortedSet<Integer> generatedNumbers) {
            this.generatedNumbers = generatedNumbers;
            return this;
        }
    }
}
