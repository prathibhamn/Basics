package com.basics.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Heterogeneous container- type safe
 * 
 * @author MN.Prathibha
 *
 */
public class GenericsEX7 {

	/* public void print(Set<String> strSet) { }
	    public void print(Set<Integer> intSet) { }*/
	public static void main(String[] args) {
		Favorites f = new Favorites();

		//f.putFavorite(java.lang.Object.class, "Java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(String.class, "String");
		//f.putFavorite(Class.class, Favorites.class);
		//Object favoriteString = f.getFavorite(java.lang.Object.class);
		//int favoriteInteger = f.getFavorite(Integer.class);
		//Class<?> favoriteClass = f.getFavorite(Class.class);
		//System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());

	}

}

// Typesafe heterogeneous container pattern - implementation
class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		if (type == null)
			throw new NullPointerException("Type is null");
		// favorites.put(type, instance);
		 //favorites.put(type, type.cast(instance));
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}
}