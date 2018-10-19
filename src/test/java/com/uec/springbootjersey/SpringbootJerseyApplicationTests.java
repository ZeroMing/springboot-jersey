package com.uec.springbootjersey;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJerseyApplicationTests {


    @Test
    public void contextLoads() {

        Map<String,Object> data = new HashMap<>();
        data.put("grant_type","client_credentials");
        data.put("client_id","YXA6wDs-MARqEeSO0VcBzaqg5A");
        data.put("client_secret","YXA6JOMWlLap_YbI_ucz77j-4-mI0JA");
        Client client = ClientBuilder.newClient();
        WebTarget base = client.target("https://a1.easemob.com/");
        WebTarget details = base.path("/easemob-playground/test1/token");
        Response post = details.request(MediaType.APPLICATION_JSON).post(Entity.entity(data, MediaType.APPLICATION_JSON_TYPE));

        Map map = post.readEntity(Map.class);

        System.out.println(map);


    }

}
