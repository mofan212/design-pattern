package indi.mofan.entity;

/**
 * @author mofan 2021/2/3
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer gender;
    private Integer age;
    private Double height;
    private Double weight;
    private String job;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.job = builder.job;
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

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer gender;
        private Integer age;
        private Double height;
        private Double weight;
        private String job;

        public Builder(String firstName, String lastName, Integer gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(Double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
