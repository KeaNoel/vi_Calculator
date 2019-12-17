import java.util.*;
//数字类（接受用户输入的数）
public class Numes{


  //定义一个boolean 类型的方法
  boolean nums() {
     //提示信息
     System.out.print("请输入第一个数：");
        Scanner scanner = new Scanner(System.in);//接受用户输入
        String one = scanner.nextLine();//定义一个变量one接收输入的下一行
        double numOne = Double.valueOf(one);//保存用户输入的值到numOne变量中


	/*让用户选择指定的运算符*/	
	System.out.println("目前提供运算符：+  -  *  /");
        System.out.print("请选择指定运算符：");
        String operator = scanner.nextLine();//定义opearator变量保存用户选择的运算符
        try {
		//如果用户输入的的运算符不是+  -  *  /  的话抛出异常并打印异常信息
            if("+".equals(operator)==false&&"-".equals(operator)==false&&"*".equals(operator)==false&&"/".equals(operator)==false){
	    throw new OperatorException("运算符异常"); //自定义异常
           }
        }catch(OperatorException e){
	   e.printStackTrace();	
        } 
        System.out.print("请输入第二个数：");//提示信息
        double numTwo = Double.valueOf(scanner.nextLine());//保存用户输入的第二个数
       
        double num = new Operator().sum(numOne,numTwo,operator);//调用Operator类中的sun获取num值
          
        if(num == -999999999){      
            System.out.println("超出数值范围");//提示信息
        }else {
            System.out.println("计算出的结果为："+num);//运算出结果并打印
        }
 	System.out.print("是否继续操作该计算器YES/NO：");//提示信息
        String message = scanner.nextLine();//定义一个String 类型的 message变量
        if("YES".equals(message) || "yes".equals(message)){ //如果用户输入的YES(大小写)都可以，重复调用Main里的方法
            return true;
        }else {
            return false;
	  
      }
  }
}
