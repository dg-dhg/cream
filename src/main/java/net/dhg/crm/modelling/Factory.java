package net.dhg.crm.modelling;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Factory {
    private List<Phone> phoneList=new ArrayList<>();
    public static void main(String[] args) {
        //生产
        Factory factory=new Factory();
        List<Phone> list=factory.getPhoneList();
        list.add(factory.makePhone("MiPhone"));
        list.add(factory.makePhone("IPhone"));

        //进货
        PhoneSeller seller=new PhoneSeller();
        seller.add(list);

        //卖出
        seller.sell();


    }

    public Phone makePhone(String phoneType) {
        //写一个判断类型的方法
        if (phoneType.equals("MiPhone")) {
            return new MiPhone();
        } else {
            return new IPhone();
        }
    }

}

@Data
class PhoneSeller {
    List<Phone> phoneList=new ArrayList<>();
    void add(List<Phone> list){
        phoneList=list;
    }
    void sell() {
        Iterator<Phone> itr=phoneList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}
@ToString
abstract class Phone {
    String phoneType;
}
@ToString
class IPhone extends Phone {
    String phoneType="IPhone";
    IPhone() {
        System.out.println(String.format("making %s", phoneType));
    }
}
@ToString
class MiPhone extends Phone {
    String phoneType="MiPhone";
    //a初始化的方法
    MiPhone() {
        System.out.println(String.format("making %s", phoneType));
    }
}
