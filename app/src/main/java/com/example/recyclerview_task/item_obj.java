package com.example.recyclerview_task;

public class item_obj {

   private String name ;
   private int image ;
   private String age ;
   private String career ;
   private String experience ;

    public item_obj() {
    }

    public item_obj(String name, int image, String age, String career, String experience) {
        this.name = name;
        this.image = image;
        this.age = age;
        this.career = career;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


}
