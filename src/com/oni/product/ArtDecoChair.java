package com.oni.product;

public class ArtDecoChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sit like an artist.");
	}

	@Override
	public String getFurniture() {
		return "Art Deco chair";
	}

	@Override
	public void use() {
		sitOn();
	}
}
