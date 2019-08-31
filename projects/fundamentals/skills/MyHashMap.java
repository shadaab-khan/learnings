import java.util.HashMap;
import java.util.Map;

public class MyHashMap extends HashMap {

    static class Employee {

        int slno;
        String name;

        public int getSlno() {
            return slno;
        }

        public void setSlno(int slno) {
            this.slno = slno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

     private Employee(int slno, String name){

            this.slno = slno;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Sam");
        Employee e2 = new Employee(1,"Jon");
        Map<Employee, String> m1 = new HashMap<>();
        Map<Employee, String> m2 = new HashMap<>();

//        e1.setSlno(1);
//        e1.setName("Sam");
//
//        e2.setSlno(1);
//        e2.setName("Jon");

        m1.put(e1, e1.slno +", "+ e1.name);
        m2.put(e2, e2.slno +", "+ e2.name);

        System.out.println("Value in Map 1 : " + m1.values());
        System.out.println("Value in Map 2 : " + m2.values());
    }
}
