package com.example.bot.spring;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.google.common.io.ByteStreams;

import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.FollowEvent;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.MessageContent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.LineBotMessages;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import com.example.bot.spring.DatabaseEngine;
import com.example.bot.spring.SQLDatabaseEngine;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = { KitchenSinkTester.class, SQLDatabaseEngine.class})
public class KitchenSinkTester {
	@Autowired
	//private DatabaseEngine databaseEngine;
	private SQLDatabaseEngine sqldatabaseEngine;
	/*
	@Test
	public void SQLTest() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.sqldatabaseEngine.search("Soybean");
		}catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("");
		
	}
	
	@Test
	public void SQLTest2() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.sqldatabaseEngine.search("Do you know how to use Line?");
		}catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("Kind of");
		
	}
	
	@Test
	public void SQLTest3() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.sqldatabaseEngine.search("Who made you?");
		}catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("cnlauab");
		
	}
	
	@Test
	public void SQLTest4() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.sqldatabaseEngine.search("Are you hungry?");
		}catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("No");
		
	}
	
	@Test
	public void SQLTest5() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.sqldatabaseEngine.search("You are handsome");
		}catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("Thanks");
		
	}*/
	
	@Test
	public void testNotFound() throws Exception {
		boolean thrown = false;
		try {
			this.sqldatabaseEngine.search("no", "nutrient_info", "testing_user_id");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(thrown).isEqualTo(false);
	}
	/**
	@Test
	public void testFound() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.databaseEngine.search("abc");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("def");
	}
	
	@Test
	public void testFound2() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.databaseEngine.search("Hi");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("Hey, how things going?");
	}
	
	@Test
	public void testFound3() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.databaseEngine.search("I am fine");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("Great!");
	}
	
	@Test
	public void testFound4() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.databaseEngine.search("Who is Prof Kim");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("Well, this is your instructor.");
	}
	
	@Test
	public void testFound5() throws Exception {
		boolean thrown = false;
		String result = null;
		try {
			result = this.databaseEngine.search("How is the grade of this course?");
		} catch (Exception e) {
			thrown = true;
		}
		assertThat(!thrown).isEqualTo(true);
		assertThat(result).isEqualTo("This is absolute good grade for good student. And I am sure you are!");
	}**/
	
}