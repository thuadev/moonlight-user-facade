package com.thuadev.facade.user.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类描述：用户审核状态
 * 
 * @author: huangbin
 * @date： 日期：2013-10-21 时间：下午6:02:55
 * @todo: TODO
 * @version 1.0
 */
public enum UserAuditStatusEnum {

	AGREE("同意", 100), REFUSE("拒绝", 101), WAIT("处理中", 102);

	/** 枚举值 */
	private int value;

	/** 描述 */
	private String desc;

	private UserAuditStatusEnum(String desc, int value) {
		this.value = value;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static UserAuditStatusEnum getEnum(int value) {
		UserAuditStatusEnum resultEnum = null;
		UserAuditStatusEnum[] enumAry = UserAuditStatusEnum.values();
		for (int i = 0; i < enumAry.length; i++) {
			if (enumAry[i].getValue() == value) {
				resultEnum = enumAry[i];
				break;
			}
		}
		return resultEnum;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List toList() {
		UserAuditStatusEnum[] ary = UserAuditStatusEnum.values();
		List list = new ArrayList();
		for (int i = 0; i < ary.length; i++) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("value", String.valueOf(ary[i].getValue()));
			map.put("desc", ary[i].getDesc());
			list.add(map);
		}
		return list;
	}

	public static Map<String, Map<String, Object>> toMap() {
		UserAuditStatusEnum[] ary = UserAuditStatusEnum.values();
		Map<String, Map<String, Object>> enumMap = new HashMap<String, Map<String, Object>>();
		for (int num = 0; num < ary.length; num++) {
			Map<String, Object> map = new HashMap<String, Object>();
			String key = String.valueOf(getEnum(ary[num].getValue()));
			map.put("value", String.valueOf(ary[num].getValue()));
			map.put("desc", ary[num].getDesc());
			enumMap.put(key, map);
		}
		return enumMap;
	}
}
