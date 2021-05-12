package com.kachexiongdi.qkljetpackmvvm.utils;

import com.kachexiongdi.qkljetpackmvvm.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ningchuanqi
 * @version V1.0
 */
public class PersonUtils {
    public static List<Person> get(){
        List<Person> list = new ArrayList<>();
        Person i1 = new Person("斯嘉丽.约翰逊","Scarlett Johansson","https://5b0988e595225.cdn.sohucs.com/images/20190624/d93dbf866aa2405f8b9b1d660c15db9d.jpeg");
        list.add(i1);

        Person i2 = new Person("安吉丽娜·朱莉","Angelina Jolie","https://5b0988e595225.cdn.sohucs.com/images/20190624/0657ccc0066b4e1797ead2b3293230b0.jpeg");
        list.add(i2);

        Person i3 = new Person("杰西卡·辛普森","Jessica Simpson","https://5b0988e595225.cdn.sohucs.com/images/20190624/49c95e9b542a4854b2232e67579b9215.jpeg");
        list.add(i3);

        Person i4 = new Person("萨尔玛·海耶克","Salma Hayek","https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3893590240,2013198505&fm=26&gp=0.jpg");
        list.add(i4);

        Person i5 = new Person("卡门·伊莱克特拉","Carmen Electra","https://5b0988e595225.cdn.sohucs.com/images/20190624/1399d0fda46c467dbd988f2996dccaad.jpeg");
        list.add(i5);

        Person i6 = new Person("凯瑟琳·海格尔","Katherine Heigl","https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20180116%2F74c81a087a28446590734ca257e3eacf.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1618118692&t=6c5c1eecb1b0db8664810bfc51f8609b");
        list.add(i6);

        Person i7 = new Person("珍妮佛·安妮斯顿","Jennifer Aniston","https://5b0988e595225.cdn.sohucs.com/images/20190624/98e8b18a86004eb79bef58318e93446d.jpeg");
        list.add(i7);

        Person i8 = new Person("梅根·福克斯","Megan Fox","https://5b0988e595225.cdn.sohucs.com/images/20190624/37991ee797e6496d99cdee5315082b76.jpeg");
        list.add(i8);

        Person i9 = new Person("杰西卡·阿尔芭","Jessica Alba","https://5b0988e595225.cdn.sohucs.com/images/20190624/eb49bf15b9634d579ff89f596c54e0ca.jpeg");
        list.add(i9);

        Person i10 = new Person("詹妮弗·洛芙·休伊特","Jennifer Love Hewitt","https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=791729948,2390587761&fm=26&gp=0.jpg");
        list.add(i10);

        return list;
    }
}
