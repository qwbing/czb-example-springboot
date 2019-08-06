package com.example.czbexamplespringboot;

import com.example.czbexamplespringboot.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CzbExampleSpringbootApplicationTests {

	@Autowired
	RedisUtil redisUtil;

	@Test
	public void redisTest() {
		String key = "2323";
		Object value = "name123";
		redisUtil.set(key,value);
	}

//	@Test
//	public void contextLoads() {
//	}

}
