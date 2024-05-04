package org.springframework.demo.common;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class AbstracteDemo {


	@Lookup
	public void info(){
		System.out.println("this is acstract method");
	}
}
