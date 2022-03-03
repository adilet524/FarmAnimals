package com.company;

public abstract class AbstractAnimal {
    private String nickName;
    private byte age;
    private double weight;
    private String gender;

    public AbstractAnimal() {
    }

    public AbstractAnimal(String nickName, byte age, double weight, String gender) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "\nNickName = " + nickName +
                ",  Age = " + age +
                ",  Weight = " + weight +
                ",  Gender = " + gender;
    }
}
