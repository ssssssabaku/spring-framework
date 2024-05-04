package org.springframework.demo.common;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * 使用代理
 */
@Scope(scopeName = "singleton",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class ScopeProxyDemo {

	public void info(){
		System.out.println("this is ScopeProxyDemo info() ");
	}
}
