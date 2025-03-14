

public class single{
    public static void main(String[] args){
        child obj=new child();
        obj.display();


    }
    }

    class parent{
        public void add(){
            System.out.println("Hello world");
        }


    }
    class child extends parent{
        void display(){
            add();
        }
    }
