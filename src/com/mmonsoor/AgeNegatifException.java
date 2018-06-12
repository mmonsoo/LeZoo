package com.mmonsoor;

@SuppressWarnings("serial")
public class AgeNegatifException extends Exception {
	public AgeNegatifException() {
		super("Un animal ne peut pas avoir un âge négatif");
		// TODO Auto-generated constructor stub
	}
}
