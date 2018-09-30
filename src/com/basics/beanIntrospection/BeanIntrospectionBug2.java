package com.basics.beanIntrospection;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Arrays;

public class BeanIntrospectionBug2 {

	public static void main(String[] args) throws IntrospectionException {

		final BeanInfo bi = Introspector.getBeanInfo(Descendant.class);
		final PropertyDescriptor[] pds = bi.getPropertyDescriptors();
		for (PropertyDescriptor p : pds) {
			System.out.println(p.getName() + ":");
			if (p.getReadMethod() != null) {
				info(p.getReadMethod());
			}
			if (p.getWriteMethod() != null) {
				info(p.getWriteMethod());
			}
		}
	}

	public static void info(Method m) {
		System.out.println(m.getDeclaringClass().getName() + "." + m.getName());
		System.out.println(Arrays.toString(m.getAnnotations()));
		System.out.println(Arrays.toString(m.getDeclaringClass().getAnnotations()));
	}

}

class Descendant extends Ancestor {

}

class Descendant2  {

}


@Test
class Ancestor {

	private String a;

	@Test
	public String getA() {
		return a;
	}

	@Test
	public void setA(String a) {
		this.a = a;
	}
}
