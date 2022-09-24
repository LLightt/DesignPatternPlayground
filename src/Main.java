import DecorativePattern.BigTrouser;
import DecorativePattern.Person;
import DecorativePattern.TShirt;
import ProxyPattern.Pursuit;
import ProxyPattern.PursuitProxy;
import ProxyPattern.SchoolGirl;
import SimpleFactoryPattern.Operation;
import SimpleFactoryPattern.OperationFactory;

public class Main {
    public static void main(String[] args) throws Exception {

        // 简单工厂创建Operation
        Operation oper;
        oper = OperationFactory.createOperate("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);

        // 装饰模式
        Person xc = new Person("xc");
        TShirt tx = new TShirt();
        tx.Decorate(xc);
        BigTrouser bt = new BigTrouser();
        bt.Decorate(tx);
        bt.show();

        // 代理模式
        SchoolGirl jj = new SchoolGirl();
        jj.setName("娇娇");

        PursuitProxy daili = new PursuitProxy(jj);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();

    }
}