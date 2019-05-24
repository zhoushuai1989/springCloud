package com.wangcai.utils;

import java.util.UUID;

import com.wangcai.constants.Constants;

public class TokenUtils {

	public static String getMemberToken() {
		return Constants.TOKEN_MEMBER + "-" + UUID.randomUUID();
	}

	public static String getPayToken() {
		return Constants.TOKEN_PAY + "-" + UUID.randomUUID();
	}
}
