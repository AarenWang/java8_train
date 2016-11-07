package me.wrj.java8.language.lambdaexpressions;

/**
 * 
 * @author 数列求和
 *
 */
public class RangeSumDemo {
	
	
	
	public static void main(String[] args) {
		RangeSum rangeSum = new RangeSumImpl();
		long sum1 = rangeSum.rangeSum(1, 100, new CalcFunctor(){
			@Override
			public long calc(long num) {
				return num * num;
			}
		});
		System.out.println(sum1);
		
		long sum2 = rangeSum.rangeSum(1,100,  n -> n * n);
		System.out.println(sum2);
		
	}

}


/**
 *  数列求和
 * @author 
 *
 */

/**
 * 数字运算函数接口
 * @author 
 *
 */
interface CalcFunctor{
	public long calc(long num);
}

/**
 * 数列求和接口定义
 * @author 
 *
 */
interface RangeSum{
	/**
	 * 
	 * @param begin
	 * @param end
	 * @param calc
	 * @return
	 */
	public long rangeSum(long begin,long end,CalcFunctor calc);
}


class RangeSumImpl implements RangeSum{

	@Override
	public long rangeSum(long begin, long end, CalcFunctor calc) {
	    if(end < begin){
	    	return -1;
	    }
	    
	    long sum = 0;
	    for(long i = begin; i <= end; i++){
	    	sum += calc.calc(i);
	    }
	    
		return sum;
	}
	
}




