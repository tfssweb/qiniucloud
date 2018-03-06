package com.tfss.common.storage;

/**
 * 各种类型文件头及其对应特征码
 * @author tfss
 *
 */
public enum FileType {
	JPEG("FFD8FF"),

	PNG("89504E47"),

	GIF("47494638");
	
	private String value = "";

	private FileType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}