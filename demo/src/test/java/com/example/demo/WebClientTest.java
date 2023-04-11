package com.example.demo;

//public class WebClientTest {
//}
//public class WebClintTestCase {
//}
//package com.example.demo;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.test.web.reactive.server.WebTestClient;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RunWith(SpringRunner.class)
public class WebClientTest {
    private WebClient webClient = WebClient.create("Http://localhost:8084");
    UserModel userModel1 = new UserModel("upg", "10", "ramgarh");
    UserModel userModel2=new UserModel("sanvy","125","bihar");
    UserModel userModel3=new UserModel("sanvy","bihar");
    @MockBean
    UserRepository userRepository;

    @Test
    public void createTest() {

        UserModel user = webClient
                .post()
                .uri("/createData")
                .syncBody(userModel1)
                .retrieve()
                .bodyToMono(UserModel.class)
                .block();

        assertEquals(userModel1, user);

    }

    @Test
    public void getByIdTest() {
        UserModel userData = webClient
                .get()
                .uri("/getData/{userId}", "100")
                .retrieve()
                .bodyToMono(UserModel.class)
                .block();
        assertEquals("100", userData.getUserId());

    }



@Test
    public void updateTest(){
        UserModel updatedUser=webClient
            .put()
            .uri("/updateData/{userId}","100")
                .syncBody(userModel3)
            .retrieve()
            .bodyToMono(UserModel.class).block();

        assertNotEquals(updatedUser,userModel1);

    }
    @Test
    public void deleteTest(){
        String data=webClient
                .delete()
                .uri("/deleteData/{userId}","125")
                .retrieve()
                .bodyToMono(String.class).block();

        assertEquals("success",data);


    }


}