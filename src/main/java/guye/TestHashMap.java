package guye;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 测试
 * @date 2023/7/13 15:22:00
 */
public class TestHashMap {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        myHashMap.put("age", 1);
        myHashMap.put("agea", 2);
        myHashMap.put("ageb", 3);
        myHashMap.put("agec", 4);
        myHashMap.put("aged", 5);
        myHashMap.put("agee", 6);
        myHashMap.put("agef", 7);
        myHashMap.put("ageg", 8);
        myHashMap.put("ageh", 9);
        myHashMap.put("agei", 10);
        myHashMap.put("agej", 11);
        myHashMap.put("agek", 12);
        myHashMap.put("agel", 13);
        myHashMap.put("agem", 14);
        myHashMap.put("agen", 15);
        myHashMap.put("ageo", 16);
        myHashMap.put("agep", 17);
        myHashMap.put("ageq", 18);
        myHashMap.put("ager", 19);
        myHashMap.put("ages", 20);
        myHashMap.put("aget", 21);
        myHashMap.put("ageu", 22);
        myHashMap.put("agev", 23);
        myHashMap.put("agew", 24);
        myHashMap.put("agex", 25);
        myHashMap.put("agey", 26);
        myHashMap.put("agez", 27);
        myHashMap.put("10111", 28);
        myHashMap.put("11001", 29);
        myHashMap.put("10112", 30);
        myHashMap.put("11111", 31);
        myHashMap.put("10100", 32);
        myHashMap.put("00101", 33);
        myHashMap.put("11101", 34);

        //System.out.println(myHashMap);
        System.out.println("10111  =  " + myHashMap.get("10111"));
        System.out.println("11001  =  " + myHashMap.get("11001"));
        System.out.println("10112  =  " + myHashMap.get("10112"));
        System.out.println("11111  =  " + myHashMap.get("11111"));
        System.out.println("10100  =  " + myHashMap.get("10100"));
        System.out.println("00101  =  " + myHashMap.get("00101"));
        System.out.println("11101  =  " + myHashMap.get("11101"));
        String key = "agez";
        System.out.println("我要删除" + key + ",它原来的值是" + myHashMap.get(key));
        System.out.println("删除完成,返回值 :  " + myHashMap.remove(key));
        System.out.println(key + " =  " + myHashMap.get(key));

    }

}
