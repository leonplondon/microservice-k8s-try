package pro.darkgod.bar.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BarController.class)
class BarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkHealth() throws Exception {
        mockMvc
            .perform(
                get("/api/v1/echo")
                    .accept(MediaType.ALL)
            )
            .andExpect(status().isOk())
            .andExpect(content().string(BarController.class.getSimpleName()));
    }

}