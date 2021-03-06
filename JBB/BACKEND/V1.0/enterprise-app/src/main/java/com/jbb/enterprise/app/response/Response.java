package com.jbb.enterprise.app.response;

import com.jbb.enterprise.app.enums.ClientCode;

public class Response {

    private String errorMsg = "";

    private int result = ClientCode.SUCCESS.getCode();

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
