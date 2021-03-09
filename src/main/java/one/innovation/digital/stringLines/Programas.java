package one.innovation.digital.stringLines;

import java.util.stream.Collectors;

public class Programas {
    public static void main(String[] args) {
        String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";
        System.out.println(html.lines().map(elemento -> "[TAG] :: "+elemento)
                .filter(elemento -> elemento.contains("head")).collect(Collectors.toList()));
        // Abstrai esta string em um stream de string separados pela quebra de linha
    }
}
