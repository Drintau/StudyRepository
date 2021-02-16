package mjhct.designpattern.pattern.prototype;

import java.io.*;
import java.util.Date;

public class DeepClone implements Cloneable, Serializable {

    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DeepClone{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public Object clone() {
        try {
            // 对象写到内存
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();

            // 从内存中取数据
            byte[] bytes = bos.toByteArray();

            ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object cloneObj = ois.readObject();
            ois.close();
            return cloneObj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone();
        deepClone.setName("张三");
        deepClone.setBirthday(new Date());

        DeepClone cloneObj = (DeepClone) deepClone.clone();
        System.out.println(deepClone);
        System.out.println(cloneObj);

        cloneObj.getBirthday().setTime(0);
        System.out.println(deepClone);
        System.out.println(cloneObj);

    }
}
