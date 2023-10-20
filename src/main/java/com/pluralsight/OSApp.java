package com.pluralsight; // Java Class B
import java.io.*;
import java.util.*;

public class OSApp {
    public static void main(String[] args) {
        List<Products> chest = new ArrayList<>();
        LoadingChest.chestLoad(chest);
        UserInterface userInter = new UserIterface();
        userInter.start();
    }
}
class userInter {
    private List<Products> chest;
    public userInter(List<Products> chest)
}