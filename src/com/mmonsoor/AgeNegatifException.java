package com.mmonsoor;

@SuppressWarnings("serial")
public class AgeNegatifException extends Exception {
	public AgeNegatifException() {
		super("Un animal ne peut pas avoir un �ge n�gatif");
		// TODO Auto-generated constructor stub
	}
}
