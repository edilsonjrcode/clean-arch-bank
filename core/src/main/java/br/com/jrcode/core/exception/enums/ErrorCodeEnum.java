package br.com.jrcode.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Invalid tax number", "ON-0001"),
    TR0001("Shopkeeper user not have the transfer function available", "TR-0001"),
    TR0002("Inavailable balance", "TR-0002"),
    TP0001("Inavailable pin", "TP-0001")
    ;

    private String message;
    private String code;

    private ErrorCodeEnum(String message, String code) {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
