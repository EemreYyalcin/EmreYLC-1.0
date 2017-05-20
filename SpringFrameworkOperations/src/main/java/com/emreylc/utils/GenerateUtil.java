package com.emreylc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GenerateUtil {

	public static Long getId() {
		return (new Random()).nextLong();
	}

	public static String getRandomName() {
		Random rand = new Random();
		String[] names = getName();
		int index = rand.nextInt(names.length);
		return names[index].toLowerCase();
	}

	public static int getRandomAge() {
		Random rand = new Random();
		int age = rand.nextInt(60) + 10;
		return age;
	}

	public static String getRandomPhone() {
		Random rand = new Random();
		int r1 = rand.nextInt(899) + 100;
		int r2 = rand.nextInt(899) + 100;
		int r3 = rand.nextInt(80) + 10;
		int r4 = rand.nextInt(80) + 10;
		return "+90(" + r1 + ") " + r2 + " " + r3 + " " + r4;
	}

	public static String getRandomEmail() {
		return getRandomName() + "." + getRandomName() + "@emreylc.com";
	}

	public static String getUserRandomType() {
		Random rand = new Random();
		int index = rand.nextInt(4);
		if (index == 0) {
			return "ADMIN";
		}

		if (index == 1) {
			return "DEMO";
		}

		if (index == 2) {
			return "USER";
		}

		if (index == 3) {
			return "GUEST";
		}

		return "USER";
	}

	public static String getRandomUsername() {
		return getRandomEmail();
	}

	public static String getRandomPassword() {
		return getRandomName() + "XX" + getRandomAge();
	}

	public static String getRandomStringDate() {
		Random rand = new Random();
		int year = rand.nextInt(70) + 1944;
		int month = rand.nextInt(12) + 1;
		int day = rand.nextInt(30) + 1;
		String date = year + "-";
		if (month < 10) {
			date += "0" + month + "-";
		}
		if (day < 10) {
			date += "0" + day;
		}

		return date;

	}

	public static Date getRandomDate() {
		Random rand = new Random();
		int year = rand.nextInt(70) + 1944;
		int month = rand.nextInt(12) + 1;
		int day = rand.nextInt(30) + 1;
		String date = year + "-";
		if (month < 10) {
			date += "0" + month + "-";
		}
		if (day < 10) {
			date += "0" + day;
		}

		try {
			return new SimpleDateFormat().parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Date();

	}
	//
	// public static User createRandomUser() {
	// User user = new User();
	// UserContext userContext = new UserContext();
	//
	// userContext.setFirstName(GenerateUtil.getRandomName()).setLastName(GenerateUtil.getRandomName())
	// .setAge(GenerateUtil.getRandomAge()).setBurnDate(null).setSingUpDate(null)
	// .setPhone(GenerateUtil.getRandomPhone()).setEmail(GenerateUtil.getRandomEmail())
	// .setDescription("Welcome Mr. Or Mrs. " + userContext.getFirstName());
	//
	// user.setUserId(GenerateUtil.getId()).setUsername(GenerateUtil.getRandomUsername())
	// .setPassword(GenerateUtil.getRandomPassword()).setLastSeenDate(null).setPollCount(4)
	// .setUserType(GenerateUtil.getUserRandomType()).setUserContext(userContext);
	//
	// return user;
	// }

	public static String[] getName() {
		String[] names = new String[] { "ACAR", "AFSAR", "AHSEN", "AKIN", "ALAZ", "ALEMDAR", "ALI", "ALICAN", "ALIHAN", "ALINUR", "ALIZE", "ALP", "ALPAY", "ALTAN", "AMIL", "ANDAC", "ANGIN", "ANIL", "ARAS", "ARDA", "ARDIC", "ARMAGAN", "ARUZ", "ATA", "ATABEK", "ATAC", "ATAOL", "ATES", "ATIK", "ATIL", "ATILGAN", "ATILLA", "ATOM", "AYAZ", "AYBARS", "AYBERK", "AYDEMIR", "AYERDEM", "AYKON", "AYKUT", "AYTAC", "AYTEK", "AYTUG", "AYVAZ", "BALKAR", "BALKIR", "BARAN", "BARBARO", "BASAR", "BATU", "BATUR", "BAYKAL", "BERAT", "BEREKET", "BERK", "BERKAY", "BERKE", "BORA", "BUGRA", "BULUT", "BURAGAN", "BURAK", "BURCAK", "BURKHAN", "CAN", "CENK", "CESUR", "CEYHAN", "COMERT", "CUMHUR", "CAGAN", "CAGATAY", "CAGDAS", "CAGLAR", "CAGLAYA", "CAKABEY", "DAGHAN", "DEGER", "DENIZ", "DERMAN", "DESTAN", "DOGAC", "DORUK", "DUMAN", "DURU", "DURUL", "ECEVIT", "EFE", "EFLATUN", "EFSUN", "EGE", "EGEMEN", "ELHAN", "EMRAH", "EMRE", "ERAN", "ERDEM", "EREN", "ERGUVAN", "ERIM", "ERK", "ERTUNC", "ERTUNGA", "ESER", "EVREN", "EVRENSE", "EYLEM", "FERHAN", "FERHAT", "FEYEZAN", "FEYYAZ", "FEZA", "FURKAN", "GOKADA", "GOKALP", "GOKBERK" };

		return names;
	}

}
