class  TestClass{
    public static void main(String[] args) {
     Singleton s1 = Singleton.getInstance();
     Singleton s2 = Singleton.getInstance();
     print("s1", s1);
     print("s2", s2);


    }

    static void print(String name, Singleton object) {
        Object hashcode;
        System.out.println(String.format("Object : %s, Hashcode: %d", name,object.hashCode())); 
    }
}
