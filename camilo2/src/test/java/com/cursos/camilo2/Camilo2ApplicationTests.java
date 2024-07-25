package com.cursos.camilo2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultHandler;
@AutoConfigureMockMvc
@SpringBootTest

class Camilo2ApplicationTests {
	@Autowired
	MockMvc mock;
	@Test
	void testCursos()throws Exception{

		mock.perform(get("/curso")).andDo(print());
	}
	private ResultHandler print() {
		throw new UnsupportedOperationException("Unimplemented method 'print'");
	}
	private RequestBuilder get(String string) {
		
		throw new UnsupportedOperationException("Unimplemented method 'get'");
	}
}
