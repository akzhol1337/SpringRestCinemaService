package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

class Code {
    private List<Integer> rgba;
    private String hex;

    Code(){}

    Code(List<Integer> rgba, String hex){
        this.rgba = rgba;
        this.hex = hex;
    }

    public List<Integer> getRgba() {
        return rgba;
    }

    public void setRgba(List<Integer> rgba) {
        this.rgba = rgba;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "Code{" +
                "rgba=" + rgba +
                ", hex='" + hex + '\'' +
                '}';
    }
}

class Color{
    private String color;
    private String category;
    private String type;
    private Code code;

    Color() {
    }

    Color(String color, String category, String type, Code code) {
        this.color = color;
        this.category = category;
        this.type = type;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", code=" + code +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}

@RestController
public class Controller {
    List<Color> colors = List.of(new Color("black", "hue", "primary", new Code(List.of(0, 0, 0, 1), "#000")), new Color("white", "value", "primary", new Code(List.of(255, 255, 255, 1), "#FFF")));
    HashMap<String, List<Color>> mp = new HashMap<String, List<Color>>();
    
    @GetMapping("/colors")
    public HashMap<String, List<Color>> lol(){
        mp.put("colors", colors);
        return mp;
    }
}