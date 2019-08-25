package org.gaborbalazs.smartplatform.lotteryservice.client.enums;

public enum LotteryType {
    FIVE_OUT_OF_NINETY("five-out-of-ninety"),
    SIX_OUT_OF_FORTY_FIVE("six-out-of-forty-five"),
    SCANDINAVIAN("scandinavian");

    private final String pathVariableName;

    LotteryType(String pathVariableName) {
        this.pathVariableName = pathVariableName;
    }

    public String getPathVariableName() {
        return pathVariableName;
    }
}
