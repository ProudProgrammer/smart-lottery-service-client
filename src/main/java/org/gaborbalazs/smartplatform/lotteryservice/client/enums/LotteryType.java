package org.gaborbalazs.smartplatform.lotteryservice.client.enums;

public enum LotteryType {
    FIVE_OUT_OF_NINETY("five-out-of-ninety"),
    SIX_OUT_OF_FORTY_FIVE("six-out-of-forty-five"),
    SCANDINAVIAN("scandinavian"),
    JOKER("joker");

    private final String value;

    LotteryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
