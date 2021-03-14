package mjhct.designpattern.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 */

/*
  举例树状结构
  菜单
   |--陕菜
     |--三秦套餐
     |--羊肉类
       |--羊肉泡馍
       |--水盆羊肉
   |--粤菜
     |--烧腊类
       |--烧鸭
       |--烧鸡
     |--煲汤类
       |--莲子汤
       |--山药汤
*/

abstract class MenuComponent {

    private String name;

    private String description;

    public MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 菜单具有的方法
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public List<MenuComponent> getMenuItems() {
        throw new UnsupportedOperationException();
    }

    // 菜单项具有的方法
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}

class Menu extends MenuComponent {

    private List<MenuComponent> menuItems;

    public Menu(String name, String description) {
        super(name, description);
        menuItems = new ArrayList<>(16);
    }

    @Override
    public List<MenuComponent> getMenuItems() {
        return menuItems;
    }

    @Override
    public void print() {
        System.out.println("《" + getName() + "》" + getDescription());
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuItems.add(menuComponent);
    }
}

class MenuItem extends MenuComponent {

    // 素食的
    private boolean vegetarian;

    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        super(name, description);
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(getName()+":"+getDescription());
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

//=========================================================

public class Test {
    public static void main(String[] args) {
        MenuComponent menu = new Menu("菜单", "菜单");
        MenuComponent menu1 = new Menu("陕菜", "陕菜");
        MenuComponent menu2 = new Menu("粤菜", "粤菜");

        MenuComponent mi11 = new MenuItem("三秦套餐", "三秦套餐", false, 10.0);
        MenuComponent menu12 = new Menu("羊肉类", "羊肉类");
        MenuComponent mi121 = new MenuItem("羊肉泡馍", "羊肉泡馍", false, 15.0);
        MenuComponent mi122 = new MenuItem("水盆羊肉", "水盆羊肉", false, 20.0);
        menu1.add(mi11);
        menu12.add(mi121);
        menu12.add(mi122);
        menu1.add(menu12);

        MenuComponent menu21 = new Menu("烧腊类", "烧腊类");
        MenuComponent mi211 = new MenuItem("烧鸭", "烧鸭", false, 15.0);
        MenuComponent mi212 = new MenuItem("炒花生", "炒花生", true, 6.0);
        MenuComponent menu22 = new Menu("煲汤类", "煲汤类");
        MenuComponent mi221 = new MenuItem("莲子汤", "莲子汤", true, 20.0);
        MenuComponent mi222 = new MenuItem("鱼头豆腐汤", "鱼头豆腐汤", false, 30.0);
        menu21.add(mi211);
        menu21.add(mi212);
        menu22.add(mi221);
        menu22.add(mi222);
        menu2.add(menu21);
        menu2.add(menu22);

        menu.add(menu1);
        menu.add(menu2);


//        menu.print();
        printMenu(menu, "");
    }

    static void printMenu(MenuComponent menuComponent, String prefix){
        System.out.print(prefix);
        menuComponent.print();
        try {
            List<MenuComponent> menuItems = menuComponent.getMenuItems();
            for (MenuComponent menuItem : menuItems) {
                printMenu(menuItem, "\t" + prefix);
            }
        } catch (Exception e){
            // 吞异常
        }

    }
}


/*
1、如果要让客户端不知道Menu、MenuItem类，使用工厂模式。解耦。
2、要想客户端不自己写逻辑就能打印完整菜单，使用迭代器模式，屏蔽递归过程。
 */
