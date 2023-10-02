package ru.mirea.lab4.Task3;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String login;
    private String password;
    private static int sum = 0;
    private static HashMap<Good, Integer> bas = new HashMap<>();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public HashMap<Good, Integer> getBas() {
        return bas;
    }

    public User setBas(HashMap<Good, Integer> bas) {
        this.bas = bas;
        return this;
    }
    public static void add(Good g){
        var key = bas.get(g);
        if(key == null){
            bas.put(g,1);
            sum += g.getCost();
        }
        else{
            bas.put(g,bas.get(g) + 1);
            sum += g.getCost();
        }
    }

    public static int getSum() {
        return sum;
    }
}
