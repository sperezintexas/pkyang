package com.jbb.account.customer.app.response.user;

import com.jbb.account.customer.app.response.Response;
import com.wordnik.swagger.annotations.ApiModelProperty;

public class GetAuthCodeResponse extends Response{
	
	private String smsAuthCode;

	@ApiModelProperty(value = "验证码")
	public String getSmsAuthCode() {
		return smsAuthCode;
	}

	@ApiModelProperty(value = "验证码")
	public void setSmsAuthCode(String smsAuthCode) {
		this.smsAuthCode = smsAuthCode;
	}
	
	

}
