package com.github.knight76.config.configserver;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigServerApplicationTests {

	@Test
	public void test() {
		StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
		standardPBEStringEncryptor.setAlgorithm(JasyptConfig.ALGORITHM);
		standardPBEStringEncryptor.setPassword(JasyptConfig.KEY);

		String enc = standardPBEStringEncryptor.encrypt("비밀번호");
		System.out.println("enc = " + enc);

		String des = standardPBEStringEncryptor.decrypt(enc);
		System.out.println("des = " + des);
	}
}
