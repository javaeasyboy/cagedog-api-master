package com.lishiqian.cagedoginterface;

import com.lishiqian.cagedogclientsdk.client.CageDogClient;
import com.lishiqian.cagedogclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CageDogInterfaceApplicationTests {
//
	@Resource
	private CageDogClient client;

	@Test
	void contextLoads() {
//		client.getNameByGet("lsq");
//		User user = new User();
//		user.setUsername("lwl");
//		String userNameByGet = client.getUserNameByPOST(user);
//		System.out.println(userNameByGet);
//		System.out.println(1);
	}

}
