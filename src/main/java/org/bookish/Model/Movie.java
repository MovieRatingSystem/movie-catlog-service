package org.bookish.Model;

public class Movie {
    private Integer id;
    private String name;
    private String desc;

    public Movie() {
    }

    public Movie(Integer id, String name, String desc) {
        this.name = name;
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
