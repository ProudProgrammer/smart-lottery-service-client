package org.gaborbalazs.smartplatform.lotteryservice.client.enums;

public enum GeneratorType {
    DEFAULT("default"),
    EXPERIMENTAL("experimental");

    private final String value;

    GeneratorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
