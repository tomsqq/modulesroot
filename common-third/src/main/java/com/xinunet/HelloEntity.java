package com.xinunet;

/**
 * Created by sunqingqing on 15/8/6.
 */
public class HelloEntity {

    private String id;
    private String name;
    private String gender;

    public HelloEntity() {
    }

    @Override
    public String toString() {
        return "HelloEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public HelloEntity(String id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
