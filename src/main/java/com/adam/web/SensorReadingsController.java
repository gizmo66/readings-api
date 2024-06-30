package com.adam.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Controller
public class SensorReadingsController {

    @PostMapping("/add-reading")
    @ResponseStatus(HttpStatus.OK)
    public void addReading(@RequestBody ReadingDTO readingDTO)
            throws IOException {
        FileWriter fw = new FileWriter(readingDTO.getPath(), true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            var row = readingDTO.getRow();
            System.out.println(row);
            bw.write(row);
            bw.newLine();
        }
    }

}
