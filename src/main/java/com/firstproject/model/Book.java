package com.firstproject.model;

public class Book {
    private  int id;
    private String userid;
    private String name;
    private String title;
    private String price;
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +

                ", price='" + price + '\'' +


                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
