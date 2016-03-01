package com.izea;

import com.izea.stringreverse.controller.StringController;
import com.izea.stringreverse.service.StringService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by dvelma on 2/26/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class StringTest {
    @Mock
    StringService stringService;
    @InjectMocks
    StringController stringController = new StringController();
    MockMvc mockMvc;
    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(StringTest.class);

        mockMvc = MockMvcBuilders.standaloneSetup(stringController).build();

    }


    @Test
    public void reverse() throws Exception {
        this.mockMvc.perform(get("/izea/reverse")).
                andExpect(status().isOk()).andDo(print());
    }
}
