package indi.mofan.domain.factory.another;

/**
 * @author mofan
 * @date 2024/3/21 18:01
 */
public class FactoryMaker {
    public enum FactoryType {
        ONE, TWO
    }

    public static AbstractFactory makeFactory(FactoryType factoryType) {
        return switch (factoryType) {
            case ONE -> new ConcreteFactory1();
            case TWO -> new ConcreteFactory2();
        };
    }
}
