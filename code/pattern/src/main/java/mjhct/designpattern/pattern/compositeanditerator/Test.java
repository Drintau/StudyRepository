package mjhct.designpattern.pattern.compositeanditerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 组合模式 + 迭代器模式
 * 使用案例
 */

interface MenuComponentIterator {
    boolean hasNext();

    MenuComponent next();
}

/**
 * 菜单组件
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
    public MenuComponentIterator iterator() {
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

    public MenuComponentIterator iterator() {
        return new MenuIterator(menuItems.iterator());
    }

    private static class MenuIterator implements MenuComponentIterator {

        private final Stack<Iterator<MenuComponent>> s = new Stack<>();

        public MenuIterator(Iterator<MenuComponent> itr) {
            s.push(itr);
        }

        @Override
        public boolean hasNext() {
            if (s.isEmpty()){
                return false;
            } else {
                Iterator<MenuComponent> it = s.peek();
                if (!it.hasNext()) {
                    s.pop();
                    return hasNext();
                } else {
                    return true;
                }
            }
        }

        @Override
        public MenuComponent next() {
            Iterator<MenuComponent> it = s.peek();
            MenuComponent mc = it.next();

            if (mc instanceof Menu) {
                s.push(mc.getMenuItems().iterator());
            }

            return mc;
        }
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

        MenuComponentIterator iterator = menu.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = iterator.next();
            next.print();
        }
    }
}


/*
1、如果要让客户端不知道Menu、MenuItem类，使用工厂模式。解耦。
 */
