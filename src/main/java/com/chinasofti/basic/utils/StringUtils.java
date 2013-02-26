package com.chinasofti.basic.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.chinasofti.basic.framework.common.Constants;

import sun.misc.BASE64Encoder;


public class StringUtils {

	/**
	 * 利用MD5进行加密
	 * 
	 * @param str
	 *            待加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 *             没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public static String EncoderByMd5(String str)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		// 加密后的字符串
		String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
		return newstr;
	}

	/**
	 * 判断参数是否空
	 * 
	 * @param param
	 * @return
	 */
	public static boolean isNull(String param) {
		if (param == null)
			return false;
		else if ("".equals(param))
			return false;
		else
			return true;
	}

	/**
	 * �ַ�����ת��("ISO-8859-1" -->> "GBK")
	 * 
	 * @param strvalue
	 *            ��ת�����ַ�
	 * @return String
	 */
	public static String convertCodeIG(String strvalue) {
		try {
			return (strvalue != null) ? new String(strvalue
					.getBytes("ISO-8859-1"), "GBK") : "";
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * �ַ�����ת��("GBK" -->> "ISO-8859-1")
	 * 
	 * @param strvalue
	 *            ��ת�����ַ�
	 * @return String
	 */
	public static String convertCodeGI(String strvalue) {
		try {
			return (strvalue != null) ? new String(strvalue.getBytes("GBK"),
					"ISO-8859-1") : "";
		} catch (Exception e) {

			return "";
		}
	}

	/**
	 * ���ִ�����Ԥ���� if =null return ''
	 * 
	 * @param sValue
	 *            String
	 * @return String
	 */
	public static String doPreProcess(String sValue) {
		return (sValue != null) ? sValue : "";
	}

	/**
	 * ���ִ�����Ԥ����, if =null return 'null'
	 * 
	 * @param sValue
	 *            String
	 * @return String
	 */
	public static String doPreProcess2(String sValue) {
		return (sValue != null) ? "'" + sValue + "'" : "null";
	}

	/**
	 * ���ִ�����Ԥ����,if =null or ='null' return ''
	 * 
	 * @param sValue
	 *            String
	 * @return String
	 */
	public static String doPreProcess3(String sValue) {
		return (sValue == null || sValue.equalsIgnoreCase("null")) ? "" : "'"
				+ sValue + "'";
	}

	static SimpleDateFormat sdf1 = new SimpleDateFormat(
			Constants.DEFAULT_DATE_PATTERN);

	static SimpleDateFormat sdf2 = new SimpleDateFormat(
			Constants.DEFAULT_DATE_PATTERN_TIME);

	/**
	 * ȡ��ϵͳ��ǰʱ��,��ʽyyyy-MM-dd
	 * 
	 * @return String
	 */
	static public String getStrDate() {
		// ��ǰʱ��
		java.util.Date date = new java.util.Date(System.currentTimeMillis());
		return sdf1.format(date);
	}

	/**
	 * ��ݴ�����ַ�ȡ��ʱ��,��ʽyyyy-MM-dd
	 * 
	 * @param sValue
	 *            String
	 * @return String
	 */
	static public String getStrDate(String dateStr) {
		if ((dateStr == null) || ("".equals(dateStr))) {
			return "";
		}
		try {
			return sdf1
					.format(new java.sql.Date(sdf2.parse(dateStr).getTime()));
		} catch (ParseException ex) {
			return dateStr;
		}
	}

	/**
	 * ��ݴ����ʱ��ת�����ַ�,��ʽyyyy-MM-dd��yyyy-MM-dd HH:mm:ss
	 * 
	 * @param sValue
	 *            String
	 * @return String
	 */
	static public String dateToStr(java.util.Date date) {
		String retStr = null;
		try {
			Calendar c = java.util.Calendar.getInstance();
			c.setTime(date);
			retStr = (c.get(Calendar.HOUR) == 0 && c.get(Calendar.MINUTE) == 0) ? sdf1
					.format(date)
					: sdf2.format(date);
		} catch (Exception e) {
			return "";
		}
		return retStr;
	}

	/**
	 * ��ݴ�����ַ�ת����ʱ��
	 * 
	 * @param strDate
	 *            String
	 * @return java.util.Date
	 */
	static public java.util.Date strToDate(String strDate) {
		sdf1.setLenient(false);
		sdf2.setLenient(false);
		Date retD = null;
		try {
			retD = new java.sql.Date(sdf1.parse(strDate).getTime());
			return retD;
		} catch (Exception e) {
		}
		try {
			retD = new java.sql.Date(sdf2.parse(strDate).getTime());
			return retD;
		} catch (Exception e) {
		}

		return null;
	}

	static public java.util.Date strToDate1(String strDate) {
		sdf1.setLenient(false);
		java.sql.Date retD = null;
		try {
			retD = new java.sql.Date(sdf1.parse(strDate).getTime());
		} catch (Exception e) {
		}
		return retD;
	}

	static public java.util.Date strToDate2(String strDate) {
		java.sql.Date retD = null;
		try {
			retD = new java.sql.Date(sdf2.parse(strDate).getTime());
		} catch (Exception e) {
		}
		return retD;
	}

	static public String birthToAge(String birth) {
		java.util.Date birth_date = new java.util.Date();
		birth_date = strToDate(birth);
		java.util.Date age_date = new java.util.Date(System.currentTimeMillis()
				- birth_date.getTime());
		Calendar c = Calendar.getInstance();
		c.setTime(age_date);
		return String.valueOf(c.get(Calendar.YEAR) - 1970);
	}

	static public int ageToYear(String age) {
		java.util.Date bir_date = new java.util.Date();
		int year = bir_date.getYear() + 1900;
		int birth_date = year - Integer.parseInt(age);
		return birth_date;
	}

	static public String getBirthdayByID(String _id) {
		String ret = "";
		String id = _id;
		try {
			id = id15to18(id);
			ret = id.substring(6, 14);
		} catch (Exception e) {
		}
		return ret;
	}

	// �����֤ȡ�Ա����
	static public String getSexNameByID(String _id) {
		String ret = "";
		String id = _id;
		try {
			id = id15to18(id);
			int sexnum = Integer.parseInt(id.substring(16, 17));
			sexnum = sexnum % 2;
			ret = (sexnum == 0) ? "Ů" : "��";
		} catch (Exception e) {
		}
		return ret;
	}

	// �����֤ȡ�Ա����
	static public String getSexCodeByID(String _id) {
		String ret = "";
		String id = _id;
		try {
			id = id15to18(id);
			int sexnum = Integer.parseInt(id.substring(16, 17));
			sexnum = sexnum % 2;
			ret = (sexnum == 0) ? "2" : "1";
		} catch (Exception e) {
		}
		return ret;
	}

	// 15λת��Ϊ18
	static public String id15to18(String sCode15) {
		if (sCode15.length() != 15) {
			return sCode15;
		}
		try {
			int i = 0;
			int num = 0;
			String code = "";
			num = 0;
			String IDCode15to18 = sCode15.substring(0, 6) + "19"
					+ sCode15.substring(6, 15);
			i = 17;
			while (i != 0) {
				num = num
						+ (int) (Math.pow(2, i) % 11)
						* (Integer.parseInt(IDCode15to18.substring(17 - i,
								18 - i)));
				i--;
			}
			num = num % 11;
			switch (num) {
			case 0:
				code = "1";
				break;
			case 1:
				code = "0";
				break;
			case 2:
				code = "X";
				break;
			default:
				code = String.valueOf(12 - num);
				break;
			}
			IDCode15to18 = IDCode15to18 + code;
			return IDCode15to18;

		} catch (Exception e) {
			// System.out.println("15 to 18 ���֤��������?");
			e.printStackTrace();
			return null;
		}
	}

	// ��֤����?
	public static boolean confirmID(String _id) {
		boolean ret = true;
		String id = _id;
		int length = _id.trim().length();

		if (length == 15) {
			id = id15to18(_id);
		}
		if (length == 18) {
			char check;
			int num = 0;
			int i = 17;
			while (i > 0) {
				num = num + (int) (Math.pow(2, i) % 11)
						* (Integer.parseInt(id.substring(17 - i, 18 - i)));
				i--;
			}
			num = num % 11;
			switch (num) {
			case 1:
				check = '0';
				break;
			case 0:
				check = '1';
				break;
			case 2:
				check = 'x';
				break;
			default:
				check = String.valueOf(12 - num).charAt(0);
				break;
			}
			if (check != id.charAt(17)) {
				return false;
			}
		}
		return ret;
	}

	/**
	 * �ַ��滻
	 * 
	 * @param strSource
	 *            ����Ҫ���滻�ַ���ַ�?
	 * @param strFrom
	 *            Ҫ���滻���ַ�
	 * @param strTo
	 *            �滻�ɵ��ַ�
	 * @return �滻�������ַ�
	 */
	public static String replaceAll(String strSource, String strFrom,
			String strTo) {
		if (strSource == null) {
			return null;
		}
		int i = 0;
		if ((i = strSource.indexOf(strFrom, i)) >= 0) {
			char[] cSrc = strSource.toCharArray();
			char[] cTo = strTo.toCharArray();
			int len = strFrom.length();
			StringBuffer buf = new StringBuffer(cSrc.length);
			buf.append(cSrc, 0, i).append(cTo);
			i += len;
			int j = i;
			while ((i = strSource.indexOf(strFrom, i)) > 0) {
				buf.append(cSrc, j, i - j).append(cTo);
				i += len;
				j = i;
			}
			buf.append(cSrc, j, cSrc.length - j);
			return buf.toString();
		}
		return strSource;
	}

	public static final String upperFirst(String s) {
		if (s == null)
			return s;
		return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
	}

	public static final void main(String[] para) {
		System.out.println(StringUtils.upperFirst("index"));
	}
}
