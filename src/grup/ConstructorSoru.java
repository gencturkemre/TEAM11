package grup;

public class ConstructorSoru {
    public class constructorSoru {
        String isim = "John Doe";
        int age = 25;
        public constructorSoru()
        {
            System.out.println("İsim = " + isim);
            isim="Yasir";
        }
        public constructorSoru(String isim, int age)
        {
            this.isim=isim;
            age=30;
        }
        public constructorSoru(String isim)
        {
            isim="Berker";
            age=age;
        }

        public void main(String[] args) {
            constructorSoru ornek1 = new constructorSoru();
            constructorSoru ornek2 = new constructorSoru("İlhan",50);
            constructorSoru ornek3 = new constructorSoru("Hasan");

            System.out.println("İsim = " + ornek2.isim);
            System.out.println("İsim = " + ornek3.isim);
            System.out.println("Yaş = " + ornek2.age);

        } } }