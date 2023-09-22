package com.oni.product;

public class ArtDecoSofa implements Sofa {
	@Override
	public void sitOn1() {
		System.out.println("Friend number one.");
	}

	@Override
	public void sitOn2() {
		System.out.println("The artist sits here.");
	}

	@Override
	public void sitOn3() {
		System.out.println("Friend number two.");
	}

	@Override
	public String getFurniture() {
		return "Art Deco sofa";
	}

	@Override
	public void use() {
		sitOn1();
		sitOn2();
		sitOn3();
	}
}
