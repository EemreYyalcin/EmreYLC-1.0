package com.emreylc.globalconverters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class JulianDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String strDate) {
		if (strDate == null) {
			return null;
		}
		if (strDate.length() <= 0) {
			return null;
		}
		Date tmpDate = null;
		try {
			System.out.println("Converting julian date");
			tmpDate = acceptDate(strDate);

		} catch (ParseException | NullPointerException e) {
			e.printStackTrace();
		}
		return tmpDate;
	}

	private Date acceptDate(String strDate) throws ParseException {

		if (strDate.indexOf("-") > 0) {
			return new SimpleDateFormat("dd-mm-yyyy").parse(strDate);
		}

		if (strDate.indexOf(".") > 0) {
			return new SimpleDateFormat("dd.mm.yyyy").parse(strDate);
		}
		if (strDate.indexOf(":") > 0) {
			return new SimpleDateFormat("dd:mm:yyyy").parse(strDate);
		}
		if (strDate.indexOf("/") > 0) {
			return new SimpleDateFormat("dd/mm/yyyy").parse(strDate);
		}
		return null;
	}

}
