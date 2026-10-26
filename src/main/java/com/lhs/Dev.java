package com.lhs;


public class Dev {
    private Computer com ;
    private int age ;

    //defult Constructer
    public Dev(){
        System.out.println("I am a devloper");
    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        System.out.println("Now I am Working on Spring Boot");
        com.compile();;

    }
}
