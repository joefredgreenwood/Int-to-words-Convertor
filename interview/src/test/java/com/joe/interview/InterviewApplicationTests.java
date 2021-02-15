package com.joe.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.joe.interview.task.MoneyToWordsConverter;


@SpringBootTest
class InterviewApplicationTests {

	@Test
	public void testConvertor() {
//		MoneyToWordsConverter m = new MoneyToWordsConverter();
		String test = MoneyToWordsConverter.Convert(712);
		assertEquals("seven pounds and twelve Pence", test);
	}

}
