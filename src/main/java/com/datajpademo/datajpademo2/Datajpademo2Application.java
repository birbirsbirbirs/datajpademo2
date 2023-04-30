package com.datajpademo.datajpademo2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@OpenAPIDefinition(
        servers = {
				@Server(url = "/",description = "Default Server URL")
        }
)
@SpringBootApplication
public class Datajpademo2Application {
    public static List<Integer> list=new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Datajpademo2Application.class, args);
    }

}
