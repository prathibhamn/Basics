package com.basics.beanIntrospection;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class BeanIntrospectionBug {

	public static void main(String[] args) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(Sub.class);
		
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		
		for (PropertyDescriptor prop : propertyDescriptors) {
			System.out.printf("%s of type %s\n", prop.getName(), prop.getPropertyType());
		}
	}


}

class Super<T> {
	public T getFoo() {return null;}
	public void setFoo(T t) {}
}

class Sub extends Super<String> {
}

