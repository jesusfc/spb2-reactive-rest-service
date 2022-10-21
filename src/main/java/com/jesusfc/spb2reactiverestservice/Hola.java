package com.jesusfc.spb2reactiverestservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hola {
    private String message;

    @Override
    public String toString() {
        return "Hola {message='" + message + "'}";
    }
}
