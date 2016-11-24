package org.formation.Respiration;

public class RespiratorySystemImpl implements RespiratorySystem{
	private static final String CHIEN="chien";
	private static final String POISSON="poisson";
	
		public String respiratorySys(String animal) {
			if(CHIEN.equalsIgnoreCase(animal)){
				return "poumons";
			}else if(POISSON.equalsIgnoreCase(animal)){
				return "branchies";
			}else{
		return "nsp";
			}
	}

}
