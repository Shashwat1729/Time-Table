package com.example.time_table;

public class sat {
    private String sub;
    private String room;
    private String time;
    public sat(String a,String b,String c){
        sub = a;
        room = b;
        time  = c;
    }
    public String givsub(){
        return sub;
    }public String givroom(){
        return room;
    }public String givtime(){
        return time;
    }
}
