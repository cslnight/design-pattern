package com.cslnight.factory.factorymethod;

import com.cslnight.factory.ICourse;

/**
 * 工厂模型
 * 提供一个用于创建对象的接口(工厂接口)，让其实现类(工厂实现类)决定实例化哪一个类(产品类)，
 * 并且由该实现类创建对应类的实例。
 *
 * 提供一个产品类的接口。产品类均要实现这个接口(也可以是abstract类，即抽象产品)。
 * 提供一个工厂类的接口。工厂类均要实现这个接口(即抽象工厂)。
 * 由工厂实现类创建产品类的实例。工厂实现类应有一个方法，用来实例化产品类。
 *
 * Created by Tom.
 */
public interface ICourseFactory {

    ICourse create();

}
