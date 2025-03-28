package com.bantvegas.aidocspro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OcrBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcrBackendApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping() {
        return "OCR backend is alive!";
    }
}
