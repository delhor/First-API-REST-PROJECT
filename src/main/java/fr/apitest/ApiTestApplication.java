package fr.apitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }
}


/*package fr.apitest;
public class ApiTestApplication {
    private final long id;
    private final String content;
    public ApiTestApplication(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public long GetId() {
        return id;
    }
    public String GetContent() {
        return content;
    }
}*/
