
package inheritancelesson;


public class InheritanceLesson {

    public static void main(String[] args) {
        
    }
    
    public String getBankName(){
        return InterfaceBankAccount.BANK;//this access a static field
    }
    
}
