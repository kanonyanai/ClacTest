package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.demo.Calc;

public class CalcTest {
	static Calc calc = null;
	@BeforeAll
	static void テスト前処理() {
	    calc = new Calc();
	}
	@Test
	void addテスト_正常() {
	    assertEquals(calc.add(1, 3), 4);
	    assertThat(calc.add(1, 3)).isEqualTo(4);
	    assertEquals(calc.sub(4, 1), 3);
	    assertThat(calc.sub(4, 1)).isEqualTo(3);
	    assertEquals(calc.div(10, 2), 5);
	    assertThat(calc.div(10, 2)).isEqualTo(5);
	    assertEquals(calc.mul(3, 3), 9);
	    assertThat(calc.mul(3, 3)).isEqualTo(9);
	    
	    
	}
	@AfterAll
	static void テスト後処理() {
	    calc = null;
	}

}
