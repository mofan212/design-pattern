package indi.mofan.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @author mofan 2021/2/3
 */
@Builder(builderMethodName = "hiddenBuilder")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Animal {
    private final String name;
    private final String type;
    private final Integer age;
    private final Integer gender;

    public static AnimalBuilder builder(String type) {
        return hiddenBuilder().type(type);
    }
}
