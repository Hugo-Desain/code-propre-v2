package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * La classe DateUtils fournit des méthodes pour formater des dates.
 */

public class DateUtils {

	/**
	 * Formate une date selon le pattern spécifié.
	 *
	 * @param pattern : le pattern à appliquer
	 * @param date : la date à formater
	 * @return la date formatée en tant que chaîne de caractères
	 */

	public static String format(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Formate une date avec un pattern par défaut : "dd/MM/yyyy HH:mm:ss".
	 *
	 * @param date la date à formater
	 * @return la date formatée en tant que chaîne de caractères
	 */
	public static String formatDefaut(Date date) {
		return format("dd/MM/yyyy HH:mm:ss", date);
	}
}
