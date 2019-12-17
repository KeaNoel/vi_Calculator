//运算类
public class Operator{
  //定义一个sun方法，接受用户输入的数进行逻辑判断	 
  double sum(double numOne,double numTwo,String operator){
  //定义变量并初始化值为0 
  double num = 0;
   //根据用户输入的运算符进行判断(equals判断字符串的方法)
   //如果输入是+则做加法运算	
   if(operator.equals("+")){
       num = numOne + numTwo;
   }else if(operator.equals("-")){
   //如果输入是-则做减法运算	
       num = numOne -numTwo;
   }else if(operator.equals("*")){
   //如果输入是*则做乘法运算	
       num = numOne * numTwo;
   }else if (operator.equals("/")){
   //如果输入是/则做除法运算	
       num = numOne / numTwo;
   }else{
       num = -999999999;	
   }
   //运算之后返回num
       return num;		
  }
}
