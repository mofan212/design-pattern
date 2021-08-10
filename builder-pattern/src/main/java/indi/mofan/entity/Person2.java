package indi.mofan.entity;

/**
 * @author mofan 2021/2/3
 */
public class Person2 {
    private String firstName;
    private String lastName;
    private Integer gender;
    private Integer age;
    private Double height;
    private Double weight;
    private String job;

    /**
     * 含有必填属性的构造方法
     */
    public Person2(String firstName, String lastName,
                   Integer gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    /**
     * 可选属性的 Setter 方法
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 可选属性的 Setter 方法
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 可选属性的 Setter 方法
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 可选属性的 Setter 方法
     */
    public void setJob(String job) {
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getJob() {
        return job;
    }
}
