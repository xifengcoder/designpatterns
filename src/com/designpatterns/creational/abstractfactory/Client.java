package com.designpatterns.creational.abstractfactory;

/**
 * Created by xifeng.yang on 2020/2/4
 */
public class Client {

    private static final String TYPE_ORANGE = "Or";
    private static final String TYPE_APPLE = "Ap";
    private static final String TYPE_MANGO = "Mg";

    public static void main(String[] args) {
        Client client = new Client();
        IFruitsFactory factory = getFruitFactory(TYPE_APPLE);
        if(factory != null) {
            IFruit fruit = factory.getFruit();
            System.out.println("fruit: " + fruit.getFruitsName());
        }
    }

    public static IFruitsFactory getFruitFactory(String type) {
        if (TYPE_ORANGE.equalsIgnoreCase(type)) {
            return new OrangeFactory();
        } else if (TYPE_MANGO.equalsIgnoreCase(type)) {
            return new MangoFactory();
        } else if (TYPE_APPLE.equalsIgnoreCase(type)) {
            return new AppleFactory();
        } else {
            return null;
        }
    }
}
