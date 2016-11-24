package org.formation.Respiration;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class RespireImplTest {

	@Test
	public void branchieIfPoisson() {
		RespiratorySystem resp = new RespiratorySystemImpl();
		Assert.assertEquals("branchies", resp.respiratorySys("poisson"));
	}
	@Test
	public void poumonIfChien() {
		RespiratorySystem resp = new RespiratorySystemImpl();
		Assert.assertEquals("poumons", resp.respiratorySys("chien"));
	}
}
