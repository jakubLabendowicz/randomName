package pl.jakublabendowicz.randomName;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Random;

@Data
public class Name {
    public String[] name = {"", ""};

    public Name() {
        Random random = new Random();
        String[] names = {"Kuba Ł.", "Weronika R.", "Kuba K.", "Bartosz R."};
        int[] numbers = {random.nextInt(4), random.nextInt(4)};

        while (numbers[0] == numbers[1]) {
            numbers[1] = random.nextInt(4);
        }
        this.name[0] = names[numbers[0]];
        this.name[1] = names[numbers[1]];
    }
}
