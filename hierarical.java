public class hierarical {
    
        public static void main(String[] args){
            child2 obj=new child2();
            obj.print();
            child obj1=new child();
            obj1.display();
    
    
        }
    }
        
    
        class parent{
            public void add(){
                System.out.println("this is parents class");
            }
    
    
        }
        class child extends parent{
            void display(){
                add();
            }
        }
    
        class child2 extends parent{
            void print(){
                add();
            }
        }
    
    
        
    
    

